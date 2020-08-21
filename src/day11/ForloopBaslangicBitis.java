package day11;

import java.util.Scanner;

public class ForloopBaslangicBitis {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Baþlangýç deðerini giriniz:");
		int bas=scan.nextInt();
		System.out.println("Bitiþ deðerini giriniz:");
		int bitis=scan.nextInt();
			
		/*
4)Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp 
bitiþ deðerinde biten tüm tamsayýlarýn toplamýný ekrana yazdýrýn.
		*/
		int t = 0;
		int c = 1;
		for(int i=bas ; i<=bitis ; i++) {
			t +=i;
			c *=i;
		}
		System.out.println("Toplam = "+t);
		
		/*
		5)Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
		biten tüm tamsayýlarýn çarpýmýný ekrana yazdýrýn.
		*/
		System.out.println("çarpým ="+ c);
		
		
		
		
		
		
		
		
		
		
		
scan.close();
	}

}
