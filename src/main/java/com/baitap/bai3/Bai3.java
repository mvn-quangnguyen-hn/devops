package com.baitap.bai3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        elapsedTime();
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập số: ");
        num = in.nextInt();
        System.out.println("Dãy số fibonacci: ");
        for (int i = 0; i < num; i++) {
            System.out.print(fib(i) + " ");
        }
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
// TODO: Calculate Fibonacci value for the given number
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }
}
