package baitapjava;
import java.util.Scanner;
import java.text.DecimalFormat;
public class bai8 {
	 
	    public static void main(String[] args) {
	        int n, sum = 0, number;
	        float avgNumber;
	        Scanner Scanner = new Scanner(System.in);
	         
	        // làm tròn đến 2 chữ số thập phân
	        DecimalFormat decimalFormat = new DecimalFormat("#.##");    
	         
	        System.out.println("Nhap day so nguyen: ");
	        n = Scanner.nextInt();
	         
	        /*
	         * bắt đầu duyệt từ biến đếm count = 1 
	         * nếu count còn <= n thì nhập vào số number thứ count
	         * sau đó cộng giá trị của biến number vào biến sum
	         * vòng lặp dừng khi biến đếm count > n.
	         */
	        for (int count = 1; count <=n; count++) {
	            System.out.println("Nhap so thu: " + count + ": ");
	            number = Scanner.nextInt();
	            sum += number;
	        }
	         
	        avgNumber = (float) sum / n;
	        System.out.println("Trung binh cong = " + decimalFormat.format(avgNumber));
	    }
	 
	}