package Tuan4.TH;

import java.util.GregorianCalendar;

public class CDR {
    private String maCD;
    private String tuaCD;
    private String caSy;
    private GregorianCalendar ngayPhatHanh;
    private int soBaiHat;
    private double gia;

    public CDR(String maCD, String tuaCD, String caSy, GregorianCalendar ngayPhatHanh, int soBaiHat, double gia) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.caSy = caSy;
        this.ngayPhatHanh = ngayPhatHanh;
        this.soBaiHat = soBaiHat;
        this.gia = gia;
    }

    public String getMaCD() {
        return maCD;
    }

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public String getCaSy() {
        return caSy;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }

    public GregorianCalendar getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(GregorianCalendar ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Mã CD: " + maCD + "\n" +
               "Tựa CD: " + tuaCD + "\n" +
               "Ca Sỹ: " + caSy + "\n" +
               "Ngày Phát Hành: " + ngayPhatHanh.getTime() + "\n" +
               "Số Bài Hát: " + soBaiHat + "\n" +
               "Giá: " + gia + "\n";
    }
}
