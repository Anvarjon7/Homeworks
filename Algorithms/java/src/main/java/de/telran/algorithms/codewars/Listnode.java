package de.telran.algorithms.codewars;

public class Listnode {

    int val;

    Listnode next;

    public Listnode(int val) {
        this.val = val;
    }


//    public static boolean hasCycle(Listnode head) {
//
//        if (head == null || head.next == null){
//            return false;
//        }
//
//        Listnode slow = head;
//        Listnode fast = head;
//
//        while (fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//
//
//            if (slow == fast){
//                return true;
//            }
//        }
//
//        return false;
//    }
}

