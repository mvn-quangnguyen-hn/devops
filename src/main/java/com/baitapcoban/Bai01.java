package com.baitapcoban;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập số: ");
        num = in.nextInt();

        if (num >= 0) {
            System.out.println("Đây là số nguyên dương");
        } else {
            System.out.println("Đây là số nguyên âm");
        }
    }
}
