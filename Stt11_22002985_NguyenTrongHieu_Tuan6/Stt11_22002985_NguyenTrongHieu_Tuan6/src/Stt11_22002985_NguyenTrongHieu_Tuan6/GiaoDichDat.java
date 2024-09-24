package Stt11_22002985_NguyenTrongHieu_Tuan6;

import java.util.Calendar;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat; // A, B, C

    // Constructor đầy đủ
    public GiaoDichDat(String maGD, Calendar ngayGD, double donGia, double dienTich, String loaiDat) {
        super(maGD, ngayGD, donGia, dienTich);  // Gọi constructor của lớp cha GiaoDich
        this.loaiDat = loaiDat;
    }

    // Tính thành tiền dựa trên loại đất
    @Override
    public double getThanhTien() {
        if (loaiDat.equals("A")) {
            return dienTich * donGia * 1.5;
        } else {
            return dienTich * donGia;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Loại đất: " + loaiDat + ", Thành tiền: " + getThanhTien();
    }
}
