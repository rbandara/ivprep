package com.ivprep.btree;

import com.ivprep.common.Node;

public class BTreeUtil {
    public static void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.getLeft());
        System.out.println(root.getT());
        inOrder(root.getRight());
    }
}
