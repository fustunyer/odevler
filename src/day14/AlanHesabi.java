package day14;

import java.util.Scanner;

public class AlanHesabi {

	public static void main(String[] args) {
		/*
		 * Kullanýcýya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini ve iki sayý seçmesini söyleyin.
Hangi þekli seçerse, o þeklin alanýný ve çevresini ekrana yazdýran programý yazýnýz.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Paralelkenar,Dikdörtgen,Ucgen seçtiðiniz þeklin baþ harfini giriniz");
		String s = scan.nextLine();
		System.out.println("iki kenar uzunluðu giriniz:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		cevre(s,a,b);
		alan(s,a,b);
		
		scan.close();
		
	}
	public static void cevre(String s,int a,int b) {
		Scanner scan = new Scanner(System.in);
		boolean t= s.equals("P")||s.equals("D");
		if(t) {
			System.out.println("çevre= "+2*(a+b));
		}else if(s.equals("U")) {
			System.out.println("Bir kenar daha giriniz");
			int c=scan.nextInt();
			System.out.println("çevre = "+a+b+c);
		}
		scan.close();
	}
	
	public static void alan(String s,int a,int b) {
		Scanner scan = new Scanner(System.in);
		if(s.equals("D")){
			System.out.println("alan="+a*b);
		}
		
		
		scan.close();
		
	}
		
	}
	
	
	
	
