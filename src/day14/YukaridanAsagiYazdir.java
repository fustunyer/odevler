package day14;

import java.util.Scanner;

public class YukaridanAsagiYazdir {

	public static void main(String[] args) {
		/*
		 * Kullan�c�ya bir String girmesini s�yleyin ve bu String�i yukar�dan a�a��ya do�ru yazd�ran
Program yaz�n�z. Ornegin; CAN ==> C
								  A
								  N
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir String giriniz:");
		String a = scan.nextLine();
		
		yukaridanAsagiYazdir(a);
		
		scan.close();
	}
	public static void yukaridanAsagiYazdir(String a) {
		int i=0;
		do {
			System.out.println(a.charAt(i));
			i++;
		}while(i<a.length());
			
	}
	
}
