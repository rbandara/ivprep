package com.ivprep.problem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Question : How do you flatten a iterator of iterators? You need to write implement your own version of iterator
 * class, that needs to take input a  iterator of iterators.
 * <p/>
 * Notes:
 * What is the rational of this question??
 * trying to see what iterator does ?
 * see how you apply the knowledge of iterator to a given problem
 * <p/>
 * <p/>
 * 1. When next() is called the element needs to be returned in the sequence of where they are
 * 2. When next() is called the element needs to be returned in alternate sequences
 * 3. How do you make the program multithreaded?
 */
public class MyIterator<T> implements Iterator<T> {

    int nextIndex = 0;

    List<T> arrayList = new ArrayList();

    public MyIterator(Iterator<Iterator<T>> iterators) {
        while (iterators.hasNext()) {
            ArrayList arrayList = (ArrayList) iterators.next();
            Iterator<T> iterator = arrayList.iterator();
            while (iterator.hasNext())
                this.arrayList.add(iterator.next());
        }
    }

    public boolean hasNext() {
        return (arrayList.size() > nextIndex + 1);
    }

    public T next() {
        T element = arrayList.get(nextIndex);
        nextIndex++;
        return element;
    }

    public void remove() {

    }

    public static void main(String[] args) {
        List<List<String>> listOfLists = new ArrayList<List<String>>();
        List<String> stringList1 = new ArrayList<String>();
        stringList1.add("a");
        stringList1.add("b");
        stringList1.add("c");
        stringList1.add("d");
        stringList1.add("e");
        listOfLists.add(stringList1);
        List<String> stringList2 = new ArrayList<String>();
        stringList2.add("A");
        stringList2.add("B");
        stringList2.add("C");
        stringList2.add("D");
        stringList2.add("E");
        listOfLists.add(stringList2);
        List<String> stringList3 = new ArrayList<String>();
        stringList3.add("1");
        stringList3.add("2");
        stringList3.add("3");
        stringList3.add("4");
        stringList3.add("5");
        listOfLists.add(stringList3);

        Iterator<String> myIterator = new MyIterator(listOfLists.iterator());

        while (myIterator.hasNext()) {
            System.out.printf(myIterator.next());
        }

    }
}
