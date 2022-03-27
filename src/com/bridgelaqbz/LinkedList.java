package com.bridgelaqbz;

public class LinkedList {
    Node head;
    // node creation
    public class Node {

        int data;
        Node next;

        // constructor
        public Node(int data) {
            this.data = data;
        }
    }
    /*
     * This is the method to add first element
     */
    public void addFirst(int data) {
        // create new node
        Node newNode = new Node(data);
        // list is empty
        if (head == null) head = newNode;
            // list is not empty
        else {
            newNode.next = head;
            head = newNode;
        }
    }
    /*
     * This is the method to add last element
     */
    public void addLast(int data) {
        // create new node
        Node newNode = new Node(data);
        // list is empty
        if (head == null) head = newNode;
            // list has only one element
        else if (head.next == null) head.next = newNode;
            // list has more than 1 elements
        else {
            Node temp = head;
            // traverse up to null elements
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
}
