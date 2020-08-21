package day08;

import java.util.Scanner;

public class TurneryIkizkenarVeyaDegil {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir üçgenin üç kenar uzunluðunu alýn eðer iki kenar uzunluðu birbirine eþit ise ekrana
“Ikizkenar Ucgen” yazdýrýn. Diðer durumlarda ekrana “Ikizkenar deðil” yazdýrýn.
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Ucgenin birinci kenarýný girin:");
		int a=scan.nextInt();
		System.out.println("Ucgenin ikinci kenarýný girin:");
		int b=scan.nextInt();
		System.out.println("Ucgenin ücüncü kenarýný girin:");
		int c=scan.nextInt();
		
		String result = (a==b || a==c || b==c) ? "Ýkizkenar üçgen" : "Ýkizkenar deðil";
		System.out.println(result);
		scan.close();
				
				
		

	}  

}
