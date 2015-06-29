package com.ivprep.btree;

import com.ivprep.common.Node;
import com.ivprep.util.BinaryTreeUtil;

import java.util.Stack;

public class TreeTraverser {

    Stack<Node> stack = new Stack<Node>();

    void inOrder(Node<Integer> root) {

        Node<Integer> current = root;

        while (current != null) {
            stack.push(current);
            current = current.getLeft();
        }


        while (!stack.isEmpty()) {
            Node<Integer> node = stack.pop();
            System.out.print(node.getT() + "\t");
            current = node.getRight();
            while (current != null) {
                stack.push(current);
                current = current.getLeft();
            }
        }
    }

    void postOrder(Node<Integer> root) {

        Stack<Node> stack = new Stack<Node>();
        Node current = root;

        while(current!=null) {
            current = current.getLeft();
            stack.push(current);
        }

        while(!stack.isEmpty()) {
            Node node = stack.pop();

            if(node.getLeft() == null && node.getRight() == null)
                System.out.println(node.getT() + "\t");

            current = node.getRight();

            while(current !=null){
                stack.push(current);
                current = current.getLeft();
            }
        }

    }

    public static void main(String[] args) {

        /**
                     1

             2                3


         4       5       6         7

         */

//         PRE ORDER should print
//         4 2 5 1 6 3
        Node root = BinaryTreeUtil.buildTree();

        TreeTraverser treeTraverser = new TreeTraverser();

        treeTraverser.inOrder(root);

//        POST ORDER should print
//        4 5 2 6 7 3 1

        treeTraverser.postOrder(root);

    }

}
