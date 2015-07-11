package com.ivprep.problem;

/**
 * How do you find an element in two dimensional sorted array?
 * <p/>
 * ex : int[] array = { {1,5,8,9}, {2, 6, 10, 12}, {5,8,13,17}, {7,9,19, 21}, {9, 19, 20, 25} }
 *                      array[0][0]  array[1][0]     array[2][0]  array[3][0]  array[4][0]
 * <p/>
 * 1  5  8   9
 * 2  6  10 12
 * 5  8  13 17
 * 7 18 19  21
 * <p/>
 * <p/>
 * }
 */
public class SaddleBackSearch {


    static void find(int[][] arr, int x) {
        int startI = 0;
        int startJ = 3;

        int start = arr[startI][startJ];

        while (x != start) {

            start = arr[startI][startJ];
            System.out.println(start);

            if (x > start) {
                startI++;
            } else if (x < start) {
                startJ--;
            } else {
                System.out.println("Found the value at " + startI + "," + startJ);
            }
        }

    }

    static void findAllowDups(int[][] arr, int x) {
        int startI = 0;
        int startJ = 3;

        int start = arr[startI][startJ];

        while (startI != arr.length && startJ != 0) {

            start = arr[startI][startJ];
            System.out.println(start);

            if (x > start) {
                startI++;
            } else if (x < start) {
                startJ--;
            } else {
                System.out.println("Found the value at " + startI + "," + startJ);
                startI++;
                startJ--;
            }
        }

    }

    public static void main(String[] args) {

        int[][] array = {
                {1, 5, 8, 9},
                {2, 6, 10, 12},
                {5, 8, 13, 17},
                {7, 9, 19, 21},
                {9, 19, 20, 25}
        };

        findAllowDups(array, 9);
    }
}
