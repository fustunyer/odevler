package day04;

import java.util.Scanner;

public class AdSoyadAlipEkranaYazdirma {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan ad ve soyad�n� al�p ekrana yazd�ran bir program yaz�n�z.
(String kullan�n�z)
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ad�n�z� ve Soyad�n�z� giriniz: ");
		String Ad�Soyad� = scan.nextLine();
		System.out.println(Ad�Soyad�);
		
		
		
		
		scan.close();

	}

}
