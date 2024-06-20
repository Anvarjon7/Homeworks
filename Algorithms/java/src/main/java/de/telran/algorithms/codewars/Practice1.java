package de.telran.algorithms.codewars;

import java.util.List;

public class Practice1 {

    public static void main(String[] args) {
        System.out.println(convertBinaryArrayToInt(List.of(0,0,0,1)));

        Listnode listnode1 = new Listnode(1);
        listnode1.next = new Listnode(2);
        listnode1.next.next = new Listnode(5);
        Listnode listnode2 = new Listnode(2);
        listnode2.next = new Listnode(3);
        listnode2.next.next = new Listnode(4);

        Listnode merged = mergeTwoLists(listnode1, listnode2);

        while (merged != null) {
            System.out.println(merged.val + " ");
            merged = merged.next;
        }
        System.out.println(mergeTwoLists(listnode1, listnode2));

    }

    private static int convertBinaryArrayToInt(List<Integer> binaryArray) {

        int result = 0;
        for (int i = 0; i < binaryArray.size(); i++) {
            result = (result << 1) | binaryArray.get(i);
        }

        return result;
    }

    private static Listnode mergeTwoLists(Listnode l1, Listnode l2) {

        Listnode dummy = new Listnode(0);
        Listnode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            }else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if (l1 != null) {
            curr.next = l1;
        } else if (l2 != null) {
            curr.next = l2;
        }

        return dummy.next;
    }

}
