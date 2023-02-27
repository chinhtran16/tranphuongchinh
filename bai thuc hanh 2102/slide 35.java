import java.util.Scanner;

public class min{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int so1; int so2;
        System.out.print("nhap so thu 1:");
        so1 = scn.nextInt();
        System.out.print("nhap so thu 2:");
        so2 = scn.nextInt();
        int min;
        min=so1;
        if(so2<so1) min=so2;
        System.out.print("So nho nhat :" +min);
    }
}