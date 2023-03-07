package baitapjava;
import java.util.Scanner;
public class bai2{
	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.println("nhap vao so : ");
	        int n = scanner.nextInt();
	        if(n%2==0)
	        {
	            System.out.println("So chan");
	        }
	        else
	        {
	            System.out.println("So le");
	        }
	    }
	}