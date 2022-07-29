package com.baitap.bai2;

public class Rectangle {
    float width, length;
    double rad, area;
    public void printFigure (float a, float b) {
        System.out.println("Cạnh 1: " + a);
        System.out.println("Cạnh 2: " + b);
    }

    public void chuVi (float a, float b) {
        rad = (a+b)*2;
        System.out.println("Chu vi: " + rad);
    }

    public void dienTich (float a, float b) {
        area = a*b;
        System.out.println("Diện tích: " + area);
    }
}
