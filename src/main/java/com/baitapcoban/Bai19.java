package com.baitapcoban;

import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = in.next();
        String a = "a";
        int count = 0;

        System.out.print("Vị trí ký tự a là: ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a.charAt(0)) {
                System.out.print(" " + i);
                count++;
            }
        }
        System.out.println();
        System.out.print("a xuất hiện " + count + " lần");
    }
}
