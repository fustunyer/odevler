package day09;

import java.util.Scanner;

public class KutsalGun {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir gun al�n e�er gun �Cuma� ise ekrana �M�sl�manlar i�in kutsal g�n� yazd�r�n.
�Cumartesi� ise ekrana �Yahudiler i�in kutsal g�n� yazd�r�n. �Pazar� ise ekrana
�H�ristiyanlar i�in kutsal g�n� yazd�r�n. Diler g�nler icin �Kutsal g�n de�il� yazd�r�n.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("bir g�n giriniz:");
		String gun = scan.nextLine();
		
		switch(gun) {
		case "Cuma":
			System.out.println("m�sl�manlar�n kutsal g�n�");
			break;
		case "Cumartesi":
			System.out.println("yahudilerin kutsal g�n�");
			break;
		case "Pazar":
			System.out.println("hristiyanlar�n kutsal g�n�");
		default:
			System.out.println("kutsal g�n de�il");
		}
		scan.close();

	}

}
