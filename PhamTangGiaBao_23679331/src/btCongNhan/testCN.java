package btCongNhan;

import java.util.Scanner;

public class testCN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã công nhân: ");
        String maCN = scanner.nextLine();

        System.out.print("Nhập họ tên công nhân: ");
        String hoTen = scanner.nextLine();

        System.out.print("Nhập số sản phẩm: ");
        int soSP;
        while (true) {
            try {
                soSP = Integer.parseInt(scanner.nextLine());
                if (soSP > 0) break;
                else System.out.print("Số sản phẩm phải lớn hơn 0. Nhập lại: ");
            } catch (NumberFormatException e) {
                System.out.print("Số sản phẩm không hợp lệ. Nhập lại: ");
            }
        }

        CongNhan cn = new CongNhan(maCN, hoTen, soSP);
        
        System.out.println(cn.toString());

        scanner.close();
    }
}
