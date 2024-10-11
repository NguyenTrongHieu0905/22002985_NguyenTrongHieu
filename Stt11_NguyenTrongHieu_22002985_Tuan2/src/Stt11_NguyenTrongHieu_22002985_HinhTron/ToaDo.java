package Stt11_NguyenTrongHieu_22002985_HinhTron;

public class ToaDo {
    // khai bao thuoc tinh
    private String ten;
    private double x;
    private double y;
    // dong goi va rang buoc
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Ham tao constructor
    public ToaDo(double x, double y) {
        this.ten = ten;
        this.x = x;
        this.y = y;
    }

    public ToaDo() {
		// TODO Auto-generated constructor stub
	}

	// Mau in
    @Override
    public String toString() {
        String s = String.format("(%-2s; %-2s): ", getTen(), getX(), getY());
        return s;
    }
}