package day14;

import java.util.Scanner;

public class YukaridanAsagiYazdir {

	public static void main(String[] args) {
		/*
		 * Kullanýcýya bir String girmesini söyleyin ve bu String’i yukarýdan aþaðýya doðru yazdýran
Program yazýnýz. Ornegin; CAN ==> C
								  A
								  N
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir String giriniz:");
		String a = scan.nextLine();
		
		yukaridanAsagiYazdir(a);
		
		scan.close();
	}
	public static void yukaridanAsagiYazdir(String a) {
		int i=0;
		do {
			System.out.println(a.charAt(i));
			i++;
		}while(i<a.length());
			
	}
	
}
