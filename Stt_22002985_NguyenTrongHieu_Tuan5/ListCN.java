package Stt_22002985_NguyenTrongHieu_Tuan5;

public class ListCN {
    private CongNhan[] dsCN; // Mảng chứa danh sách công nhân
    private int count;       // Số lượng công nhân hiện tại

    // Constructor để khởi tạo danh sách với kích thước n
    public ListCN(int n) {
        dsCN = new CongNhan[n];
        count = 0;
    }

    // Phương thức thêm công nhân vào danh sách
    public boolean addCN(CongNhan cn) {
        if (count < dsCN.length) {
            dsCN[count] = cn;
            count++;
            return true;
        } else {
            return false; // Danh sách đã đầy
        }
    }

    // Phương thức lấy công nhân tại chỉ số i
    public CongNhan getCN(int i) {
        if (i >= 0 && i < count) {
            return dsCN[i];
        } else {
            return null; // Chỉ số không hợp lệ
        }
    }

    // Phương thức trả về số lượng công nhân hiện tại
    public int getCount() {
        return count;
    }

    // Phương thức trả về tất cả công nhân dưới dạng chuỗi
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Danh sách công nhân:\n");
        for (int i = 0; i < count; i++) {
            sb.append(dsCN[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
