package Tuan4.TH;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayCD {
    private List<CD> danhSachCD;

    // Constructor khởi tạo danh sách CD
    public ArrayCD() {
        danhSachCD = new ArrayList<>();
    }

    // Thêm CD vào danh sách
    public void themCD(CD cd) {
        danhSachCD.add(cd);
    }

    // Xóa CD khỏi danh sách dựa trên mã CD
    public void xoa(String maCD) {
        boolean removed = danhSachCD.removeIf(cd -> cd.getMaCD().equals(maCD));
        if (!removed) {
            System.out.println("CD có mã " + maCD + " không tồn tại.");
        }
    }

    // Cập nhật giá của CD dựa trên mã CD
    public void capNhat(String maCD, double giaMoi) {
        boolean found = false;
        for (CD cd : danhSachCD) {
            if (cd.getMaCD().equals(maCD)) {
                cd.setGia(giaMoi);
                found = true;
                System.out.println("Cập nhật giá thành công cho CD có mã " + maCD);
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy CD có mã " + maCD);
        }
    }

    // Sắp xếp danh sách CD theo giá
    public void sapXep() {
        Collections.sort(danhSachCD, new Comparator<CD>() {
            @Override
            public int compare(CD cd1, CD cd2) {
                return Double.compare(cd1.getGia(), cd2.getGia());
            }
        });
    }

    // Hiển thị danh sách CD
    public void hienThi() {
        if (danhSachCD.isEmpty()) {
            System.out.println("Danh sách CD trống.");
        } else {
            for (CD cd : danhSachCD) {
                System.out.println(cd);
            }
        }
    }
}
