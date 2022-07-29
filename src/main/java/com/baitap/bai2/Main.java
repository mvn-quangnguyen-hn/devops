package com.baitap.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        float a, b;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Nhap canh 1: ");
//        a = in.nextFloat();
//        System.out.print("Nhap canh 2: ");
//        b = in.nextFloat();
//
//        if (a==b) {
//            System.out.println("Day la hinh vuong");
//        } else {
//            System.out.println("Day la hinh chu nhat");
//        }

        System.out.println("Hình chữ nhật:");
        Rectangle rec = new Rectangle();
        rec.width = 1;
        rec.length = 2;
        rec.printFigure(rec.width, rec.length);
        rec.dienTich(rec.width, rec.length);
        rec.chuVi(rec.width, rec.length);

        System.out.println("Hình vuông:");
        Square sqa = new Square();
        sqa.length = 2;
        sqa.printFigure(rec.length);
        sqa.dienTich(rec.length);
        sqa.chuVi(rec.length);
    }
}
