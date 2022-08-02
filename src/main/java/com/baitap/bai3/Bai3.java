package com.baitap.bai3;

public class Bai3 {
    public static void main(String[] args) {
        elapsedTime();
    }

    public static void elapsedTime() {
        long t1, t2;
        t1 = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            fib(11);
        }
        t2 = System.nanoTime();
        System.out.println("Running time = " + ((t2 - t1) / 1000000) + "ms");
    }

    public static long fib(long n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }
}
