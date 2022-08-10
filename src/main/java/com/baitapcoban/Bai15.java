package com.baitapcoban;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập 5 MSV: ");
        String a = input.next();
        String b = input.next();
        String c = input.next();
        String d = input.next();
        String e = input.next();

        List<String> lst = new ArrayList<>();
        lst.add(a);
        lst.add(b);
        lst.add(c);
        lst.add(d);
        lst.add(e);

        for (String n : lst) {
            if (n.matches("00[2-5]L[0-9]{4}$")) {
                System.out.println("Đúng rồi");
            } else {
                System.out.println("Sai rồi");
            }
        }
    }
}
