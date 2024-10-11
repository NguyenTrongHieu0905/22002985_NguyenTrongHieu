package NguyenTrongHieu_22002985;

import java.util.ArrayList;
import java.util.List;

public class QuanLyDanhSachPhongHoc {
    private List<PhongHoc> danhSachPhong;

    public QuanLyDanhSachPhongHoc() {
        this.danhSachPhong = new ArrayList<>();
    }

    public void themPhong(PhongHoc phongHoc) {
        for (PhongHoc phong : danhSachPhong) {
            if (phong.getMaPhong().equals(phongHoc.getMaPhong())) {
                System.out.println("Phòng học đã tồn tại.");
                return;
            }
        }
        danhSachPhong.add(phongHoc);
        System.out.println("Thêm phòng thành công.");
    }

    public PhongHoc timPhong(String maPhong) {
        for (PhongHoc phong : danhSachPhong) {
            if (phong.getMaPhong().equals(maPhong)) {
                return phong;
            }
        }
        return null;
    }

    public void xoaPhong(String maPhong) {
        PhongHoc phong = timPhong(maPhong);
        if (phong != null) {
            danhSachPhong.remove(phong);
            System.out.println("Xóa phòng thành công.");
        } else {
            System.out.println("Không tìm thấy phòng.");
        }
    }

    public List<PhongHoc> layPhongDatChuan() {
        List<PhongHoc> danhSachDatChuan = new ArrayList<>();
        for (PhongHoc phong : danhSachPhong) {
            if (phong.datChuan()) {
                danhSachDatChuan.add(phong);
            }
        }
        return danhSachDatChuan;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (PhongHoc phong : danhSachPhong) {
            builder.append(phong.toString()).append("\n");
        }
        return builder.toString();
    }
}