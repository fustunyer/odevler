package day06;

import java.util.Scanner;

public class EskenarUcgen {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir ��genin �� kenar uzunlu�unu al�n 
		 * e�er �� kenar uzunlu�u birbirine e�it ise ekrana �E�kenar ��gen� yazd�r�n. 
			Di�er durumlarda ekrana �E�kenar de�il� yazd�r�n.
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Ucgenin �� kenar�n� girin:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		if(a==b && a==c) {
			System.out.println("Eskenar ucgen");
		}else {
			System.out.println("Eskenar degil");
		}
		scan.close();

	}

}
