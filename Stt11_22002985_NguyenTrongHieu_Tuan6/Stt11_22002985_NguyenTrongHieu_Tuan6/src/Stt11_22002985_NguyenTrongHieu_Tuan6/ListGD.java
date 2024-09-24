package Stt11_22002985_NguyenTrongHieu_Tuan6;

import java.util.ArrayList;
import java.util.Calendar;

public class ListGD {
    public static void main(String[] args) {
        ArrayList<GiaoDich> danhSachGiaoDich = new ArrayList<>();

        // Tạo 3 giao dịch đất
        danhSachGiaoDich.add(new GiaoDichDat("GD001", createDate(2023, 9, 10), 1000, 200, "A"));
        danhSachGiaoDich.add(new GiaoDichDat("GD002", createDate(2013, 9, 15), 1500, 300, "B"));
        danhSachGiaoDich.add(new GiaoDichDat("GD003", createDate(2013, 9, 25), 2000, 400, "C"));

        // Tạo 3 giao dịch nhà
        danhSachGiaoDich.add(new GiaoDichNha("GD004", createDate(2022, 8, 30), 3000, 150, "cao cấp", "123 Đường A"));
        danhSachGiaoDich.add(new GiaoDichNha("GD005", createDate(2013, 9, 5), 2500, 100, "thường", "456 Đường B"));
        danhSachGiaoDich.add(new GiaoDichNha("GD006", createDate(2023, 7, 20), 2200, 80, "cao cấp", "789 Đường C"));

        // Tính tổng số lượng giao dịch đất và nhà
        int soLuongDat = 0;
        int soLuongNha = 0;
        double tongThanhTienDat = 0;
        int soGiaoDichDat = 0;

        for (GiaoDich gd : danhSachGiaoDich) {
            if (gd instanceof GiaoDichDat) {
                soLuongDat++;
                tongThanhTienDat += gd.getThanhTien();
                soGiaoDichDat++;
            } else if (gd instanceof GiaoDichNha) {
                soLuongNha++;
            }
        }

        // Tính trung bình thành tiền giao dịch đất
        double trungBinhThanhTienDat = tongThanhTienDat / soGiaoDichDat;

        // Xuất giao dịch của tháng 9 năm 2013
        System.out.println("Các giao dịch của tháng 9 năm 2013:");
        for (GiaoDich gd : danhSachGiaoDich) {
            if (gd.getNgayGD().get(Calendar.YEAR) == 2013 && gd.getNgayGD().get(Calendar.MONTH) == Calendar.SEPTEMBER) {
                System.out.println(gd);
            }
        }

        // Kết quả
        System.out.println("Tổng số lượng giao dịch đất: " + soLuongDat);
        System.out.println("Tổng số lượng giao dịch nhà: " + soLuongNha);
        System.out.println("Trung bình thành tiền giao dịch đất: " + trungBinhThanhTienDat);
    }

    // Hàm tạo ngày giao dịch
    public static Calendar createDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);  // Calendar month bắt đầu từ 0 (January = 0)
        return cal;
    }
}
