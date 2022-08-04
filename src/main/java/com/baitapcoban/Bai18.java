package com.baitapcoban;

import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = in.next();

        if (str.matches(".*[0-9].*")) {
            System.out.println("Có");
        } else {
            System.out.println("Không");
        }
    }
}
