package day14;

import java.util.Scanner;

public class IsimSoyisim {
		String soyisim="b";
		String isim="a"; 
		
	public static void main(String[] args) {
		/*Kullan�c�dan isim ve soyismini al�n. Kullan�c�n�n isim ve soyisminin ilk harflerini b�y�k
   									di�er harflerini k���k harf olarak ekrana yazd�ran program� yaz�n�z.
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
