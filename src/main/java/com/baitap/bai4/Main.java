package com.baitap.bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choose;
        ArrayList<News> arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean condition = true;

        do {
            menu();
            choose = in.nextInt();

            switch (choose) {
                case 1:
                    insertNews(arr);
                    break;
                case 2:
                    getListNews(arr);
                    break;
                case 3:
                    aveRate(arr);
                    break;
                case 4:
                    System.out.println("Exit");
                    condition = false;
                    break;
                default:
                    System.out.println("Nhập lại!");
                    break;
            }
        }
        while (condition);
    }

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1 - Insert news");
        System.out.println("2 - View list news");
        System.out.println("3 - Average rate");
        System.out.println("4 - Exit");
    }

    public static void insertNews(ArrayList<News> arr) {
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
        System.out.println();
    }

    public static void getListNews(ArrayList<News> arr) {
        System.out.println("View list news");
        if (arr.size() == 0) {
            System.out.println("Empty!");
        } else {
            for (News n : arr) {
                n.display();
                System.out.println("===================");
            }
        }
        System.out.println();
    }

    public static void aveRate(ArrayList<News> arr) {
        System.out.println("Average rate");
        if (arr.size() == 0) {
            System.out.println("Empty!");
        } else {
            for (News n : arr) {
                n.calculate();
                n.display();
                System.out.println("===================");
            }
        }
        System.out.println();
    }
}
