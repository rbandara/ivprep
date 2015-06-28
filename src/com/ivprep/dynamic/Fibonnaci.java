package com.ivprep.dynamic;

public class Fibonnaci {

    //plain recursion
    int f(int n) {
        if (n == 0 || n == 1) return 1;
        int fn = f(n - 1) + f(n - 2);
        return fn;
    }

    // storing the f[n] calculated so far
    int fib(int n) {
        int[] array = new int[n + 1];
        array[0] = array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }

    // we really don't need all the numbers to be stored, just store last two numbers and we should be done.
    int fibb(int n) {
        int a = 1, b = 1;
        int i = 2;
        int c = 0;
        while(i <= n) {
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        return c;

    }

    public static void main(String[] args) {
        Fibonnaci fibonnaci = new Fibonnaci();
        for (int i = 2; i <= 80; i++) {
//            System.out.println(i + " - " + fibonnaci.fib(i));
            System.out.println(i + " - " + fibonnaci.fibb(i));
        }

    }
}
