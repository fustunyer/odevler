package day09;

import java.util.Scanner;

public class MutlakDeger {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir tamsay� girmesini isteyin, 
		 * ekrana o tamsay�n�n mutlak degerini yazd�r�n.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsay� yaz�n�z:");
		int sayi = scan.nextInt();
		
		int result= sayi<0 ? -sayi : sayi;
		System.out.println(result);
		scan.close();

	}

}
