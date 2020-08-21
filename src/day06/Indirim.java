package day06;

import java.util.Scanner;

public class Indirim {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan alacaðý ürün miktarýný ve ürünün birim fiyatýný alýn. 
Eðer urun miktarý 1000 den fazla ise Kullanýcýya %10 indirim yapýn ve 
ödemesi gereken toplam parayý ekrana yazdýrýn.
 Diðer durumlarda ödemesi gereken toplam parayý herhangi bir indirim yapmadan ekrana yazdýrýn.
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Alacaginiz urunun miktarý:");
		int miktar=scan.nextInt();
		System.out.println("Alacaginiz urunun fiyati:");
		int fiyat=scan.nextInt();
		if(miktar>1000) {
			System.out.println("Indirimli tutar: "+(miktar*fiyat*0.9));
		}else {
			System.out.println("Odenecek tutar: "+(miktar*fiyat));
		}
		scan.close();

	}

}
