package day06;

import java.util.Scanner;

public class SesliHarfSessizHarf {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir harf alýn eðer 
		 * harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdýrýn.
			“b, c, d, f” den biri ise ekrana “Sessiz harf” yazdýrýn.
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Bir harf yazýn:");
		char harf = scan.next().charAt(0);
		if(harf=='a'||harf=='e'||harf=='i'||harf=='o'||harf=='u') {
			System.out.println("Sesli harf");			
		}
		if(harf=='b'||harf=='c'||harf=='d'||harf=='f') {
			System.out.println("Sessiz harf");
			
		}
					
		scan.close();

	}

}
