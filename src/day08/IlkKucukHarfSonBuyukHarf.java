package day08;

import java.util.Scanner;

public class IlkKucukHarfSonBuyukHarf {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir harf girmesini isteyin.
Girdiði küçük harf ise harfin “a” olup olmadýðýný kontrol edin. 
Harf “a” ise ekrana “Ilk küçük harf” yazdýrýn.
“a” deðil ise ekrana “Ilk küçük harf deðil” yazdýrýn.
Girdiði büyük harf ise harfin “Z” olup olmadýðýný kontrol edin.
 Harf “Z” ise ekrana “Son büyük harf” yazdýrýn.
“Z” deðil ise ekrana “Son büyük harf deðil” yazdýrýn.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir harf giriniz");
		char harf = scan.next().charAt(0);
		
		if (harf>='a' && harf<='z') {
			if (harf=='a') {
				System.out.println("ilk küçük harf");
			}else {
				System.out.println("ilk küçük harf deðil");
			} }
		else if(harf>='A' && harf<='Z') {
			if(harf=='Z') {
				System.out.println("son büyük harf");
			}else {
				System.out.println("son büyük harf deðil");
			}
		}else {
			System.out.println("bir harf girmelisin...");
		}
		scan.close();

	}

}
