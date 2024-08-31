package de.telran.algorithms.leetcodeTaskSolutions.tasks;

import java.util.LinkedList;

public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode(){};

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


    private static ListNode deserialize(String data) {
        if (data == null || data.equals("[]")) return null;

        String[] nodes = data.substring(1, data.length() - 1).split(",");

        ListNode head = new ListNode(Integer.parseInt(nodes[0].trim()));
        ListNode cur = head;

        for (int i = 1; i < nodes.length; i++) {
            cur.next = new ListNode(Integer.parseInt(nodes[i].trim()));

            cur = cur.next;
        }

        return head;
    }


    private static boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;

        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = deserialize("[3,2,0,-4]");
        System.out.println(hasCycle(head));

        int[] val1 = {1,2,6,9};
        int[] val2 = {1,5,4,8};

        ListNode list1 = create(val1);
        ListNode list2 = create(val2);

        print(list1);
        print(list2);



        ListNode merged = mergeTwoLists(list2,list1);
        System.out.println("Merged List ------->>>>>>>>> ");

        print(merged);
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

       ListNode dummy = new ListNode(-1);
       ListNode cur = dummy;

       while (l1 != null && l2 != null) {
           if (l1.val <= l2.val) {
               cur.next = l1;
               l1 = l1.next;
           }else {
               cur.next = l2;
               l2 = l2.next;
           }

           cur = cur.next;
       }

       if (l1 != null){
           cur.next = l1;
       } else if (l2 != null) {
           cur.next = l2;
       }

       return dummy.next;
    }

    private static ListNode create(int[] values){

        if (values == null || values.length == 0){
            return null;
        }

        ListNode head = new ListNode(values[0]);
        ListNode curr = head;

        for (int i = 1; i < values.length; i++) {
            curr.next = new ListNode(values[i]);
            curr = curr.next;
        }

        return head;
    }

    private static void print(ListNode head){

        ListNode curr = head;

        while (curr != null){
            System.out.println(curr.val + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }
}
