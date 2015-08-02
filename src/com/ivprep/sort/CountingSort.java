package com.ivprep.sort;

// One of the draw backs in counting sort is the maximum number of elements
// that can be sorted has a upper bound of Integer.MAX_VALUE
// This code will see the performance of counting sort for that MAX number of elements
// The results are compared with the built in search algorithms
// Note : Java collections use Merge sort while Arrays use quick sort
// ( variant of quick sort - DualPivotQuick sort )
// this gives you why
// http://stackoverflow.com/questions/15154158/why-collections-sort-uses-merge-sort-instead-of-quicksort


public class CountingSort {

    static int MAX = Integer.MAX_VALUE;

    static int mb = 1024*1024;

    public static void main(String[] args) {

        System.out.println("MAX/mb = " + MAX/mb);

        Runtime runtime = Runtime.getRuntime();

        long freeMemInMb = runtime.freeMemory() / mb;

        System.out.println("freeMemInMb before = " + freeMemInMb);

        boolean[] array = new boolean[MAX];

        freeMemInMb = runtime.freeMemory() / mb;
        System.out.println("freeMemInMb after = " + freeMemInMb);

        System.out.println("Used Memory:"
                + ((runtime.totalMemory() - runtime.freeMemory()) / mb) + " MB") ;
    }

}
