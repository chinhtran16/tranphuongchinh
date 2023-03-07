package baitapjava;

import java.util.Scanner;
import java.text.DecimalFormat;

public class bai1 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                DecimalFormat decimalFormat = new DecimalFormat("#.##");

                System.out.println("nhap vao so thu nhat: ");
                int sothu1 = scanner.nextInt();
                System.out.println("nhap vao so thu hai: ");
                int sothu2 = scanner.nextInt();

                int tong = sothu1 + sothu2;
                System.out.println(sothu1 + " + " + sothu2 + " = " + tong);

                int hieu = sothu1 - sothu2;
                System.out.println(sothu1 + " - " + sothu2 + " = " + hieu);

                int tich = sothu1 * sothu2;
                System.out.println(sothu1 + " * " + sothu2 + " = " + tich);

                float thuong = (float) sothu1 / sothu2;
                System.out.println(sothu1 + " / " + sothu2 + " = " +
                                decimalFormat.format(thuong)); // làm tròn thương đến 2 chữ số thập phân

                int phanDu = sothu1 % sothu2;
                System.out.println(sothu1 + " % " + sothu2 + " = " + phanDu);

                // 2. Sử dụng các toán tử so sánh đã học để so sánh 2 số đó.
                System.out.println("ket qua so sanh bang so 2 " + sothu1 + " va " +
                                sothu2 + " la " + (sothu1 == sothu2));
                System.out.println("ket qua so sanh khong bang so 2 " + sothu1 + " va " +
                                sothu2 + " la " + (sothu1 != sothu2));
                System.out.println("ket qua so sanh lon hon so 2 " + sothu1 + " va " +
                                sothu2 + " la " + (sothu1 > sothu2));
                System.out.println("ket qua so sanh lon hon hoac bang so 2 " + sothu1 + " va " +
                                sothu2 + " la " + (sothu1 >= sothu2));
                System.out.println("ket qua so sanh nho hon so 2 " + sothu1 + " va " +
                                sothu2 + " la " + (sothu1 < sothu2));
                System.out.println("ket qua so sanh nho hon hoac bang so 2 " + sothu1 + " va " +
                                sothu2 + " la " + (sothu1 <= sothu2));
        }
}