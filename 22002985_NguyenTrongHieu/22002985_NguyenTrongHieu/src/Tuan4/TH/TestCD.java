package Tuan4.TH;

public class TestCD {
    public static void main(String[] args) {
        try {
            // Khởi tạo danh sách CD
            ArrayCD arrayCD = new ArrayCD();

            // Tạo và thêm các CD vào danh sách
            CD cd1 = new CD();
            cd1.setMaCD("23456789");
            cd1.setTuaCD("Mua Xuan");
            cd1.setCaSy("Dam Vinh Biet");
            cd1.setSoBaiHat(10);
            cd1.setGia(5000);

            CD cd2 = new CD();
            cd2.setMaCD("23456781");
            cd2.setTuaCD("Mua Xuan");
            cd2.setCaSy("Dam Vinh Biet");
            cd2.setSoBaiHat(10);
            cd2.setGia(5000);

            CD cd3 = new CD();
            cd3.setMaCD("23456780");
            cd3.setTuaCD("Mua Xuan");
            cd3.setCaSy("Dam Vinh Biet");
            cd3.setSoBaiHat(10);
            cd3.setGia(5000);

            CD cd4 = new CD();
            cd4.setMaCD("23456785");
            cd4.setTuaCD("Mua Xuan");
            cd4.setCaSy("Dam Vinh Biet");
            cd4.setSoBaiHat(10);
            cd4.setGia(5000);

            arrayCD.themCD(cd1);
            arrayCD.themCD(cd2);
            arrayCD.themCD(cd3);
            arrayCD.themCD(cd4);

            // Hiển thị danh sách trước khi sắp xếp
            System.out.println("Danh sách CD trước khi sắp xếp:");
            arrayCD.hienThi();

            // Sắp xếp danh sách
            System.out.println("\nDanh sách CD sau khi sắp xếp:");
            arrayCD.sapXep();
            arrayCD.hienThi();

            // Xóa một CD và hiển thị danh sách sau khi xóa
            System.out.println("\nDanh sách CD sau khi xóa:");
            arrayCD.xoa("23456785");
            arrayCD.hienThi();

            // Cập nhật giá của một CD và hiển thị danh sách sau khi cập nhật
            System.out.println("\nDanh sách CD sau khi cập nhật giá:");
            arrayCD.capNhat("23456780", 60000);
            arrayCD.hienThi();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
