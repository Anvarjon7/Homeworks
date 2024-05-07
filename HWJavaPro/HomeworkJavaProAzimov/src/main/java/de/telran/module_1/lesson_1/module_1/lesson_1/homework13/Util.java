package de.telran.module_1.lesson_1.module_1.lesson_1.homework13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Util {
    public static Node breadthFirstSearch(Node node, int key) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.print(tempNode.getValue() + " ");
            if (tempNode.getKey() == key)
                return tempNode; // мы нашли этот ключ

            /*Enqueue left child */
            if (tempNode.getLeft() != null) {
                queue.add(tempNode.getLeft());
            }

            /*Enqueue right child */
            if (tempNode.getRight() != null) {
                queue.add(tempNode.getRight());
            }
        }
        return null;
    }

    public static void breadthFirst(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.print(tempNode.getValue() + " ");

            /*Enqueue left child */
            if (tempNode.getLeft() != null) {
                queue.add(tempNode.getLeft());
            }

            /*Enqueue right child */
            if (tempNode.getRight() != null) {
                queue.add(tempNode.getRight());
            }
        }
    }


    public static void depthPostorder(Node node) {
        if (node == null)
            return;

        // first recur on left subtree
        depthPostorder(node.getLeft());

        // then recur on right subtree
        depthPostorder(node.getRight());

        // now deal with the node
        System.out.print(node.getValue() + " ");
    }

    /* Given a binary tree, print its nodes in inorder*/
    public static void depthInorder(Node node) {
        if (node == null)
            return;

        /* first recur on left child */
        depthInorder(node.getLeft());

        /* then print the data of node */
        System.out.print(node.getValue() + " ");

        /* now recur on right child */
        depthInorder(node.getRight());
    }

    public static void depthInorderStack(Node node) {
        if (node == null)
            return;


        Stack<Node> s = new Stack<>();
        Node current = node;

        // traverse the tree
        while (current != null || !s.isEmpty()) {

            /* Reach the left most Node of the
            curr Node */
            while (current != null) {
                /* place pointer to a tree node on
                   the stack before traversing
                  the node's left subtree */
                s.push(current);
                current = current.getLeft();
            }

            /* Current must be NULL at this point */
            current = s.pop();

            System.out.print(current.getValue() + " ");

            /* we have visited the node and its
               left subtree.  Now, it's right
               subtree's turn */
            current = current.getRight();
        }
    }

    /* Given a binary tree, print its nodes in preorder*/
    public static void depthPreorder(Node node) {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.getValue() + " ");

        /* then recur on left subtree */
        depthPreorder(node.getLeft());

        /* now recur on right subtree */
        depthPreorder(node.getRight());
    }

    public static Node breadthFirstSearch(BinaryTree tree, int key) {
        if (tree == null || tree.getRoot() == null) {
            return null;
        }
        Node root = tree.getRoot();

        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()) {
            Node current = nodeQueue.poll();
            System.out.println(current.getValue() + " ");
            if (current.getKey() == key) {
                return current;
            }
            if (current.getLeft() != null){
                nodeQueue.add(current.getLeft());
            }
            if (current.getRight() != null){
                nodeQueue.add(current.getRight());
            }
        }
        return null;
    }

    private static Node depthFirstSearch(BinaryTree tree, int key){
        if (tree == null || tree.getRoot() == null){
            return null;
        }

        return depthFirstSearchHelper(tree.getRoot(),key);
    }

    private static Node depthFirstSearchHelper(Node node, int key){
        if (node == null){
            return null;
        }
        System.out.println(node.getValue() + " ");

        if (node.getValue().equals(key)){
            return node;
        }
        Node left = depthFirstSearchHelper(node.getLeft(),key);
        if (left != null){
            return left;
        }
        return depthFirstSearchHelper(node.getRight(),key);
    }
}

