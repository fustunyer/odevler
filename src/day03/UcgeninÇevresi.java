package day03;

import java.util.Scanner;

public class UcgeninÇevresi {

	public static void main(String[] args) {
		/*
		Not 1: Üçgenin Cevresi: a + b + c
		Kenar uzunluklarý kullanýcýdan alýnan bir üçgenin çevresini hesaplayan bir Program yazýnýz. (byte kullanýnýz)
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("üçgenin 1. kenarýný giriniz: ");
		System.out.println("üçgenin 2. kenarýný giriniz: ");
		System.out.println("üçgenin 3. kenarýný giriniz: ");
		byte a = scan.nextByte();
		byte b = scan.nextByte();
		byte c = scan.nextByte();
		System.out.print("üçgenin çevresi= ");
		System.out.println(a+b+c);
			
		
		
		
		scan.close();
		
	}

}
