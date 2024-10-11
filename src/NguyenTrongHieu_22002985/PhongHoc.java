package NguyenTrongHieu_22002985;

public abstract class PhongHoc {
    private String maPhong;
    private String dayNha;
    private float dienTich;
    private int soBongDen;

    public PhongHoc(String maPhong, String dayNha, float dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    // Getter và Setter cho các thuộc tính
    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getDayNha() {
        return dayNha;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }

    // Kiểm tra ánh sáng
    public boolean duAnhSang() {
        return (dienTich / soBongDen) <= 10;  // Đủ sáng khi 10m² có 1 bóng đèn
    }

    @Override
    public String toString() {
        return String.format("Mã phòng: %s, Dãy nhà: %s, Diện tích: %.2f m², Số bóng đèn: %d", 
                             maPhong, dayNha, dienTich, soBongDen);
    }

    // Phương thức để kiểm tra xem phòng có đạt chuẩn không (được override bởi lớp con)
    public boolean datChuan() {
        return duAnhSang();
    }
}