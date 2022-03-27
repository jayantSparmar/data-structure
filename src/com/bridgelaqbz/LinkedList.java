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

}
