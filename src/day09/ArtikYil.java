package day09;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir y�l girmesini isteyin,
		 *  y�l art�k y�l ise ekrana �Art�k y�l� degilse ekrana 
		 *  �Art�k y�l degil� yazd�r�n.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir y�l yaz�n�z:");
		int yil= scan.nextInt();
		
		String result = yil%400==0&&yil%100==0 ?  "Art�k y�l" : yil%4==0 ? "Art�k yil" : "Art�k y�l de�il";
		System.out.println(result);
		
		//Kullan�c�dan al�nan y�l�n art�k y�l olma durumunu kontrol eden methodu yaz�n�z. true yada false
		// y�l 400 ve 100 b�l�nebilecek
		// 100 e b�l�nm�yor ise 4 e b�l�necek
		
		
		
		
		
		scan.close();
	}

}
