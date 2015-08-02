package com.ivprep.problem;

/**
 * How do you find an element in two dimensional sorted array?
 * <p/>
 *
 *    int[][] array = { {1, 5,  8,  9},
 *                      {2, 6,  10, 12},
 *                      {5, 8,  13, 17},
 *                      {7, 9,  19, 21},
 *                      {9, 19, 20, 25}
 *                    }
 *                      array[0][0],array[0][1],array[0][2],array[0][3]
 *                      array[1][0],array[1][1],array[1][2],array[1][3]
 *                      array[2][0]
 *                      array[3][0]
 *                      array[4][0]
 * <p/>
 * 1  5  8   9
 * 2  6  10 12
 * 5  8  13 17
 * 7 18 19  21
 * <p/>
 * <p/>
 * }
 * We call this search SaddleBackSearch
 */
public class SaddleBackSearch {


    // we can start from an upper right or lower left corner and walk in
    //
    static void find(int[][] arr, int x) {
        int i = 0;
        int j = 3;

        int start = arr[i][j];

        if(x==start)
            System.out.println("Found the value at " + i + "," + j);

        while (x != start) {

            start = arr[i][j];
            System.out.println(start);

            if (x > start) {
                i++;
            } else if (x < start) {
                j--;
            } else {
                System.out.println("Found the value at " + i + "," + j);
            }
        }

    }

    static void findAllowDups(int[][] arr, int x) {
        int i = 0;
        int j = 3;

        int start = arr[i][j];

        while (i != arr.length && j != 0) {

            start = arr[i][j];
            System.out.println(start);

            if (x > start) {
                i++;
            } else if (x < start) {
                j--;
            } else {
                System.out.println("Found the value at " + i + "," + j);
                i++;
                j--;
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
