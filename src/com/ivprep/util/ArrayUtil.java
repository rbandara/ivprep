package com.ivprep.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class ArrayUtil {

    public static int[] buildArray(int size, int maxVal) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxVal);
        }
        return array;
    }

    public static int[] buildArrayNoDups(int size, int maxVal) {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            int rnd = random.nextInt(maxVal);
            if (map.get(rnd) == null) {
                map.put(rnd, true);
                array[i] = rnd;
            } else {
                //System.out.println("generated value was already there " + rnd + ">>  Current array " + Arrays.toString(array));
                i--;
            }
        }
        return array;
    }

    // Assume maxVal is not 'that' big
    public static int[] buildArrayNoDupsEffi(int size, int maxVal) {
        //HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        boolean[] barr = new boolean[maxVal];
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {

            int rnd = random.nextInt(maxVal);

            if(!barr[rnd])
                barr[rnd] = true;
            else
                i--;
        }
        int j = 0;
        for (int i = 0; i < barr.length; i++) {
            if(barr[i]) {
                array[j] = i;
                j++;
            }

        }
        return array;
    }

    public static void main(String[] args) {
        int numArrays = 10000000;
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < numArrays; i++) {
            int[] noDups = buildArrayNoDupsEffi(10, 100);
            //System.out.println(Arrays.toString(noDups));

        }
        long t2 = System.currentTimeMillis();

        System.out.println("Time took for No Dups Efficient " + (t2-t1));

        t1 = System.currentTimeMillis();
        for (int i = 0; i < numArrays; i++) {
            int[] noDups = buildArrayNoDups(10, 100);
            //System.out.println(Arrays.toString(noDups));

        }
        t2 = System.currentTimeMillis();

        System.out.println("Time took for No Dups " + (t2-t1));

    }
}
