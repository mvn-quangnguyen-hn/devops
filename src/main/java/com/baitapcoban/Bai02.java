package com.baitapcoban;

import java.util.Arrays;
import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập số: ");
        num = in.nextInt();

        String str = Integer.toString(num);;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                System.out.print("Không ");
            }
            if (str.charAt(i) == '1') {
                System.out.print("Một ");
            }
            if (str.charAt(i) == '2') {
                System.out.print("Hai ");
            }
            if (str.charAt(i) == '3') {
                System.out.print("Ba ");
            }
            if (str.charAt(i) == '4') {
                System.out.print("Bốn ");
            }
            if (str.charAt(i) == '5') {
                System.out.print("Năm ");
            }
            if (str.charAt(i) == '6') {
                System.out.print("Sáu ");
            }
            if (str.charAt(i) == '7') {
                System.out.print("Bảy ");
            }
            if (str.charAt(i) == '8') {
                System.out.print("Tám ");
            }
            if (str.charAt(i) == '9') {
                System.out.print("Chín ");
            }
        }
    }
}
