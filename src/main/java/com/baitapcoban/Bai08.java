package com.baitapcoban;

import java.util.Scanner;

public class Bai08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = in.nextInt();

        if (check(n)) {
            System.out.print("Đây là số nguyên tố");
        } else {
            System.out.print("Đây không phải là số nguyên tố");
        }
    }

    public static boolean check(int n) {
        int halfN = n / 2;
        System.out.println(halfN);
        if (n < 2) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= halfN; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
