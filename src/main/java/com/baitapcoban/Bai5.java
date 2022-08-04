package com.baitapcoban;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập MSV: (Bxxxxxxx)");
        String a = input.next();

        if (a.matches("B[1-9]{7}$")) {
            System.out.println("Ok");
        } else {
            System.out.println("Not OK");
        }
    }
}
