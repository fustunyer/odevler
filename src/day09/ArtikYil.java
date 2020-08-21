package day09;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir yýl girmesini isteyin,
		 *  yýl artýk yýl ise ekrana “Artýk yýl” degilse ekrana 
		 *  “Artýk yýl degil” yazdýrýn.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir yýl yazýnýz:");
		int yil= scan.nextInt();
		
		String result = yil%400==0&&yil%100==0 ?  "Artýk yýl" : yil%4==0 ? "Artýk yil" : "Artýk yýl deðil";
		System.out.println(result);
		
		//Kullanýcýdan alýnan yýlýn artýk yýl olma durumunu kontrol eden methodu yazýnýz. true yada false
		// yýl 400 ve 100 bölünebilecek
		// 100 e bölünmüyor ise 4 e bölünecek
		
		
		
		
		
		scan.close();
	}

}
