package day11;

import java.util.Scanner;

public class IsimSoyisim {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan ilk ve soy ismini al�n
		 * ilk ve soy isminin ka� harften olu�tu�unu ekrana yazd�r�n.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("isminizi giriniz:");
		String isim=scan.next();
		System.out.println("Soyisminizi giriniz:");
		String soyisim=scan.next();
		
		System.out.println("�sminiz  "+ (isim.trim().length())+" harften olu�maktad�r.");
		System.out.println("Soyisminiz  "+ (soyisim.trim().length())+" harften olu�maktad�r.");
		
		/*
		 * Kullan�c�dan ilk ve soy ismini al�n 
		 * ilk ve soy isminin ilk harflerini b�y�k harf olarak ekrana yazd�r�n.
		 */
		
		System.out.println(isim.toUpperCase().charAt(0));
		System.out.println(soyisim.toUpperCase().charAt(0));
		
		
		
		
		scan.close();
		
		
	}

}
