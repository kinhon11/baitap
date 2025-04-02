package bai1;

import java.util.ArrayList;
import java.util.List;

public class QLCB {
    private List<CanBo> danhSachCanBo = new ArrayList<>();

    public void themCanBo(CanBo canBo) {
        danhSachCanBo.add(canBo);
    }


    public CanBo timKiemTheoTen(String hoTen) {
        for (CanBo cb : danhSachCanBo) {
            if (cb.getHoTen().equalsIgnoreCase(hoTen)) {
                return cb;
            }
        }
        return null;
    }


    public void hienThiDanhSach() {
        for (CanBo cb : danhSachCanBo) {
            cb.hienThiThongTin();
            System.out.println("----------------------------");
        }
    }
}
