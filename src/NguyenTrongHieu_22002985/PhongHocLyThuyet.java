package NguyenTrongHieu_22002985;

public class PhongHocLyThuyet extends PhongHoc {
    private boolean coMayChieu;

    public PhongHocLyThuyet(String maPhong, String dayNha, float dienTich, int soBongDen, boolean coMayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.coMayChieu = coMayChieu;
    }

    public boolean isCoMayChieu() {
        return coMayChieu;
    }

    public void setCoMayChieu(boolean coMayChieu) {
        this.coMayChieu = coMayChieu;
    }

    @Override
    public String toString() {
        String mayChieu = coMayChieu ? "Có máy chiếu" : "Không có máy chiếu";
        return super.toString() + String.format(", %s", mayChieu);
    }

    @Override
    public boolean datChuan() {
        return duAnhSang() && coMayChieu;
    }
}
