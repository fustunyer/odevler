package day06;

import java.util.Scanner;

public class EskenarUcgen {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir üçgenin üç kenar uzunluðunu alýn 
		 * eðer üç kenar uzunluðu birbirine eþit ise ekrana “Eþkenar üçgen” yazdýrýn. 
			Diðer durumlarda ekrana “Eþkenar deðil” yazdýrýn.
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Ucgenin üç kenarýný girin:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		if(a==b && a==c) {
			System.out.println("Eskenar ucgen");
		}else {
			System.out.println("Eskenar degil");
		}
		scan.close();

	}

}
