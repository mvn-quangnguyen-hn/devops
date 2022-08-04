package com.baitapcoban;

import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = in.next();

        System.out.print("Nhập 1 ký tự: ");
        String l = in.next();

        System.out.println("Vị trí ký tự: " + l + " là: ");
        for (int i = 0; i < str.length(); i++) {
            if (l.charAt(0) == str.charAt(i)) {
                System.out.print(" " + i);
            }
        }
    }
}
