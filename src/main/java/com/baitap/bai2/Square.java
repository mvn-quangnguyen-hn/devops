package com.baitap.bai2;

public class Square {
    float length;
    double rad, area;

    public void printFigure (float a) {
        System.out.println("Hình vuông có cạnh dài: " + a);
    }

    public void chuVi (float a) {
        rad = a*4;
        System.out.println("Chu vi: " + rad);
    }

    public void dienTich (float a) {
        area = a*a;
        System.out.println("Diện tích: " + area);
    }
}
