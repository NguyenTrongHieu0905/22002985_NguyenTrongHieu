package TrongHieu_22002985;

import java.util.Scanner;

public class HinhChuNhat {
    // khai bao thuoc tinh        
    private double chieuDai;
    private double chieuRong;
    private int d;
    private int r;
    public double getChieuDai() {
        return chieuDai;
    }
    public void setChieuDai(double d) {
        if (d > 0) {
            this.chieuDai = d;
        } else {
            System.out.println("Loi d");
        }
    }
    public double getChieuRong() {
        return chieuRong;
    }
    public void setChieuRong(double r) {
        if (r <= 0) {
            System.out.println("Loi r");
        } else {
            this.chieuRong = r;
        }
    }
    // Tao contructor Ham tao dung khoi tao doi tuong 
    public HinhChuNhat() {}
    public HinhChuNhat(double chieuDai, double chieuRong) {
        if (d > 0) {
            this.chieuDai = d;
        } else {
            System.out.println("Loi d");
        }
        if (r <= 0) {
            System.out.println("Loi r");
        } else {
            this.chieuRong = r;
        }
    }
    // xay dung phuong thuc
    public double getChuVi() {
        return (getChieuDai() + getChieuRong()) * 2;
    }
    public double getDienTich() {
        return getChieuDai() * getChieuRong();
    }
    //toString
    @Override
    public String toString() {
        System.out.printf("%10s, ");
        return super.toString();
    }
    public static void main(String[] args) {
        //khoi tao doi tuong tu tao ham
        HinhChuNhat h1 = new HinhChuNhat();
        //cap nhat canh
        h1.setChieuDai(5);
        h1.setChieuRong(3);
        System.out.println("Ket qua nhap mem");
        System.out.println("Chieu dai la: " + h1.getChieuDai());
        System.out.println("Chieu rong la: " + h1.getChieuRong());
        System.out.println("Chu vi la: " + h1.getChuVi());
        System.out.println("Dien tich la: " + h1.getDienTich());
        //khoi tao H2 cap nhap cung
        HinhChuNhat h2 = new HinhChuNhat(); 
        h2.setChieuDai(7);
        h2.setChieuRong(8);
        System.out.println("Ket qua nhap mem");
        System.out.println("Chieu dai la: " + h2.getChieuDai());
        System.out.println("Chieu rong la: " + h2.getChieuRong());
        System.out.println("Chu vi la: " + h2.getChuVi());
        System.out.println("Dien tich la: " + h2.getDienTich());
        //Nhap mem
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu ban phim");
        System.out.println("Nhap chieu dai");
        double d = sc.nextDouble();
        h1.setChieuDai(d);
        System.out.println("Nhap chieu rong");
        double r = sc.nextDouble();
        h1.setChieuRong(r);
                        
                        
    }
}