package Stt11_NguyenTrongHieu_22002985_HinhTron;

public class HinhTron {
    private double banKinh;
    private ToaDo tam;

    // Constructors
    public HinhTron() {
        this(0.0, new ToaDo());
    }

    public HinhTron(double banKinh, ToaDo tam) {
        this.banKinh = banKinh;
        this.tam = new ToaDo(tam.getX(), tam.getY()); 
    }

    // Getter and Setter methods
    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if (banKinh > 0) {
            this.banKinh = banKinh;
        } else {
            this.banKinh = 0; 
        }
    }

    public ToaDo getTam() {
        return tam;
    }

    public void setTam(ToaDo tam) {
        this.tam = new ToaDo(tam.getX(), tam.getY());
    }

    // Method to calculate area
    public double getDienTich() {
        return banKinh * banKinh * Math.PI;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("Ban kinh: %5.2f; Dien tich: %10.2f; Tam: %s", banKinh, getDienTich(), tam);
    }
}