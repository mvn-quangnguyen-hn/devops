package com.baitap.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hình chữ nhật:");
        Rectangle rec = new Rectangle(4, 3);
        rec.printFigure();
        rec.dienTich();
        rec.chuVi();

        System.out.println("Hình vuông:");
        Square sqa = new Square(4);
        sqa.printFigure();
        sqa.dienTich();
        sqa.chuVi();
    }
}
