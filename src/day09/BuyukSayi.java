package day09;

import java.util.Scanner;

public class BuyukSayi{

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan iki tamsay� girmesini isteyin, 
		 * ekrana her zaman b�y�k olan�n� yazd�r�n
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("iki tane say� giriniz");
		int say�1=scan.nextInt();
		int say�2=scan.nextInt();
		
		int result = say�1<say�2 ? say�2 : say�1 ;
		System.out.println(result);
		scan.close();
		
		

	}

}
