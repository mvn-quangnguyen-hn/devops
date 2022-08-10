package com.baitapoop.bai2;

public class Candidate {

    private String id, name, date;
    private float toan, van, anh;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getVan() {
        return van;
    }

    public void setVan(float van) {
        this.van = van;
    }

    public float getAnh() {
        return anh;
    }

    public void setAnh(float anh) {
        this.anh = anh;
    }

    public void display() {
        System.out.println("ID: " + getId());
        System.out.println("Tên: " + getName());
        System.out.println("Ngày sinh: " + getDate());
        System.out.println("Điểm toán: " + getToan());
        System.out.println("Điểm văn: " + getVan());
        System.out.println("Điểm anh: " + getAnh());
    }

    public boolean checkSum() {
        float sum = getToan() + getVan() + getAnh();

        return !(sum <= 1);
    }
}
