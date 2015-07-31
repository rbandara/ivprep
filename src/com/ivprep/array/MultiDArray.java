package com.ivprep.array;

import java.util.Random;

public class MultiDArray {

    public static void main(String[] args) {

        int[][] array = new int[5][7];

        construct(array);

        print(array);

    }

    private static void construct(int[][] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[0].length; j++) {

                array[i][j] = new Random().nextInt(100);

            }

        }
    }

    private static void print(int[][] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[0].length; j++) {

                System.out.println("array = [" + i + "," + j + "] = " + array[i][j]);

            }

        }
    }
}
