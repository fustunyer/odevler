package day09;

import java.util.Scanner;

public class TekCift {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir tamsayý girmesini isteyin,
		 *  tamsayý çift ise ekrana “Çift” tek ise ekrana “Tek”
			yazdýrýn.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayý yazýnýz:");
		int sayi = scan.nextInt();
		
		String result = sayi%2==0 ? "ÇÝft Sayý" : "Tek sayý" ;
		System.out.println(result);
		scan.close();
		
		
	}

}
