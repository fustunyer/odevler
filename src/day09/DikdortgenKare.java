package day09;

import java.util.Scanner;

public class DikdortgenKare {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir dikd�rtgenin en ve boyunu girmesini isteyin. 
		 * En ve boy e�it ise ekrana �Kare� 
		 * farkl� ise ekrana �Dikd�rtgen� yazd�r�n.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("iki tane kenar giriniz");
		int kenar1=scan.nextInt();
		int kenar2=scan.nextInt();
		
		String result= kenar1==kenar2 ? "kare" : "dikd�rtgen";
		System.out.println(result);
		scan.close();
		
		
		
	

	}

}
