package NguyenTrongHieu_22002985;

import java.util.Scanner;

public class TestPhongHoc {

    public static void main(String[] args) {
        QuanLyDanhSachPhongHoc danhSachPhongHoc = new QuanLyDanhSachPhongHoc();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== QUẢN LÝ PHÒNG HỌC ===");
            System.out.println("1. Thêm phòng học");
            System.out.println("2. Xóa phòng học");
            System.out.println("3. Hiển thị danh sách phòng học");
            System.out.println("4. Hiển thị danh sách phòng đạt chuẩn");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            int chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    // Thêm phòng học mới
                    System.out.print("Nhập mã phòng: ");
                    String maPhong = scanner.next();
                    System.out.print("Nhập dãy nhà: ");
                    String dayNha = scanner.next();
                    System.out.print("Nhập diện tích: ");
                    float dienTich = scanner.nextFloat();
                    System.out.print("Nhập số bóng đèn: ");
                    int soBongDen = scanner.nextInt();

                    System.out.println("Chọn loại phòng học:");
                    System.out.println("1. Phòng lý thuyết");
                    System.out.println("2. Phòng máy tính");
                    System.out.println("3. Phòng thí nghiệm");
                    int loaiPhong = scanner.nextInt();

                    if (loaiPhong == 1) {
                        System.out.print("Có máy chiếu không (true/false): ");
                        boolean coMayChieu = scanner.nextBoolean();
                        PhongHocLyThuyet phongLyThuyet = new PhongHocLyThuyet(maPhong, dayNha, dienTich, soBongDen, coMayChieu);
                        danhSachPhongHoc.themPhong(phongLyThuyet);
                    } else if (loaiPhong == 2) {
                        System.out.print("Nhập số máy tính: ");
                        int soMayTinh = scanner.nextInt();
                        PhongMayTinh phongMayTinh = new PhongMayTinh(maPhong, dayNha, dienTich, soBongDen, soMayTinh);
                        danhSachPhongHoc.themPhong(phongMayTinh);
                    } else if (loaiPhong == 3) {
                        System.out.print("Nhập chuyên ngành: ");
                        String chuyenNganh = scanner.next();
                        System.out.print("Nhập sức chứa: ");
                        int sucChua = scanner.nextInt();
                        System.out.print("Có bồn rửa không (true/false): ");
                        boolean coBonRua = scanner.nextBoolean();
                        PhongThiNghiem phongThiNghiem = new PhongThiNghiem(maPhong, dayNha, dienTich, soBongDen, chuyenNganh, sucChua, coBonRua);
                        danhSachPhongHoc.themPhong(phongThiNghiem);
                    }
                    break;

                case 2:
                    // Xóa phòng học
                    System.out.print("Nhập mã phòng cần xóa: ");
                    String maPhongXoa = scanner.next();
                    danhSachPhongHoc.xoaPhong(maPhongXoa);
                    break;

                case 3:
                    // Hiển thị danh sách phòng học
                    System.out.println("=== DANH SÁCH PHÒNG HỌC ===");
                    System.out.println(danhSachPhongHoc.toString());
                    break;

                case 4:
                    // Hiển thị danh sách phòng đạt chuẩn
                    System.out.println("=== DANH SÁCH PHÒNG ĐẠT CHUẨN ===");
                    for (PhongHoc phong : danhSachPhongHoc.layPhongDatChuan()) {
                        System.out.println(phong.toString());
                    }
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        }
    }
}