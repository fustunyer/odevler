package day08;

import java.util.Scanner;

public class TurneryBuyukHarfVeyaDegil {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir harf alýn eðer harf büyük harf ise ekrana “Büyük harf” yazdýrýn.
Diðer durumlarda ekrana “Büyük harf degil” yazdýrýn.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir harf giriniz");
		char harf = scan.next().charAt(0);
		
		String result = harf>='A' && harf<='Z' ? "Büyük Harf" : "Büyük harf deðil";
		System.out.println(result);
			
		scan.close();
		

	}

}
