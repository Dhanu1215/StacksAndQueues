package com.blp.stacksandqueues;

import java.util.Scanner;

public class ImplementationStack {

    public static void main(String[] args) {
        SingleLinkedList stack=new SingleLinkedList();
        int choice;
        Scanner inp=new Scanner(System.in);
        do{

            System.out.println("Welcome to Menu of Stack");

            System.out.println("1)Push");
            System.out.println("2)Display Linked List");
            System.out.println("3)Pop Element");
            System.out.println("4)Exit");
            choice=inp.nextInt();

            if (choice==1) {
                System.out.println("Enter The Element to append");
                int num=inp.nextInt();
                stack.push(num);
            }
            else if (choice ==2 )
            {
                stack.display();
            }
            else if (choice==3)
            {
                stack.popFirstElement();
            }
            System.out.println();

        }while(choice!=4);
    }
}
