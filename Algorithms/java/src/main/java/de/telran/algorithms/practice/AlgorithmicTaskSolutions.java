package de.telran.algorithms.practice;

public class AlgorithmicTaskSolutions {
    public static void main(String[] args) {

        int[][] grid = new int[][]{
                {9, 9, 8, 1},
                {5, 6, 2, 6},
                {8, 2, 6, 4},
                {6, 2, 2, 2},
        };

        int[][] maxLocal = largestLocal(grid);

        for (int[] row : maxLocal) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

//        ==============================

        int[] prices = {2, 3, 5, 6};
        int money = 8;
        int minLeftover = buyChoco(prices, money);
        System.out.println(minLeftover);

//        ===============================

        int[][] points = {{8, 7}, {9, 9}, {7, 4}, {9, 7}};
        System.out.println(maxWidthOfVerticalArea(points));

    }

//You are given an n x n integer matrix grid.
//Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:
//maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
//In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.
//Return the generated matrix.

    public static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n - 2][n - 2];

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                int max = Integer.MIN_VALUE;
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        max = Math.max(max, grid[k][l]);
                    }
                }
                maxLocal[i - 1][j - 1] = max;
            }
        }
        return maxLocal;

    }


    public static int buyChoco(int[] prices, int money) {
        int minLeftover = money;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int total = prices[i] + prices[j];

                if (total <= money) {
                    int leftover = money - total;

                    minLeftover = Math.min(minLeftover, leftover);
                }
            }
        }

        return minLeftover;
    }


//    Given n points on a 2D plane where points[i] = [xi, yi],
//    Return the widest vertical area between two points such that no points are inside the area.
//    A vertical area is an area of fixed-width extending infinitely along the y-axis (i.e., infinite height).
//    The widest vertical area is the one with the maximum width.
//    Note that points on the edge of a vertical area are not considered included in the area.

    public static int maxWidthOfVerticalArea(int[][] points) {
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = 0; j < points.length - i - 1; j++) {
                if (points[j][0] > points[j + 1][0]) {

                    int[] temp = points[j];
                    points[j] = points[j + 1];
                    points[j + 1] = temp;
                }
            }
        }

        int maxWidth = 0;
        for (int i = 1; i < points.length; i++) {
            maxWidth = Math.max(maxWidth, points[i][0] - points[i - 1][0]);
        }
        return maxWidth;
    }
}
