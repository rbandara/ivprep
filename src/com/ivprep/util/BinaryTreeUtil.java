package com.ivprep.util;

import com.ivprep.common.Node;

public class BinaryTreeUtil {


    /**
                     1

            2                3


        4       5       6         7


     */
    public static Node buildTree(){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        node1.setLeft(node2); // node 1 is the root
        node1.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        node3.setRight(node7);

        return node1;
    }
}
