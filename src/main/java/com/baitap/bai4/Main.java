package com.baitap.bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean condition = true;
        ArrayList<News> arr = new ArrayList<>();

        do {
            System.out.println("Menu");
            System.out.println("1 - Insert news");
            System.out.println("2 - View list news");
            System.out.println("3 - Average rate");
            System.out.println("4 - Exit");
            int choose = in.nextInt();

            switch (choose) {
                case 1:
                    News news = new News();

                    System.out.println("Insert news");
                    Scanner in2 = new Scanner(System.in);
                    System.out.print("Title: ");
                    String title = in2.nextLine();
                    System.out.print("Date: ");
                    String pubDate = in2.nextLine();
                    System.out.print("Author: ");
                    String author = in2.nextLine();
                    System.out.print("Content: ");
                    String content = in2.nextLine();

                    news.setTitle(title);
                    news.setPublishDate(pubDate);
                    news.setAuthor(author);
                    news.setContent(content);

                    System.out.print("Nhap danh gia 1: ");
                    int a = in2.nextInt();
                    System.out.print("Nhap danh gia 2: ");
                    int b = in2.nextInt();
                    System.out.print("Nhap danh gia 3: ");
                    int c = in2.nextInt();

                    int[] array = new int[]{a, b, c};
                    news.setRateList(array);
                    arr.add(news);
                    break;
                case 2:
                    System.out.println("View list news");
                    arr.get(0).display();
                    break;
                case 3:
                    System.out.println("Average rate");
                    for (News i : arr) {
                        System.out.println("News: ");
                        i.calculate();
                        i.display();
                        System.out.println("===================");
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Exit");
                    condition = false;
                    break;
            }
        } while (condition);
    }
}
