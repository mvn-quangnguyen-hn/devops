package com.baitap.bai2;

public class Square {
    float length;

    public Square(float length) {
        this.length = length;
    }

    public void printFigure() {
        System.out.println("Hình vuông có cạnh dài: " + length);
    }

    public void chuVi() {
        double rad = length * 4;
        System.out.println("Chu vi: " + rad);
    }

    public void dienTich() {
        double area = length * length;
        System.out.println("Diện tích: " + area);
    }
}
