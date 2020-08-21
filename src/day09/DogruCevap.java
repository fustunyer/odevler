package day09;

import java.util.Scanner;

public class DogruCevap {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan A, B, C, D harflerinden birini al�n 
e�er harf C ise ekrana �Do�ru cevap� yazd�r�n.
A, B, D den biri ise ekrana �Yanl�� cevap� yazd�r�n.
Bu harflerin d���ndaki harfler i�in �Ge�ersiz cevap ��kk�� yazd�r�n.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("A,B,C,D harflerinden birini giriniz:");
		char harf = scan.next().charAt(0);
		
		switch(harf) {
		case 'C':
			System.out.println("do�ru cevap");
			break;
		case 'A':
		case 'B':
		case 'D':
			System.out.println("yanl�� cevap");
			break;
		default:
			System.out.println("Ge�ersiz cevap ��kk�");
		}
		scan.close();
	}

}
