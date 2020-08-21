package day14;

import java.util.Scanner;

public class IsimSoyisim {
		String soyisim="b";
		String isim="a"; 
		
	public static void main(String[] args) {
		/*Kullanýcýdan isim ve soyismini alýn. Kullanýcýnýn isim ve soyisminin ilk harflerini büyük
   									diðer harflerini küçük harf olarak ekrana yazdýran programý yazýnýz.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("isminizi giriniz:");
		String isim = scan.nextLine();
		System.out.println("soyisminizi giriniz:");
		String soyisim = scan.nextLine();
		
		isimSoyisim(isim,soyisim);

		scan.close();
	}

	public static  void isimSoyisim(String isim,String soyisim) {
		System.out.print(isim.toUpperCase().charAt(0)+isim.toLowerCase().substring(1));
		System.out.println(" "+soyisim.toUpperCase().charAt(0)+soyisim.toLowerCase().substring(1));
		
		}
	
	
	
}
