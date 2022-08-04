package com.baitapcoban;

import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập chuỗi: ");
        String a = input.next();

        if (a.matches("^[A-Z][^ ]{18}[0-9]$")) {
            System.out.println("Duyệt");
        } else {
            System.out.println("Không duyệt");
        }
    }
}
