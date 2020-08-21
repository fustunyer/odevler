package day08;

import java.util.Scanner;

public class TurneryUrunIndirimi {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan alaca�� �r�n miktar�n� ve �r�n�n birim fiyat�n� al�n. 
		 * E�er urun miktar� 1000 den fazla ise
			Kullan�c�ya %10 indirim yap�n ve �demesi gereken toplam paray� ekrana yazd�r�n. 
			Di�er durumlarda �demesi gereken toplam paray� herhangi bir indirim yapmadan ekrana yazd�r�n.
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Alacaginiz urunun miktar�:");
		int miktar=scan.nextInt();
		System.out.println("Alacaginiz urunun fiyati:");
		int fiyat=scan.nextInt();
		
		double result = miktar>1000 ? miktar*fiyat*0.9 : miktar*fiyat;
		System.out.println(result);
		
		scan.close();

	}

}
