package com.blp.stacksandqueues;

public class LinkedListQueues {
    Node1 front;
    Node1 rear;

    public void LinkedListQueue() {
        front = null;
        rear = null;
    }

    public static void main(String[] args) {
        LinkedListQueues queues = new LinkedListQueues();
        queues.insert(56);
        queues.insert(30);
        queues.insert(70);
        System.out.println("Displaying Queue data");
        queues.displayList();
        System.out.println("Top element peeked is = " + queues.peek());
    }

    private void insertLast(int data) {
        Node1 newNode = new Node1(data);
        if (isEmpty()) {
            front = newNode;
        } else {
            // previous last point to new node
            rear.next = newNode;
        }
        rear = newNode;
    }

    private boolean isEmpty() {
        return front == null;
    }

    // Method to traverse and display all nodes
    public void displayList() {
        // Start from first node
        Node1 current = front;
        // loop till last node
        while (current != null) {
            current.displayData();
            current = current.next;
        }
    }

    private int nodeData() {
        return front.data;
    }

    public void insert(int item) {
        insertLast(item);
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty..");
        }
        return nodeData();
    }
}
