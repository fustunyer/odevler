package day14;

import java.util.Scanner;

public class EsitVeyaDegil {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan iki say� al�n bu say�lar e�it ise ekrana �E�it�, birinci say� b�y�k ise ekrana
�Birinci say� b�y�k�, ikinci say� b�y�k ise ekrana �Ikinci say� b�y�k� yazd�r�n�z.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("�ki say� giriniz:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		esitVeyaBuyuk(a,b);
	
		scan.close();
	}

	public static void esitVeyaBuyuk(int a,int b) {
		String result= a==b ? "E�it" : a>b ? "Birinci say� b�y�k" : "ikinci say� b�y�k";
		System.out.println(result);
		
	}
	
	
	
	
	
	
	
}
