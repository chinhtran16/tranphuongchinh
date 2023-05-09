package HinhHocKhongGian;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public float bankinh;

    public HinhTron() {
        ten = "HinhTron";

    }

    public void nhapBanKinh() {
        System.out.println("BanKinh =");
        Scanner Sc = new Scanner(System.in);
        bankinh = Sc.nextFloat();
    }

    public void tinhChuVi() {
        chuvi = 2 * PI * bankinh;
    }

    public void tinhDienTich() {
        dientich = PI * bankinh * bankinh;
    }
}