package com.ivprep.btree;

import com.ivprep.common.Node;

public class InsertSortedArray {

    Node insert(int[] array) {
        return insert(0, array.length-1, array);
    }

    Node insert(int start, int end, int[] array ) {
        if(start > end) return null;
        int mid = (start + end) / 2;
        Node node = new Node(array[mid]);
        node.setLeft(insert(start,mid-1,array));
        node.setRight(insert(mid+1, end,array));
        return node;
    }

    public static void main(String[] args) {
        int[] sortedArr = new int[]{1,4,6,7,8,10};
        InsertSortedArray p = new InsertSortedArray();
        Node root = p.insert(sortedArr);
        BTreeUtil.inOrder(root);
    }
}
