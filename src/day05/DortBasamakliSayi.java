package day05;

import java.util.Scanner;

public class DortBasamakliSayi {

	public static void main(String[] args) {
		/*
		 * Kullan�c�n�n girdi�i 4 basamakl� say�n�n ilk ve son rakam�n�n 
		 * toplam�n� ekrana yazd�ran bir program yaz�n�z.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("D�rt basamakl� bir say� giriniz:");
		int sayi=scan.nextInt();
		
		int birlerBasamag�=sayi%10;
		int binlerBasamag�=(sayi/1000)%10;
		System.out.println(binlerBasamag�+" "+birlerBasamag�);	
		/*
		 * Kullan�c�n�n girdi�i 4 basamakl� say�n�n t�m rakamlar�n�n toplam�n�
		ekrana yazd�ran bir program yaz�n�z.
		 */
		int onlarBasamag�=(sayi/10)%10;
		int yuzlerBasamag�=(sayi/100)%10;
		
		System.out.println(binlerBasamag�+yuzlerBasamag�+onlarBasamag�+birlerBasamag�);
		
		
		
		
		scan.close();
		
		
		
		
	}

}
