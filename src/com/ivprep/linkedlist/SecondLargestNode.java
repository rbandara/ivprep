package com.ivprep.linkedlist;

import com.ivprep.common.Node;

public class SecondLargestNode {

    void printSecondLargest(Node head) {

        if (head == null) throw new IllegalArgumentException("Input is null");
        if (head.getNext() == null) throw new IllegalArgumentException("At least two nodes must be present");

        Node largest = head;
        Node largest2 = head.getNext();

        Node current = head;

        while (current != null) {
            if (current.getValue() > largest.getValue()) {
                largest = current;
            }
            if (current.getValue() > largest2.getValue() && current.getValue() < largest.getValue()) {
                largest2 = current;
            }
            System.out.println("current " + current.getValue());
            System.out.println("largest so far " + largest.getValue());
            System.out.println("second largest so far " + largest2.getValue());
            current = current.getNext();

        }

        print("Second largest Node is " + largest2.getValue());

    }

    void print(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(15);
        Node n3 = new Node(20);
        Node n4 = new Node(21);
        Node n5 = new Node(19);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(null);

        SecondLargestNode slg = new SecondLargestNode();
        slg.printSecondLargest(n1);


    }

}
