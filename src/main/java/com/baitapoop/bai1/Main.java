package com.baitapoop.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap tu so 1: ");
        int tu1 = input.nextInt();
        System.out.print("Nhap mau so 1: ");
        int mau1 = input.nextInt();
        System.out.print("Nhap tu so 2: ");
        int tu2 = input.nextInt();
        System.out.print("Nhap tu so 2: ");
        int mau2 = input.nextInt();

        PhanSo ps1 = new PhanSo(tu1, mau1);
        PhanSo ps2 = new PhanSo(tu2, mau2);

        System.out.println();
        System.out.print("Phan so 1: ");
        ps1.display();
        System.out.print("Phan so 2: ");
        ps2.display();

        ps1.congPhanSo(ps2);
        ps1.truPhanSo(ps2);
        ps1.nhanPhanSo(ps2);
        ps1.chiaPhanSo(ps2);
    }
}
