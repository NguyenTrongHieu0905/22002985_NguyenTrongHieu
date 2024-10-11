package Stt11_22002985_NguyenTrongHieu_Tuan6;

import java.util.Calendar;

public abstract class GiaoDich {
    protected String maGD;
    protected Calendar ngayGD;
    protected double donGia;
    protected double dienTich;

    // Constructor đầy đủ
    public GiaoDich(String maGD, Calendar ngayGD, double donGia, double dienTich) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    // Getter methods
    public String getMaGD() {
        return maGD;
    }

    public Calendar getNgayGD() {
        return ngayGD;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    // Abstract method to calculate the transaction total
    public abstract double getThanhTien();

    @Override
    public String toString() {
        return "Mã GD: " + maGD + ", Ngày: " + ngayGD.getTime() + ", Đơn giá: " + donGia + ", Diện tích: " + dienTich;
    }
}
