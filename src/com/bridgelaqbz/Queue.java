package com.bridgelaqbz;

public class Queue {
    // FIFO
    static LinkedList list = new LinkedList();

    // Adding elements: Enqueue
    public void enqueue(int data) {
        list.addLast(data);
    }

    // Deleting elements: Dequeue
    public void dequeue() {
        list.deleteFirst();
    }

    // to display
    public void showElements() {
        list.display();
    }
}



