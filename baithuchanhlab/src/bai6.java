package baitapjava;
import java.util.Scanner;
public class bai6 {	

	    public static void main(String[] args) {
	        int number, temp = 1;
	        long giaiThua = 1;
	         
	        Scanner scanner = new Scanner(System.in);
	         
	        do {
	            System.out.println("Nhap so bat ki: ");
	            number = scanner.nextInt();
	        } while ((number <= 0) || (number > 10));
	         
	        /*
	         * Nếu giá trị biến temp còn nhỏ hơn hoặc bằng number
	         * thì còn thực hiện đoạn lệnh bên trong while
	         */
	        while (temp <= number) {
	            giaiThua *= temp;
	            temp++;
	        }
	         
	        System.out.println(number + "! = " + giaiThua);
	    }
	 }