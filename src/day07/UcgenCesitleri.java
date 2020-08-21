package day07;

import java.util.Scanner;

public class UcgenCesitleri {

	public static void main(String[] args) {
		/*
		Kullanýcýdan bir üçgenin üç kenar uzunluðunu alýn 
	    eðer üç kenar uzunluðu birbirine eþit ise ekrana “Eþkenar üçgen” yazdýrýn. 
		Sadece iki kenar uzunluðu birbirine eþit ise ekrana “Ikizkenar üçgen” yazdýrýn. 
		Tüm kenar uzunluklarý birbirinden farklý ise “Çeþitkenar üçgen yazdýrýn”
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Ucgenin birinci kenarýný girin:");
		int a=scan.nextInt();
		System.out.println("Ucgenin ikinci kenarýný girin:");
		int b=scan.nextInt();
		System.out.println("Ucgenin ücüncü kenarýný girin:");
		int c=scan.nextInt();
		//öncelikle verilen üç kenarýn üçgen þartýný saðladýðýný kontrol etmemiz gerekir...
		
		boolean u= a>=b+c || b>=a+c|| c>=a+b;
				
		if(u) {
			System.out.println("Bu ucgen cizilemez");
		}else if(a==b && a==c) {
			System.out.println("Eskenar ucgen");
		}else if(a==b || a==c || b==c) {
			System.out.println("Ikizkenar Ucgen");
		}else {
			System.out.println("Cesitkenar ucgen");
		}scan.close();
	}
}
