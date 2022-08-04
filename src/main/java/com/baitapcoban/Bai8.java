package com.baitapcoban;

import java.util.Scanner;

public class Bai8 {
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
        if (n < 2) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= (n / 2); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}