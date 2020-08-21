package day05;

import java.util.Scanner;

public class DortBasamakliSayi {

	public static void main(String[] args) {
		/*
		 * Kullanýcýnýn girdiði 4 basamaklý sayýnýn ilk ve son rakamýnýn 
		 * toplamýný ekrana yazdýran bir program yazýnýz.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Dört basamaklý bir sayý giriniz:");
		int sayi=scan.nextInt();
		
		int birlerBasamagý=sayi%10;
		int binlerBasamagý=(sayi/1000)%10;
		System.out.println(binlerBasamagý+" "+birlerBasamagý);	
		/*
		 * Kullanýcýnýn girdiði 4 basamaklý sayýnýn tüm rakamlarýnýn toplamýný
		ekrana yazdýran bir program yazýnýz.
		 */
		int onlarBasamagý=(sayi/10)%10;
		int yuzlerBasamagý=(sayi/100)%10;
		
		System.out.println(binlerBasamagý+yuzlerBasamagý+onlarBasamagý+birlerBasamagý);
		
		
		
		
		scan.close();
		
		
		
		
	}

}
