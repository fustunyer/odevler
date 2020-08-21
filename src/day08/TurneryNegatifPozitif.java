package day08;

import java.util.Scanner;

public class TurneryNegatifPozitif {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir tamsayý alýn eðer tamsayý 0 dan kucuk ise ekrana “Negatif” yazdýrýn.
Diðer durumlarda ekrana “Negatif degil” yazdýrýn.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayý giriniz");
		int sayi = scan.nextInt();
		
		String result = sayi<0 ? "Negatif" : "Negatif deðil";
		System.out.println(result);
		scan.close();
		

	}

}
