package day08;

import java.util.Scanner;

public class TurneryIkizkenarVeyaDegil {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir ��genin �� kenar uzunlu�unu al�n e�er iki kenar uzunlu�u birbirine e�it ise ekrana
�Ikizkenar Ucgen� yazd�r�n. Di�er durumlarda ekrana �Ikizkenar de�il� yazd�r�n.
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Ucgenin birinci kenar�n� girin:");
		int a=scan.nextInt();
		System.out.println("Ucgenin ikinci kenar�n� girin:");
		int b=scan.nextInt();
		System.out.println("Ucgenin �c�nc� kenar�n� girin:");
		int c=scan.nextInt();
		
		String result = (a==b || a==c || b==c) ? "�kizkenar ��gen" : "�kizkenar de�il";
		System.out.println(result);
		scan.close();
				
				
		

	}  

}
