package de.telran.algorithms.leetcodeTaskSolutions.tasks;

public class TreeNode {

    int val;

    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        this.val = x;
    }

    TreeNode(int a, TreeNode b, TreeNode c) {
        this.val = a;
        this.left = b;
        this.right = c;
    }
}

class Solution{

    private static int maxDepth(TreeNode root) {

        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    private static boolean isSame(TreeNode p, TreeNode q) {

     if (p == null && q == null) return true;
     if (p == null || q == null) return false;
     if (p.val != q.val) return false;

     return isSame(p.left, q.left) && isSame(p.right, q.right);
    }

    private static TreeNode invertTree(TreeNode root){
        if (root == null) return null;

        TreeNode left = invertTree(root.left);

        root.left = invertTree(root.right);
        root.right = left;

        return root;
    }

    private static boolean hasPathSum(TreeNode root, int targetSum){

        if (root == null) return false;
        if (root.left == null && root.right == null){
            return targetSum == root.val;
        }

        int newTargetSum = targetSum - root.val;

        return hasPathSum(root.left, newTargetSum) || hasPathSum(root.right, newTargetSum);
    }

    private static int count(TreeNode root){
        if (root == null) return 0;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if (leftHeight == rightHeight){
            return (1 << leftHeight) + count(root.right);
        }else {
            return (1 << rightHeight) + count(root.left);
        }
    }

    private static int getHeight(TreeNode root){
        int height = 0;

        while (root != null){
            height++;
            root = root.left;
        }
        return height;
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);

        System.out.println(maxDepth(root));

        System.out.println(hasPathSum(root,11));
    }
}
