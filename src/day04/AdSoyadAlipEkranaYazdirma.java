package day04;

import java.util.Scanner;

public class AdSoyadAlipEkranaYazdirma {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan ad ve soyadýný alýp ekrana yazdýran bir program yazýnýz.
(String kullanýnýz)
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Adýnýzý ve Soyadýnýzý giriniz: ");
		String AdýSoyadý = scan.nextLine();
		System.out.println(AdýSoyadý);
		
		
		
		
		scan.close();

	}

}
