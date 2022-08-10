package com.baitapcoban;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = in.nextInt();

        int numberArr[] = new int[n];
        System.out.println("Nhập " + n + " số:");
        for (int i = 0; i < n; i++) {
            numberArr[i] = in.nextInt();
        }

        int min = numberArr[0];
        for (int num : numberArr) {
            if (min > num) {
                min = num;
            }
        }
        System.out.println("Số nhỏ nhất: " + min);
    }
}
