package NguyenTrongHieu_22002985;

public class PhongThiNghiem extends PhongHoc {
    private String chuyenNganh;    // Chuyên ngành
    private int sucChua;           // Sức chứa
    private boolean coBonRua;      // Có bồn rửa không

    public PhongThiNghiem(String maPhong, String dayNha, float dienTich, int soBongDen, String chuyenNganh, int sucChua, boolean coBonRua) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.coBonRua = coBonRua;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public boolean isCoBonRua() {
        return coBonRua;
    }

    public void setCoBonRua(boolean coBonRua) {
        this.coBonRua = coBonRua;
    }

    @Override
    public String toString() {
        String bonRua = coBonRua ? "Có Bồn Rửa" : "Không Có Bồn Rửa";
        return super.toString() + String.format(", Chuyên Ngành: %s, Sức Chứa: %d, %s", chuyenNganh, sucChua, bonRua);
    }

    @Override
    public boolean datChuan() {
        return (duAnhSang() && coBonRua); // Điều kiện đạt chuẩn
    }
}