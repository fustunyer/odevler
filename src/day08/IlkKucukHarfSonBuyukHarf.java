package day08;

import java.util.Scanner;

public class IlkKucukHarfSonBuyukHarf {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir harf girmesini isteyin.
Girdi�i k���k harf ise harfin �a� olup olmad���n� kontrol edin. 
Harf �a� ise ekrana �Ilk k���k harf� yazd�r�n.
�a� de�il ise ekrana �Ilk k���k harf de�il� yazd�r�n.
Girdi�i b�y�k harf ise harfin �Z� olup olmad���n� kontrol edin.
 Harf �Z� ise ekrana �Son b�y�k harf� yazd�r�n.
�Z� de�il ise ekrana �Son b�y�k harf de�il� yazd�r�n.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir harf giriniz");
		char harf = scan.next().charAt(0);
		
		if (harf>='a' && harf<='z') {
			if (harf=='a') {
				System.out.println("ilk k���k harf");
			}else {
				System.out.println("ilk k���k harf de�il");
			} }
		else if(harf>='A' && harf<='Z') {
			if(harf=='Z') {
				System.out.println("son b�y�k harf");
			}else {
				System.out.println("son b�y�k harf de�il");
			}
		}else {
			System.out.println("bir harf girmelisin...");
		}
		scan.close();

	}

}
