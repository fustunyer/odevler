package day11;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ba�lang�� de�erini giriniz:");
		int b1=scan.nextInt();
		System.out.println("Biti� de�erini giriniz:");
		int b2=scan.nextInt();
		//5)Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
		//biten t�m tamsay�lar�n �arp�m�n� ekrana yazd�r�n.
		int product=1;
		if(b1<=b2) {
			while(b1<=b2) {
				product=product*b1;
				b1++;
			}System.out.print("�arp�m: " + product);
		
			}else if(b1>=b2) {
				while (b1>=b2) {
					product=product*b1;
					b1--;
				}System.out.println("�arp�m: "+product);
		
		//6)Kullan�c�dan ba�lang�� ve biti� harflerini al�n ve ba�lang�� harfinden ba�lay�p biti� harfinde
		//biten t�m harfleri b�y�k harf olarak ekrana yazd�r�n. Kullan�c�n�n hata yapmad���n� farz edin.*/
		
		System.out.println("ba�ang�� harfi giriniz: ");
		char ch1=scan.next().charAt(0);
		System.out.println("biti� harfi giriniz: ");
		char ch2=scan.next().charAt(0);
		System.out.println(ch1+ch2);
		
				
				
				
				
		//7)Kullan�c�dan bir rakam al�n ve bu rakam icin �arp�m tablosunu ekrana yazd�r�n.
		//Kullan�c�n�n hata yapmad���n� farz edin.
		//Ornegin kullan�c� 3 girerse;
		//3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
			
		
	
	
	
	}
		
		
		scan.close();
			}

}

