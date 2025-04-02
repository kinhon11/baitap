package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----- QUẢN LÝ CÁN BỘ -----");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị danh sách cán bộ");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Xử lý dòng trống

            switch (choice) {
                case 1:
                    System.out.println("Chọn loại cán bộ (1. Công nhân, 2. Kỹ sư, 3. Nhân viên): ");
                    int type = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Họ tên: ");
                    String hoTen = scanner.nextLine();
                    System.out.print("Tuổi: ");
                    int tuoi = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Giới tính: ");
                    String gioiTinh = scanner.nextLine();
                    System.out.print("Địa chỉ: ");
                    String diaChi = scanner.nextLine();

                    if (type == 1) {
                        System.out.print("Bậc: ");
                        int bac = scanner.nextInt();
                        qlcb.themCanBo(new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac));
                    } else if (type == 2) {
                        System.out.print("Ngành đào tạo: ");
                        String nganhDaoTao = scanner.nextLine();
                        qlcb.themCanBo(new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao));
                    } else {
                        System.out.print("Công việc: ");
                        String congViec = scanner.nextLine();
                        qlcb.themCanBo(new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec));
                    }
                    break;

                case 2:
                    System.out.print("Nhập tên cần tìm: ");
                    String ten = scanner.nextLine();
                    CanBo canBo = qlcb.timKiemTheoTen(ten);
                    if (canBo != null) {
                        canBo.hienThiThongTin();
                    } else {
                        System.out.println("Không tìm thấy cán bộ!");
                    }
                    break;

                case 3:
                    qlcb.hienThiDanhSach();
                    break;

                case 4:
                    System.out.println("Thoát chương trình!");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
