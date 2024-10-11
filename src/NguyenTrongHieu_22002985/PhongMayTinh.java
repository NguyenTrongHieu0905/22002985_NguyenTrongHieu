package NguyenTrongHieu_22002985;

public class PhongMayTinh extends PhongHoc {
    private int soMayTinh;

    public PhongMayTinh(String maPhong, String dayNha, float dienTich, int soBongDen, int soMayTinh) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayTinh = soMayTinh;
    }

    public int getSoMayTinh() {
        return soMayTinh;
    }

    public void setSoMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Số máy tính: %d", soMayTinh);
    }

    @Override
    public boolean datChuan() {
        return duAnhSang() && (dienTich / soMayTinh >= 1.5);
    }
}