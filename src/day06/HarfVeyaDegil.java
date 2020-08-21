package day06;

import java.util.Scanner;

public class HarfVeyaDegil {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir character alýn eðer character bir harf ise ekrana
		 *  “Harf” yazdýrýn.Diðer durumlarda ekrana “Harf deðil” yazdýrýn.
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Bir karakter yazýn:");
		char harf = scan.next().charAt(0);
		if((harf>='a'&& harf<='z')||(harf>='A'&& harf<='Z')) {
			System.out.println("harf");			
		}else {
			System.out.println("harf degil");
			
		}
					
		scan.close();

	}

}
