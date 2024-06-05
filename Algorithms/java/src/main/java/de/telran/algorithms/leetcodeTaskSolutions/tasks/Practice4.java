package de.telran.algorithms.leetcodeTaskSolutions.tasks;


import java.util.*;

public class Practice4 {
    public static void main(String[] args) {


    }
    private static Map<Integer, Integer> valToIndex;
    private static List<Integer> values;
    private static Random rand;

    public Practice4() {
       valToIndex = new HashMap<>();
       values = new ArrayList<>();
       rand = new Random();
    }

    public static boolean insert(int val) {
        if (valToIndex.containsKey(val)) {
            return false;
        }
        valToIndex.put(val, values.size());
        values.add(val);
        return true;

    }

    public static boolean remove(int val) {
        if (!valToIndex.containsKey(val)) {
            return false;
        }
        int lastElement = values.getLast();
        int idxToReplace = valToIndex.get(val);
        values.set(idxToReplace, lastElement);
        valToIndex.put(lastElement, idxToReplace);
        values.removeLast();
        valToIndex.remove(val);
        return true;
    }

    public static int getRandom() {
        return values.get(rand.nextInt(values.size()));
    }

}


