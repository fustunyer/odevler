package day14;

import java.util.Scanner;

public class EsitVeyaDegil {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan iki sayý alýn bu sayýlar eþit ise ekrana “Eþit”, birinci sayý büyük ise ekrana
“Birinci sayý büyük”, ikinci sayý büyük ise ekrana “Ikinci sayý büyük” yazdýrýnýz.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Ýki sayý giriniz:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		esitVeyaBuyuk(a,b);
	
		scan.close();
	}

	public static void esitVeyaBuyuk(int a,int b) {
		String result= a==b ? "Eþit" : a>b ? "Birinci sayý büyük" : "ikinci sayý büyük";
		System.out.println(result);
		
	}
	
	
	
	
	
	
	
}
