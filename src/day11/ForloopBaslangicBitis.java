package day11;

import java.util.Scanner;

public class ForloopBaslangicBitis {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ba�lang�� de�erini giriniz:");
		int bas=scan.nextInt();
		System.out.println("Biti� de�erini giriniz:");
		int bitis=scan.nextInt();
			
		/*
4)Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p 
biti� de�erinde biten t�m tamsay�lar�n toplam�n� ekrana yazd�r�n.
		*/
		int t = 0;
		int c = 1;
		for(int i=bas ; i<=bitis ; i++) {
			t +=i;
			c *=i;
		}
		System.out.println("Toplam = "+t);
		
		/*
		5)Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
		biten t�m tamsay�lar�n �arp�m�n� ekrana yazd�r�n.
		*/
		System.out.println("�arp�m ="+ c);
		
		
		
		
		
		
		
		
		
		
		
scan.close();
	}

}
