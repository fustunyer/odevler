package day08;

import java.util.Scanner;

public class TurneryBuyukHarfVeyaDegil {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir harf al�n e�er harf b�y�k harf ise ekrana �B�y�k harf� yazd�r�n.
Di�er durumlarda ekrana �B�y�k harf degil� yazd�r�n.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir harf giriniz");
		char harf = scan.next().charAt(0);
		
		String result = harf>='A' && harf<='Z' ? "B�y�k Harf" : "B�y�k harf de�il";
		System.out.println(result);
			
		scan.close();
		

	}

}
