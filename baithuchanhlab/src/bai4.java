package baitapjava;
import java.util.Scanner;
public class bai4 {

	 
	     public static void main(String[] args) {
	        int number;
	        
	        Scanner scanner = new Scanner(System.in);
	         
	        System.out.println("Nhap so bat ki (tu 1 den 12): ");
	        number = scanner.nextInt();
	         
	        switch (number) {
	            case 1:
	                System.out.println("Thang 1.");
	                break;
	            case 2:
	                System.out.println("Thang 2.");
	                break;
	            case 3:
	                System.out.println("Thang 3.");
	                break;
	            case 4:
	                System.out.println("Thang 4.");
	                break;
	            case 5:
	                System.out.println("Thang 5.");
	                break;
	            case 6:
	                System.out.println("Thang 6.");
	                break;
	            case 7:
	                System.out.println("thang 7.");
	                break;
	            case 8:
	                System.out.println("thang 8.");
	                break;
	            case 9:
	                System.out.println("thang 9.");
	                break;
	            case 10:
	                System.out.println("thang 10.");
	                break;
	            case 11:
	                System.out.println("thang 11.");
	                break;
	            case 12:
	                System.out.println("thang 12.");
	                break;
	            default:
	                System.out.println("Nhập số không hợp lệ.");
	        }
	    }
	 
}