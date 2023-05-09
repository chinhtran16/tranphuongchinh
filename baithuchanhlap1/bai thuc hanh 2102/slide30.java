package baitapjava;
import java.util.Scanner;
public class bai5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=1,i,tong;
        
            System.out.print("nhap so thu " + n );
            System.out.print(":");
            i = scanner.nextInt();
            tong=i;
            do{
            
             n++;
            System.out.print("nhap so thu " + n );
            System.out.print(":");
            i = scanner.nextInt();
            tong=tong+i;

            

        }while(tong<100);1
        
    }
}