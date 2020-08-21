package day11;

import java.util.Scanner;

public class ForLoopBaslangi�VeBitis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Ba�lang�� de�erini giriniz:");
		int bas=scan.nextInt();
		System.out.println("Biti� de�erini giriniz:");
		int bitis=scan.nextInt();
				
		/*1)Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve 
ba�lang�� de�erinden ba�lay�p biti� de�erinde biten t�m tamsay�lar� ekrana yazd�r�n.
*/
		if (bas<=bitis) {
			for (int i = bas ; i <= bitis ; i++) {
				System.out.println(i);
			}
		}else {
			for (int i = bas ; i >=bitis ; i--) {
				System.out.println(i);
			}
		}
				
/*2)Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden veya 
 * sonras�ndan ba�lay�p biti� de�erinde veya �ncesinde biten t�m �ift tamsay�lar� 
 * ekrana yazd�r�n.
*/
		if (bas<=bitis) {
			for (int i = bas ; i <= bitis ; i++) {
				if (i%2==0) {
					System.out.println(i);
				}
			}
		}else {
			for (int i = bas ; i >=bitis ; i--) {
				if (i%2==0) {
					System.out.println(i);
				}
			}
		}
/*
3)Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden veya sonras�ndan
ba�lay�p biti� de�erinde veya �ncesinde biten t�m 3 ile b�l�nebilen tamsay�lar� ekrana yazd�r�n.
*/
		if (bas<=bitis) {
			for (int i = bas ; i <= bitis ; i++) {
				if (i%3==0) {
					System.out.println(i);
				}
			}
		}else {
			for (int i = bas ; i >=bitis ; i--) {
				if (i%3==0) {
					System.out.println(i);
				}
			}
		}
		scan.close();
	}

}
