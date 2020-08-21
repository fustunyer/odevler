package day09;

import java.util.Scanner;

public class SesliSesssizHarf {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir harf alýn eðer harf “a, e, i, o, u” dan biri ise ekrana 
		 * “Sesli harf” yazdýrýn.“b, c, d, f” den biri ise ekrana “Sessiz harf” yazdýrýn.
Bu harflerin dýþýnda bir character için “Geçersiz character” yazdýrýn.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("bir harf giriniz:");
		char harf = scan.next().charAt(0);
		
		switch(harf) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("sesli harf");
			break;
		case 'b':
		case 'c':
		case 'd':
		case 'f':
			System.out.println("sessiz harf");
			break;
		default:
			System.out.println("Geçersiz karakter");
		
		}
		scan.close();

	}

}
