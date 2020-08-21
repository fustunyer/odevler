package day11;

import java.util.Scanner;

public class YasadigimUlke {

	public static void main(String[] args) {
		/*
4)Kullanýcýdan yaþadýðý ülkenin ismini alýn bu ülkenin ismi 
 Amerika ise ekrana USA, Ingiltere ise ekrana UK, Almanya ise ekrana DE yazdýrýn.
 Diðer ülkeler için ise NA yazdýrýn.
5)Kullanýcýdan yaþadýðý ülkenin ismini alýn bu ülkenin ilk iki harfini 
büyük harf olarak ekrana yazdýrýn.
6)Kullanýcýdan yaþadýðý ülkenin ismini alýn bu ülkenin bastan ikinci harfi 
ile sondan ikinci harfini büyük harf olarak ekrana yazdýrýn.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Yaþadýðnýz ülkeyi yazýnýz: ");
		String ulke= scan.nextLine();
		
		//5)
			switch(ulke) {
		case "Ingiltere":
			System.out.println("UK");
			break;
		case "Amerika":
			System.out.println("USA");
			break;
		case "Almanya":
			System.out.println("DE");
			break;
		default:
			System.out.println("NA");
		}
		//6)		
		System.out.println(ulke.toUpperCase().charAt(0)+""+ulke.toUpperCase().charAt(1));
		//7)
		System.out.println(ulke.toUpperCase().charAt(1)+""+ulke.toUpperCase().charAt(ulke.length()-2));
		
			
			
			
		scan.close();
		
		
		
	}

}
