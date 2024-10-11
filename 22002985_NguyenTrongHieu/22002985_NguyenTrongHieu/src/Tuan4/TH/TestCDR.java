package Tuan4.TH;

import java.util.GregorianCalendar;

public class TestCDR {
    public static void main(String[] args) {
        try {
            // Khởi tạo danh sách CD với kích thước ban đầu là 2
            ListCDM list = new ListCDM(2);

            // Tạo và thêm các CD vào danh sách
            CDR cdr1 = new CDR("23456789", "Mua Xuan", "Dam Vinh Biet", new GregorianCalendar(2012, GregorianCalendar.DECEMBER, 23), 10, 5000);
            CDR cdr2 = new CDR("23456781", "Mua Xuan", "Dam Vinh Biet", new GregorianCalendar(2012, GregorianCalendar.DECEMBER, 23), 10, 5000);
            CDR cdr3 = new CDR("23456780", "Mua Xuan", "Dam Vinh Biet", new GregorianCalendar(2012, GregorianCalendar.DECEMBER, 23), 10, 5000);
            CDR cdr4 = new CDR("23456785", "Mua Xuan", "Dam Vinh Biet", new GregorianCalendar(2012, GregorianCalendar.DECEMBER, 23), 10, 5000);

            list.themCDR(cdr1);
            list.themCDR(cdr2);
            list.themCDR(cdr3);
            list.themCDR(cdr4);

            // Hiển thị danh sách trước khi sắp xếp
            System.out.println("Danh sách CD trước khi sắp xếp:");
            list.hienThi();

            // Sắp xếp danh sách
            System.out.println("\nDanh sách CD sau khi sắp xếp:");
            list.sapXep();
            list.hienThi();

            // Xóa một CD và hiển thị danh sách sau khi xóa
            System.out.println("\nDanh sách CD sau khi xóa:");
            list.xoa("23456785");
            list.hienThi();

            // Cập nhật giá của một CD và hiển thị danh sách sau khi cập nhật
            System.out.println("\nDanh sách CD sau khi cập nhật giá:");
            list.capNhat("23456780", 60000);
            list.hienThi();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}