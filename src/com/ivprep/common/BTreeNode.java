package com.ivprep.common;

public class BTreeNode<T> {
    BTreeNode left;
    BTreeNode right;
    T t;

    public BTreeNode(T t) {
        this.t = t;
    }

    public BTreeNode getLeft() {
        return left;
    }

    public void setLeft(BTreeNode left) {
        this.left = left;
    }

    public BTreeNode getRight() {
        return right;
    }

    public void setRight(BTreeNode right) {
        this.right = right;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
