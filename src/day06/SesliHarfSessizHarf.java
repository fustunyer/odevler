package day06;

import java.util.Scanner;

public class SesliHarfSessizHarf {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir harf al�n e�er 
		 * harf �a, e, i, o, u� dan biri ise ekrana �Sesli harf� yazd�r�n.
			�b, c, d, f� den biri ise ekrana �Sessiz harf� yazd�r�n.
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Bir harf yaz�n:");
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
