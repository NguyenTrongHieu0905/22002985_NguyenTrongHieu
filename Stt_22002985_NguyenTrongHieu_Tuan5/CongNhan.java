package Stt_22002985_NguyenTrongHieu_Tuan5;

public class CongNhan {
    private String maCN;
    private String mHo;
    private String mTen;
    private double mSP;

    // Constructor với tất cả các tham số
    public CongNhan(String maCN, String mHo, String mTen, double mSP) {
        this.maCN = maCN;
        this.mHo = mHo;
        this.mTen = mTen;
        this.mSP = mSP;
    }

    // Constructor mặc định
    public CongNhan() {
        this.maCN = "";
        this.mHo = "";
        this.mTen = "";
        this.mSP = 0.0;
    }

    // Getter và setter cho maCN
    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) throws IllegalAccessException {
        if (maCN != null && !maCN.trim().isEmpty()) {
            this.maCN = maCN;
        } else {
            throw new IllegalAccessException("Lỗi: Mã công nhân không được để trống.");
        }
    }

    // Getter và setter cho mHo
    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    // Getter và setter cho mTen
    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    // Getter và setter cho mSP
    public double getmSP() {
        return mSP;
    }

    public void setmSP(double mSP) {
        this.mSP = mSP;
    }

    // Phương thức tính lương
    public double getTinhLuong() {
        if (mSP >= 600) {
            return mSP * 0.65;
        } else if (mSP >= 400) {
            return mSP * 0.60;
        } else if (mSP >= 200) {
            return mSP * 0.55;
        } else {
            return mSP * 0.50;
        }
    }

    // Phương thức toString để in thông tin công nhân
    @Override
    public String toString() {
        return String.format("|%-10s | %-10s | %-10s | %-10.2f | %-10.2f |",
                             getMaCN(), getmHo(), getmTen(), getmSP(), getTinhLuong());
    }
}
