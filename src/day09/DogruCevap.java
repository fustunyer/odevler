package day09;

import java.util.Scanner;

public class DogruCevap {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan A, B, C, D harflerinden birini alýn 
eðer harf C ise ekrana “Doðru cevap” yazdýrýn.
A, B, D den biri ise ekrana “Yanlýþ cevap” yazdýrýn.
Bu harflerin dýþýndaki harfler için “Geçersiz cevap þýkký” yazdýrýn.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("A,B,C,D harflerinden birini giriniz:");
		char harf = scan.next().charAt(0);
		
		switch(harf) {
		case 'C':
			System.out.println("doðru cevap");
			break;
		case 'A':
		case 'B':
		case 'D':
			System.out.println("yanlýþ cevap");
			break;
		default:
			System.out.println("Geçersiz cevap þýkký");
		}
		scan.close();
	}

}
