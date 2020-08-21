package day11;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		/*A�a��daki sorular� String methodlar�n� kullanarak ��z�n�z.
4) Kullan�c�dan uzunlu�u �ift say� olan bir String al�n ve bu String�in ilk yar�s�n� ekrana yazd�r�n.
Ornegin; Kullan�c� �Hollanda� girerse ekrana �Holl� yazd�racaks�n�z.

		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Uzunlu�u �ift say� olan bir yaz� giriniz.");
		String s = scan.nextLine();
		
		if (s.length()%2==0) {
			System.out.println(s.substring(0, s.length()/2));
		}else {
			System.out.println("Yaz�n�n uzunlu�u �ift olmal�...");
		}
/*5)Kullan�c�dan bir String al�n ve bu String�in ilk harfi ile son harfinin yerlerini de�i�tirerek
ekrana yazd�r�n.
Ornegin; Kullan�c� �Java� girerse ekrana �aavJ� yazd�racaks�n�z.
*/
		char ilkHarf=s.charAt(0);
		char sonHarf=s.charAt(s.length()-1);
		
		System.out.println(sonHarf+s.substring(1,s.length()-2)+ilkHarf);
		
			
		/*6)Kullan�c�dan bir String al�n ve bu String�in icinde �a� harfi varsa �a� harfinin ilk g�r�n�m�n�n
		indexini ekrana yazd�r�n. �a� harfi yoksa ekrana �a harfi yok� yazd�r�n.
		*/
		if (s.contains("a")) {
			System.out.println(s.indexOf("a"));
		}else {
			System.out.println("a harfi yok");
		}
		
			
		scan.close();

	}

}
