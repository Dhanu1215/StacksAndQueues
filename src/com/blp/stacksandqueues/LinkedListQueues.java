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
        System.out.println("Removing Queue elements");
        System.out.println("Item removed = " + queues.remove());
        System.out.println("Item removed = " + queues.remove());
        System.out.println("Item removed = " + queues.remove());
        queues.displayList();
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
    public int removeFirst(){

        int temp = front.data;
        // If no node left after deleting node
        if(front.next == null){
            rear = null;
        }
        // front starts pointing to next element
        front = front.next;
        return temp;
    }

    private boolean isEmpty() {
        return front == null;
    }

    // Method to traverse and display all nodes
    public void displayList() {
        // Start from first node
        Node1 current = front;
        // loop till last node
        if (current == null){
            System.out.println("Queue is empty");
        }else
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
            System.out.println("Queue is empty..");
        }
        return nodeData();
    }

    private int remove() {
        if(isEmpty()){
            System.out.println("Queue is empty..");
        }
        return removeFirst();
    }

}
