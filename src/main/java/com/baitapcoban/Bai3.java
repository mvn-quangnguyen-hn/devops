package com.baitapcoban;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập 3 cạnh: ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Đây là tam giác");
        } else {
            System.out.println("Đây không phải là tam giác");
        }
    }
}
