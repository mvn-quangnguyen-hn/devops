package com.baitapcoban;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = in.nextInt();

        System.out.println("Nhập " + n + " số nguyên:");
        for (int i = 0; i < n; i++) {
            sum += in.nextInt();
        }

        float ave = (float) sum / n;

        System.out.println("Trung bình cộng: " + ave);
    }
}
