package day04;

import java.util.Scanner;

public class AdSoyadAdresYazdir {

	public static void main(String[] args) {
		// Kullan�c�dan ad, soyad ve adresini al�p ekrana yazd�ran bir program yaz�n�z.
		//Ad ve soyad ilk sat�rda, adres ikinci sat�rda olsun.
		//(String kullan�n�z)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ad�n�z� yaz�n�z: ");
		System.out.println("Soyad�n�z� yaz�n�z: ");
		System.out.println("Adresinizi yz�n�z: ");
		String ad = scan.nextLine();
		String soyad = scan.nextLine();
		String adres = scan.nextLine();
		System.out.print(ad);
		System.out.println(soyad);
		System.out.println(adres);
				
		scan.close();
	}

}
