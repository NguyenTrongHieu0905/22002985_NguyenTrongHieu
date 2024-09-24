package Stt11_22002985_NguyenTrongHieu_Tuan6;

import java.util.Calendar;

public class GiaoDichNha extends GiaoDich {
    private String loaiNha; // "cao cấp", "thường"
    private String diaChi;

    // Constructor đầy đủ
    public GiaoDichNha(String maGD, Calendar ngayGD, double donGia, double dienTich, String loaiNha, String diaChi) {
        super(maGD, ngayGD, donGia, dienTich);  // Gọi constructor của lớp cha GiaoDich
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    // Tính thành tiền dựa trên loại nhà
    @Override
    public double getThanhTien() {
        if (loaiNha.equals("cao cấp")) {
            return dienTich * donGia;
        } else {
            return dienTich * donGia * 0.9;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Loại nhà: " + loaiNha + ", Địa chỉ: " + diaChi + ", Thành tiền: " + getThanhTien();
    }
}
