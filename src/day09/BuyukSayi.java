package day09;

import java.util.Scanner;

public class BuyukSayi{

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan iki tamsayý girmesini isteyin, 
		 * ekrana her zaman büyük olanýný yazdýrýn
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("iki tane sayý giriniz");
		int sayý1=scan.nextInt();
		int sayý2=scan.nextInt();
		
		int result = sayý1<sayý2 ? sayý2 : sayý1 ;
		System.out.println(result);
		scan.close();
		
		

	}

}
