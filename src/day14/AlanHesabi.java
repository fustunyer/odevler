package day14;

import java.util.Scanner;

public class AlanHesabi {

	public static void main(String[] args) {
		/*
		 * Kullan�c�ya paralelkenar, dikd�rtgen ve ��gen kelimelerinden birini ve iki say� se�mesini s�yleyin.
Hangi �ekli se�erse, o �eklin alan�n� ve �evresini ekrana yazd�ran program� yaz�n�z.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Paralelkenar,Dikd�rtgen,Ucgen se�ti�iniz �eklin ba� harfini giriniz");
		String s = scan.nextLine();
		System.out.println("iki kenar uzunlu�u giriniz:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		cevre(s,a,b);
		alan(s,a,b);
		
		scan.close();
		
	}
	public static void cevre(String s,int a,int b) {
		Scanner scan = new Scanner(System.in);
		boolean t= s.equals("P")||s.equals("D");
		if(t) {
			System.out.println("�evre= "+2*(a+b));
		}else if(s.equals("U")) {
			System.out.println("Bir kenar daha giriniz");
			int c=scan.nextInt();
			System.out.println("�evre = "+a+b+c);
		}
		scan.close();
	}
	
	public static void alan(String s,int a,int b) {
		Scanner scan = new Scanner(System.in);
		if(s.equals("D")){
			System.out.println("alan="+a*b);
		}
		
		
		scan.close();
		
	}
		
	}
	
	
	
	
