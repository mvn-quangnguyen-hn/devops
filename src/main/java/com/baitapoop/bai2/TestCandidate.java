package com.baitapoop.bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCandidate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nhập số lượng thí sinh: ");
        int n = in.nextInt();

        ArrayList<Candidate> listSV = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            Candidate sv = new Candidate();
            System.out.println("Nhập thí sinh " + i + ":");

            System.out.print("ID: ");
            sv.setId(in.next());
            System.out.print("Tên: ");
            sv.setName(in.next());
            System.out.print("Ngày sinh: ");
            sv.setDate(in.next());
            System.out.print("Điểm toán: ");
            sv.setToan(in.nextFloat());
            System.out.print("Điểm văn: ");
            sv.setVan(in.nextFloat());
            System.out.print("Điểm anh: ");
            sv.setAnh(in.nextFloat());

            listSV.add(sv);
            System.out.println();
        }

        System.out.println("Hiển thị sinh viên có tổng điểm lớn hơn 1:");
        if (listSV.size() == 0) {
            System.out.println("Empty!");
        } else {
            for (Candidate i : listSV) {
                if (i.checkSum()){
                    i.display();
                }
                System.out.println();
            }
        }
    }
}
