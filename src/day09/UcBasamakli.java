package day09;

import java.util.Scanner;

public class UcBasamakli {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir tamsay� girmesini isteyin,
		 *  o tamsay� 3 basamakl� ise ekrana �3 Basamakl�� yazd�r�n.
			3 basamakl� degilse �ift olup olmadigini kontrol edin. 	
			�ift ise �3 basamakl� olmayan �ift say�� yazd�r�n.
			�ift say� degilse �3 basamakl� olmayan tek say� yazd�r�n.�
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsay� yaz�n�z:");
		int sayi = scan.nextInt();
		
		boolean s = (sayi>99&&sayi<1000)||(sayi<-99&&sayi>-1000);
		
		String result = s ? "3 basamakl�" : sayi%2==0 ? "3 basamakl� olmayan �ift say�" : "3 basamakl� olmayan tek say�";
		System.out.println(result);
		scan.close();
		

	}

}
