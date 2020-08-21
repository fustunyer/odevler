package day07;

import java.util.Scanner;

public class UcgenCesitleri {

	public static void main(String[] args) {
		/*
		Kullan�c�dan bir ��genin �� kenar uzunlu�unu al�n 
	    e�er �� kenar uzunlu�u birbirine e�it ise ekrana �E�kenar ��gen� yazd�r�n. 
		Sadece iki kenar uzunlu�u birbirine e�it ise ekrana �Ikizkenar ��gen� yazd�r�n. 
		T�m kenar uzunluklar� birbirinden farkl� ise ��e�itkenar ��gen yazd�r�n�
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Ucgenin birinci kenar�n� girin:");
		int a=scan.nextInt();
		System.out.println("Ucgenin ikinci kenar�n� girin:");
		int b=scan.nextInt();
		System.out.println("Ucgenin �c�nc� kenar�n� girin:");
		int c=scan.nextInt();
		//�ncelikle verilen �� kenar�n ��gen �art�n� sa�lad���n� kontrol etmemiz gerekir...
		
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
