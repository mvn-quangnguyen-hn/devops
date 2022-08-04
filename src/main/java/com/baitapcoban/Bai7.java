package com.baitapcoban;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = in.nextInt();

        for (int i = 1; i <= 20; i++) {
            int res = i * n;
            System.out.println(n + " x " + i + " = " + res);
        }
    }
}
