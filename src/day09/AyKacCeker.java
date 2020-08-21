package day09;

import java.util.Scanner;

public class AyKacCeker {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan ay ismi al�n 
e�er ay ismi 31 �eken aylardan biri ise ekrana �Bu ay 31 g�nd�r� yazd�r�n.
E�er ay ismi 30 �eken aylardan biri ise ekrana �Bu ay 30 g�nd�r� yazd�r�n.
E�er ay ismi 28 veya 29 �eken aylardan biri ise ekrana �Bu ay �ubat ay�d�r� yazd�r�n.
Bu isimlerin d���ndaki isimler i�in �Ge�ersiz ay ismi� yazd�r�n.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir ay giriniz:");
		String ay = scan.nextLine();
		
		switch(ay) {
		case "ocak":
		case "mart":
		case "may�s":
		case "temmuz":
		case "a�ustos":
		case "ekim":
		case "aral�k":
			System.out.println("bu ay 31 g�nd�r");
			break;
		case "nisan":
		case "haziran":
		case "eyl�l":
		case "kas�m":
			System.out.println("bu ay 30 g�nd�r");
			break;
		case "�ubat":
			System.out.println("bu ay 28 g�nd�r");
			break;
		default:
			System.out.println("ge�ersiz ay ismi");
		
		}
		scan.close();

	}

}
