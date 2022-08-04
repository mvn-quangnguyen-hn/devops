package com.baitapcoban;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = in.nextInt();
        int sum = 0;

        System.out.println("Các số chắn từ 0 - " + n + ":");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.print("Tổng các số chẵn: " + sum);
    }
}
