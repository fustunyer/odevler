package day03;

import java.util.Scanner;

public class Ucgenin�evresi {

	public static void main(String[] args) {
		/*
		Not 1: ��genin Cevresi: a + b + c
		Kenar uzunluklar� kullan�c�dan al�nan bir ��genin �evresini hesaplayan bir Program yaz�n�z. (byte kullan�n�z)
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("��genin 1. kenar�n� giriniz: ");
		System.out.println("��genin 2. kenar�n� giriniz: ");
		System.out.println("��genin 3. kenar�n� giriniz: ");
		byte a = scan.nextByte();
		byte b = scan.nextByte();
		byte c = scan.nextByte();
		System.out.print("��genin �evresi= ");
		System.out.println(a+b+c);
			
		
		
		
		scan.close();
		
	}

}
