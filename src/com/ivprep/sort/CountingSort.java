package com.ivprep.sort;

public class CountingSort {

    static int MAX = Integer.MAX_VALUE;

    static int mb = 1024*1024;

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        long freeMemInMb = runtime.freeMemory() / mb;

        System.out.println("freeMemInMb before = " + freeMemInMb);

        boolean[] array = new boolean[MAX];

        freeMemInMb = runtime.freeMemory() / mb;
        System.out.println("freeMemInMb after = " + freeMemInMb);

        System.out.println("Used Memory:"
                + (runtime.totalMemory() - runtime.freeMemory()) / mb);
    }

}
