package com.baitapoop.bai3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int choose;
        ArrayList<Student> listSV = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean condition = true;

        do {
            menu();
            choose = in.nextInt();

            switch (choose) {
                case 1:
                    System.out.println();
                    addStudent(listSV);
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Insert ID: ");
                    editStudent(listSV, in.nextInt());
                    break;
                case 3:
                    System.out.println();
                    System.out.print("Insert ID: ");
                    deleteStudent(listSV, in.nextInt());
                    break;
                case 4:
                    sortByGpa(listSV);
                    break;
                case 5:
                    sortByName(listSV);
                    break;
                case 6:
                    showStudent(listSV);
                    break;
                case 0:
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
        System.out.println("1 - Add student");
        System.out.println("2 - Edit student by id");
        System.out.println("3 - Delete student by id");
        System.out.println("4 - Sort student by gpa");
        System.out.println("5 - Sort student by name");
        System.out.println("6 - Show student");
        System.out.println("0 - Exit");
        System.out.print("Choose: ");
    }

    public static void addStudent(ArrayList<Student> arr) {
        Student sv = new Student();
        System.out.println("Add Student");
        Scanner in2 = new Scanner(System.in);

        System.out.print("ID: ");
        int t = in2.nextInt();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId() == t) {
                System.out.print("Nhập lại ID: ");
                t = in2.nextInt();
                i = -1;
            }
        }
        sv.setId(t);
        System.out.print("Name: ");
        sv.setName(in2.next());
        System.out.print("Age: ");
        sv.setAge(in2.nextInt());
        System.out.print("Address: ");
        sv.setAddress(in2.next());
        System.out.print("GPA: ");
        sv.setGpa(in2.nextFloat());

        arr.add(sv);
        System.out.println();
    }

    public static boolean notExist(ArrayList<Student> arr, int n) {
        for (Student i : arr) {
            if (i.getId() == n) {
                return true;
            }
        }
        return false;
    }

    public static void editStudent(ArrayList<Student> arr, int n) {
        Scanner in3 = new Scanner(System.in);

        if (notExist(arr, n)) {
            for (Student i : arr) {
                if (i.getId() == n) {
                    System.out.print("Name: ");
                    i.setName(in3.next());
                    System.out.print("Age: ");
                    i.setAge(in3.nextInt());
                    System.out.print("Address: ");
                    i.setAddress(in3.next());
                    System.out.print("GPA: ");
                    i.setGpa(in3.nextFloat());
                }
            }
        } else {
            System.out.println("Not exist!");
        }
        System.out.println();
    }

    public static void deleteStudent(ArrayList<Student> arr, int n) {
        if (notExist(arr, n)) {
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).getId() == n) {
                    arr.remove(i);
                }
            }
            System.out.println("Removed");
        } else {
            System.out.println("Not exist!");
        }
    }

    public static void sortByGpa(ArrayList<Student> arr) {
        System.out.println();
        if (arr.size() == 0) {
            System.out.println("Empty!");
        } else {
            arr.sort(Comparator.comparing(Student::getGpa));
            System.out.println("Done!");
        }
        System.out.println();
    }

    public static void sortByName(ArrayList<Student> arr) {
        System.out.println();
        if (arr.size() == 0) {
            System.out.println("Empty!");
        } else {
            arr.sort(Comparator.comparing(Student::getName));
            System.out.println("Done!");
        }
        System.out.println();
    }

    public static void showStudent(ArrayList<Student> arr) {
        System.out.println();
        System.out.println("List Students");
        if (arr.size() == 0) {
            System.out.println("Empty!");
        } else {
            for (Student i : arr) {
                i.display();
                System.out.println();
            }
        }
    }
}
