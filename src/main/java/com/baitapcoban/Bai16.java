package com.baitapcoban;

import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = in.next();

        System.out.print("Nhập 1 ký tự: ");
        String l = in.next();

        boolean isFound = str.contains(l);

        if (isFound){
            System.out.print("Có");
        } else {
            System.out.print("Không");
        }
    }
}
