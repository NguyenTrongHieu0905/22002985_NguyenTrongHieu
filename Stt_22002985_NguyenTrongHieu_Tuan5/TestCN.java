package Stt_22002985_NguyenTrongHieu_Tuan5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestCN {
    
    // Phương thức để nhập thông tin công nhân và tạo đối tượng CongNhan
    public static CongNhan themCN() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhập mã công nhân:");
        String ma = sc.nextLine();
        
        System.out.println("Nhập họ công nhân:");
        String ho = sc.nextLine();
        
        System.out.println("Nhập tên công nhân:");
        String ten = sc.nextLine();
        
        double sl = 0;
        boolean validInput = false;
        
        // Xử lý nhập số sản phẩm với kiểm tra lỗi
        while (!validInput) {
            System.out.println("Nhập số sản phẩm:");
            try {
                sl = sc.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Vui lòng nhập một số hợp lệ.");
                sc.next(); // Xóa bỏ dữ liệu không hợp lệ
            }
        }
        
        // Tạo đối tượng CongNhan với thông tin đã nhập
        CongNhan cn = new CongNhan(ma, ho, ten, sl);
        
        return cn;
    }

    public static void main(String[] args) {
        // Tạo danh sách công nhân với kích thước 2
        ListCN list = new ListCN(2);
        
        // Thêm công nhân vào danh sách
        list.addCN(themCN());
        
        // Hiển thị danh sách công nhân
        System.out.println("Danh sách công nhân:");
        System.out.println(list.toString());
    }
}
