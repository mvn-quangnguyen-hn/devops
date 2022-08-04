package com.baitapcoban;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập 5 MSV: (B170xxxx)");
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
            if (n.matches("B170[1-9]{4}$")) {
            System.out.println("Ok");
            } else {
                System.out.println("Not OK");
            }
        }
    }
}
