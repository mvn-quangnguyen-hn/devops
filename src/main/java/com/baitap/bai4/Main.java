package com.baitap.bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean condition = true;
        do {
            System.out.println("Menu");
            System.out.println("1 - Insert news");
            System.out.println("2 - View list news");
            System.out.println("3 - Average rate");
            System.out.println("4 - Exit");
            int choose = in.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Insert news");
                    News news = new News();
                    news.setTitle("BK");
                    news.setPublishDate("2022");
                    news.setAuthor("Q");
                    news.setContent("123");

                    ArrayList<String> arr = new ArrayList<String>();
                    arr.add(news.getTitle());
                    arr.add(news.getPublishDate());
                    arr.add(news.getAuthor());
                    arr.add(news.getContent());

                    Scanner in2 = new Scanner(System.in);
                    System.out.println("Nhap danh gia 1: ");
                    int a = in2.nextInt();
                    System.out.println("Nhap danh gia 2: ");
                    int b = in2.nextInt();
                    System.out.println("Nhap danh gia 3: ");
                    int c = in2.nextInt();

                    break;
                case 2:
                    System.out.println("View list news");
                    break;
                case 3:
                    System.out.println("Average rate");
                    break;
                default:
                    System.out.println("Exit");
                    condition = false;
                    break;
            }
        } while (condition);
    }
}
