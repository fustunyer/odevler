package day07;

import java.util.Scanner;

public class Milenium {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir y�l al�n e�er y�l 1000�e bulunuyorsa ekrana �Milenyum� yazd�r�n.
			E�er y�l 100�e bulunuyorsa ekrana �Y�zy�l� yazd�r�n.
			E�er y�l 10�a bulunuyorsa ekrana �Ony�l� yazd�r�n.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir y�l giriniz:");
		int sayi = scan.nextInt();
		
		if(sayi%1000==0) {
			System.out.println("Milenyum");
		}else if(sayi%100==0) {
			System.out.println("Y�zy�l");
		}else if(sayi%10==0) {
			System.out.println("Onyil");
		}scan.close();

	}

}
