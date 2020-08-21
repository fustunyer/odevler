package day09;

import java.util.Scanner;

public class DikdortgenKare {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir dikdörtgenin en ve boyunu girmesini isteyin. 
		 * En ve boy eþit ise ekrana “Kare” 
		 * farklý ise ekrana “Dikdörtgen” yazdýrýn.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("iki tane kenar giriniz");
		int kenar1=scan.nextInt();
		int kenar2=scan.nextInt();
		
		String result= kenar1==kenar2 ? "kare" : "dikdörtgen";
		System.out.println(result);
		scan.close();
		
		
		
	

	}

}
