package day09;

import java.util.Scanner;

public class SesliSesssizHarf {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir harf al�n e�er harf �a, e, i, o, u� dan biri ise ekrana 
		 * �Sesli harf� yazd�r�n.�b, c, d, f� den biri ise ekrana �Sessiz harf� yazd�r�n.
Bu harflerin d���nda bir character i�in �Ge�ersiz character� yazd�r�n.
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
			System.out.println("Ge�ersiz karakter");
		
		}
		scan.close();

	}

}
