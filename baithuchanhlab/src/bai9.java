package baitapjava;
import java.util.Scanner;
public class bai9 {

public static void main(String[] args) {
    String chuoi;
    int soKyTuInHoa = 0, soKyTuInThuong = 0, soChuSo = 0;
    Scanner scanner = new Scanner(System.in);
        
    
    do {
        System.out.println("Nhap chuoi bat ki: ");
        chuoi = scanner.nextLine();
    } while (chuoi.length() > 80);
        
    
    for (int i = 0; i < chuoi.length(); i++) {
        
        if (Character.isUpperCase(chuoi.charAt(i))) {
            soKyTuInHoa++;
        }
            
        
        if (Character.isLowerCase(chuoi.charAt(i))) {
            soKyTuInThuong++;
        }
            
        
        if (Character.isDigit(chuoi.charAt(i))) {
            soChuSo++;
        }
    }
        
    System.out.println("Trong chuoi " + chuoi +
        " co " + soKyTuInHoa + " ky tu hoa," +
        " co " + soKyTuInThuong + " ky tu thuong" +
        " va co " + soChuSo + " so.");
	}
}