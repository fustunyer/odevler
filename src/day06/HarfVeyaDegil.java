package day06;

import java.util.Scanner;

public class HarfVeyaDegil {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir character al�n e�er character bir harf ise ekrana
		 *  �Harf� yazd�r�n.Di�er durumlarda ekrana �Harf de�il� yazd�r�n.
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Bir karakter yaz�n:");
		char harf = scan.next().charAt(0);
		if((harf>='a'&& harf<='z')||(harf>='A'&& harf<='Z')) {
			System.out.println("harf");			
		}else {
			System.out.println("harf degil");
			
		}
					
		scan.close();

	}

}
