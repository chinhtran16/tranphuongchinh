package baitapjava;
import java.util.Scanner;
public class bai5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=1,i,tong=0;
        do{
            System.out.print("nhap so thu " + n + ":");
            n++;
            i = scanner.nextInt();
            tong+=i;
        }while(tong<100);
 System.out.println("tong cac so da nhap la " + tong + " lon hon 100");
        
    }
}