package day11;

import java.util.Scanner;

public class IsimSoyisim {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan ilk ve soy ismini alýn
		 * ilk ve soy isminin kaç harften oluþtuðunu ekrana yazdýrýn.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("isminizi giriniz:");
		String isim=scan.next();
		System.out.println("Soyisminizi giriniz:");
		String soyisim=scan.next();
		
		System.out.println("Ýsminiz  "+ (isim.trim().length())+" harften oluþmaktadýr.");
		System.out.println("Soyisminiz  "+ (soyisim.trim().length())+" harften oluþmaktadýr.");
		
		/*
		 * Kullanýcýdan ilk ve soy ismini alýn 
		 * ilk ve soy isminin ilk harflerini büyük harf olarak ekrana yazdýrýn.
		 */
		
		System.out.println(isim.toUpperCase().charAt(0));
		System.out.println(soyisim.toUpperCase().charAt(0));
		
		
		
		
		scan.close();
		
		
	}

}
