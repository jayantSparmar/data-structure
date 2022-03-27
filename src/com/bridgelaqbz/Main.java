package com.bridgelaqbz;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Program");

        LinkedList list = new LinkedList();
        list.addFirst(70);
        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(56);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();


        System.out.println("Welcome To the Queue Program");

        Queue queue = new Queue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(70);
        queue.showElements();
        queue.dequeue();
        queue.showElements();
        queue.dequeue();
        queue.showElements();
        queue.dequeue();
        queue.showElements();

        System.out.println("Welcome To the Stack Program");

        Stack stack = new Stack();
        stack.push(56);
        stack.push(30);
        stack.push(40);
        stack.push(70);
        stack.showElements();

        stack.pop();
        stack.showElements();
        stack.pop();
        stack.showElements();
        stack.pop();
        stack.showElements();
    }
}

