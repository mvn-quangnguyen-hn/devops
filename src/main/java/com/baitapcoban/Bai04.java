package com.baitapcoban;

import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập 3 cạnh: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a + b > c && b + c > a && a + c > b) {
            if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
                System.out.println("Đây là tam giác vuông");
            } else {
                System.out.println("Đây là tam giác nhưng Không phải là tam giác vuông");
            }
        } else {
            System.out.println("Đây không phải là tam giác");
        }
    }
}
