package day14;

import java.util.Scanner;

public class RakamlariToplami {

	public static void main(String[] args) {
		/*
		 * Kullan�c�ya say� girmesini s�yleyin. Kullan�c�n�n girdi�i say�n�n rakamlar� toplam�n� ekrana
yazd�ran bir program yaz�n.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say� giriniz:");
		int a=scan.nextInt();
		rakamlariToplami(a);
		
		scan.close();
	}
		public static void rakamlariToplami(int a) {
			int n=1;
			int sum=0;
			do {
				sum=sum+(a/n)%10;
				n=n*10;
			}while((a/n)>=1);
			System.out.println(sum);
			
			
		}
	
	
	
}
