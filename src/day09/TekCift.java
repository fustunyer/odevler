package day09;

import java.util.Scanner;

public class TekCift {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir tamsay� girmesini isteyin,
		 *  tamsay� �ift ise ekrana ��ift� tek ise ekrana �Tek�
			yazd�r�n.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsay� yaz�n�z:");
		int sayi = scan.nextInt();
		
		String result = sayi%2==0 ? "��ft Say�" : "Tek say�" ;
		System.out.println(result);
		scan.close();
		
		
	}

}
