package com.blp.stacksandqueues;

public class Node1 {
    //data
    int data;
    Node1 next;
    Node1(int data){
        this.data = data;
    }

    public void displayData() {
        System.out.println("i = " + data);
    }
}
