package day08;

import java.util.Scanner;

public class TurneryNegatifPozitif {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir tamsay� al�n e�er tamsay� 0 dan kucuk ise ekrana �Negatif� yazd�r�n.
Di�er durumlarda ekrana �Negatif degil� yazd�r�n.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("bir say� giriniz");
		int sayi = scan.nextInt();
		
		String result = sayi<0 ? "Negatif" : "Negatif de�il";
		System.out.println(result);
		scan.close();
		

	}

}
