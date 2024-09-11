package btCongNhan;

import java.util.ArrayList;

public class DanhSachCongNhan {
    private ArrayList<CongNhan> danhSach;

    // Constructor không tham số, khởi tạo danh sách rỗng
    public DanhSachCongNhan() {
        this.danhSach = new ArrayList<>();
    }

    // Constructor với một danh sách công nhân
    public DanhSachCongNhan(ArrayList<CongNhan> danhSach) {
        this.danhSach = danhSach;
    }

    // Phương thức thêm công nhân vào danh sách
    public void themCongNhan(CongNhan congNhan) {
        danhSach.add(congNhan);
    }

    // Phương thức xóa công nhân khỏi danh sách
    public void xoaCongNhan(CongNhan congNhan) {
        danhSach.remove(congNhan);
    }

    // Phương thức lấy danh sách công nhân
    public ArrayList<CongNhan> getDanhSach() {
        return danhSach;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (CongNhan congNhan : danhSach) {
            sb.append(congNhan).append("\n");
        }
        return sb.toString();
    }
}
