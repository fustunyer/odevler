package day08;

import java.util.Scanner;

public class TurneryUrunIndirimi {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan alacaðý ürün miktarýný ve ürünün birim fiyatýný alýn. 
		 * Eðer urun miktarý 1000 den fazla ise
			Kullanýcýya %10 indirim yapýn ve ödemesi gereken toplam parayý ekrana yazdýrýn. 
			Diðer durumlarda ödemesi gereken toplam parayý herhangi bir indirim yapmadan ekrana yazdýrýn.
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Alacaginiz urunun miktarý:");
		int miktar=scan.nextInt();
		System.out.println("Alacaginiz urunun fiyati:");
		int fiyat=scan.nextInt();
		
		double result = miktar>1000 ? miktar*fiyat*0.9 : miktar*fiyat;
		System.out.println(result);
		
		scan.close();

	}

}
