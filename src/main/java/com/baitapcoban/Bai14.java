package com.baitapcoban;

import java.util.Arrays;
import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = in.nextInt();

        int numberArr[] = new int[n];
        System.out.println("Nhập " + n + " số nguyên:");
        for (int i = 0; i < n; i++) {
            numberArr[i] = in.nextInt();
        }
        System.out.println("Mảng vừa nhập: " + Arrays.toString(numberArr));

        for (int i = 0; i < numberArr.length / 2; i++) {
            int temp = numberArr[i];
            numberArr[i] = numberArr[numberArr.length - 1 - i];
            numberArr[numberArr.length - 1 - i] = temp;
        }
        System.out.print("Mảng ngược lại: " + Arrays.toString(numberArr));
    }
}
