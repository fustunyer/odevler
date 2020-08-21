package day11;

import java.util.Scanner;

public class ForLoopBaslangiçVeBitis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Baþlangýç deðerini giriniz:");
		int bas=scan.nextInt();
		System.out.println("Bitiþ deðerini giriniz:");
		int bitis=scan.nextInt();
				
		/*1)Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve 
baþlangýç deðerinden baþlayýp bitiþ deðerinde biten tüm tamsayýlarý ekrana yazdýrýn.
*/
		if (bas<=bitis) {
			for (int i = bas ; i <= bitis ; i++) {
				System.out.println(i);
			}
		}else {
			for (int i = bas ; i >=bitis ; i--) {
				System.out.println(i);
			}
		}
				
/*2)Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden veya 
 * sonrasýndan baþlayýp bitiþ deðerinde veya öncesinde biten tüm çift tamsayýlarý 
 * ekrana yazdýrýn.
*/
		if (bas<=bitis) {
			for (int i = bas ; i <= bitis ; i++) {
				if (i%2==0) {
					System.out.println(i);
				}
			}
		}else {
			for (int i = bas ; i >=bitis ; i--) {
				if (i%2==0) {
					System.out.println(i);
				}
			}
		}
/*
3)Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden veya sonrasýndan
baþlayýp bitiþ deðerinde veya öncesinde biten tüm 3 ile bölünebilen tamsayýlarý ekrana yazdýrýn.
*/
		if (bas<=bitis) {
			for (int i = bas ; i <= bitis ; i++) {
				if (i%3==0) {
					System.out.println(i);
				}
			}
		}else {
			for (int i = bas ; i >=bitis ; i--) {
				if (i%3==0) {
					System.out.println(i);
				}
			}
		}
		scan.close();
	}

}
