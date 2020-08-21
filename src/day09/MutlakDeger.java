package day09;

import java.util.Scanner;

public class MutlakDeger {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir tamsayý girmesini isteyin, 
		 * ekrana o tamsayýnýn mutlak degerini yazdýrýn.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayý yazýnýz:");
		int sayi = scan.nextInt();
		
		int result= sayi<0 ? -sayi : sayi;
		System.out.println(result);
		scan.close();

	}

}
