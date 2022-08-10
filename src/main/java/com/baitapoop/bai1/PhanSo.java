package com.baitapoop.bai1;

public class PhanSo {
    private int tu, mau;

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public void display() {
        System.out.println(getTu() + "/" + getMau());
    }

    public int UCLN(int a, int b) {
        int uoc = 0;
        for (int i = 1; i <= Math.min(Math.abs(a), Math.abs(b)); i++) {
            if (a % i == 0 && b % i == 0) {
                uoc = i;
            }
        }
        return uoc;
    }

    public void toiGian() {
        int i = UCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }

    public void congPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PhanSo tong = new PhanSo(ts, ms);
        tong.toiGian();
        System.out.println("Tổng hai phân số = " + tong.getTu() + "/" + tong.getMau());
    }

    public void truPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PhanSo hieu = new PhanSo(ts, ms);
        hieu.toiGian();
        System.out.println("Hiệu hai phân số = " + hieu.getTu() + "/" + hieu.getMau());
    }

    public void nhanPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        PhanSo tich = new PhanSo(ts, ms);
        tich.toiGian();
        System.out.println("Tích hai phân số = " + tich.getTu() + "/" + tich.getMau());
    }

    public void chiaPhanSo(PhanSo ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        PhanSo thuong = new PhanSo(ts, ms);
        thuong.toiGian();
        System.out.println("Thương hai phân số = " + thuong.getTu() + "/" + thuong.getMau());
    }
}
