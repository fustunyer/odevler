package day11;

import java.util.Scanner;

public class KrediKarti {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan kredi kart� numaras�n� al�n ve 
		 * bu numaran�n ���nc�, d�rd�nc� ve sonuncu
			rakamlar�n� ekrana yazd�r�n.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("16 haneli kredi kart� numaran�z� giriniz: ");
		String k = scan.nextLine();
		
		
		System.out.println(k.charAt(2));
		System.out.println(k.charAt(3));
		System.out.println(k.charAt(k.length()-1));
		scan.close();		
		
	}


}
