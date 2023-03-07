package baitapjava;
import java.util.Scanner;
public class bai3 {
	    public static void main(String[] args) {
	        int age, year;
	        String name, ageGroup;
	        Scanner scanner = new Scanner(System.in);
	         
	        System.out.println("Nhap ten: ");
	        name = scanner.nextLine();
	        System.out.println("Nhap nam sinh: ");
	        year = scanner.nextInt();
	        age = 2023 - year;  
	        if (age < 16) {
	            ageGroup = "Tuoi vi thanh nien.";
	        } else if (age >= 16 && age < 18) {
	            ageGroup = "Tuoi truong thanh.";
	        } else {
	            ageGroup = "Ban da Gia lam roi.";
	        }
	         
	        System.out.println("Ban " + name + " thuoc nhom " + ageGroup);	 
	}
}
