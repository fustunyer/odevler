package day04;

import java.util.Scanner;

public class AdSoyadAdresYazdir {

	public static void main(String[] args) {
		// Kullanýcýdan ad, soyad ve adresini alýp ekrana yazdýran bir program yazýnýz.
		//Ad ve soyad ilk satýrda, adres ikinci satýrda olsun.
		//(String kullanýnýz)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Adýnýzý yazýnýz: ");
		System.out.println("Soyadýnýzý yazýnýz: ");
		System.out.println("Adresinizi yzýnýz: ");
		String ad = scan.nextLine();
		String soyad = scan.nextLine();
		String adres = scan.nextLine();
		System.out.print(ad);
		System.out.println(soyad);
		System.out.println(adres);
				
		scan.close();
	}

}
