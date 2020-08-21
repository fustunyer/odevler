package day11;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Baþlangýç deðerini giriniz:");
		int b1=scan.nextInt();
		System.out.println("Bitiþ deðerini giriniz:");
		int b2=scan.nextInt();
		//5)Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
		//biten tüm tamsayýlarýn çarpýmýný ekrana yazdýrýn.
		int product=1;
		if(b1<=b2) {
			while(b1<=b2) {
				product=product*b1;
				b1++;
			}System.out.print("çarpým: " + product);
		
			}else if(b1>=b2) {
				while (b1>=b2) {
					product=product*b1;
					b1--;
				}System.out.println("çarpým: "+product);
		
		//6)Kullanýcýdan baþlangýç ve bitiþ harflerini alýn ve baþlangýç harfinden baþlayýp bitiþ harfinde
		//biten tüm harfleri büyük harf olarak ekrana yazdýrýn. Kullanýcýnýn hata yapmadýðýný farz edin.*/
		
		System.out.println("baþangýç harfi giriniz: ");
		char ch1=scan.next().charAt(0);
		System.out.println("bitiþ harfi giriniz: ");
		char ch2=scan.next().charAt(0);
		System.out.println(ch1+ch2);
		
				
				
				
				
		//7)Kullanýcýdan bir rakam alýn ve bu rakam icin çarpým tablosunu ekrana yazdýrýn.
		//Kullanýcýnýn hata yapmadýðýný farz edin.
		//Ornegin kullanýcý 3 girerse;
		//3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
			
		
	
	
	
	}
		
		
		scan.close();
			}

}

