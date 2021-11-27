package com.blp.stacksandqueues;

public class SingleLinkedList {
    Node head;
    Node tail;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;

        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }

    public Node push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;

        } else {
            newNode.next = head;
            head = newNode;
        }
        return newNode;

    }

    public void insertBetweenValue(int data, int position) {
        Node currNode = new Node(data);

        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;

        }
        currNode.next = temp.next;
        temp.next = currNode;
    }

    public void popFirstElement() {

        if (head == null)
            System.out.println("No Element in Linked LIst");
        Node temp = head;
        head = head.next;

    }

    public void popLastElement() {
        if (head == null)

            if (head.next == null) {

            }

        // Find the second last node
        Node second_last = head;
        while (second_last.next.next != null)
            second_last = second_last.next;

        // Change next of second last
        second_last.next = null;

    }

    void search(int x) {
        Node current = head;// Initialize current
        int position = 1;
        while (current != null) {
            if (current.data == x) {
                System.out.println("Found At Location " + position);
                return;
            } else {
                current = current.next;
                position++;
            }
        }

    }

    void insertBetweenTwoNodeByValue(int data1, int element1, int element2) {
        Node temp = head;
        Node temp1 = null;
        ;// Initialize current
        Node newNode = new Node(data1);
        while (newNode != null) {

            if (temp.data == element1 && temp.next.data == element2) {
                temp.next = temp1;
                temp.next = newNode;
                newNode.next = temp1;
                return;

            } else {
                temp = temp.next;

            }
        }
    }

    public void sortList() {

        // Node current will point to head
        Node current = head, index = null;

        int temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                // Node index will point to node next to
                // current
                index = current.next;

                while (index != null) {
                    // If current node's data is greater
                    // than index's node data, swap the data
                    // between them
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }

                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public void display() {
        Node n = head;
        if (head == null) {
            System.out.println("Linked list is Empty");

        } else {
            while (n != null) {
                System.out.print(n.data + " ");
                n = n.next;
            }
        }
    }

}
