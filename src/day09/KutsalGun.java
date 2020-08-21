package day09;

import java.util.Scanner;

public class KutsalGun {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir gun alýn eðer gun “Cuma” ise ekrana “Müslümanlar için kutsal gün” yazdýrýn.
“Cumartesi” ise ekrana “Yahudiler için kutsal gün” yazdýrýn. “Pazar” ise ekrana
“Hýristiyanlar için kutsal gün” yazdýrýn. Diler günler icin “Kutsal gün deðil” yazdýrýn.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("bir gün giriniz:");
		String gun = scan.nextLine();
		
		switch(gun) {
		case "Cuma":
			System.out.println("müslümanlarýn kutsal günü");
			break;
		case "Cumartesi":
			System.out.println("yahudilerin kutsal günü");
			break;
		case "Pazar":
			System.out.println("hristiyanlarýn kutsal günü");
		default:
			System.out.println("kutsal gün deðil");
		}
		scan.close();

	}

}
