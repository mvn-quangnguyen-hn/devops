package com.baitap.bai2;

public class Rectangle {
    float width, length;

    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    public void printFigure() {
        System.out.println("Cạnh 1: " + width);
        System.out.println("Cạnh 2: " + length);
    }

    public void chuVi() {
        double rad = (width + length) * 2;
        System.out.println("Chu vi: " + rad);
    }

    public void dienTich() {
        double area = width * length;
        System.out.println("Diện tích: " + area);
    }
}
