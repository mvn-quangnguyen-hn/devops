package com.baitapcoban;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = in.nextInt();

        int numberArr[] = new int[n];
        System.out.println("Nhập " + n + " số nguyên:");
        for (int i = 0; i < n; i++) {
            numberArr[i] = in.nextInt();
        }

        int max = numberArr[0];
        for (int num : numberArr) {
            if (max < num) {
                max = num;
            }
        }
        System.out.println("Số lớn nhất: " + max);
    }
}
