package day07;

import java.util.Scanner;

public class Milenium {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir yýl alýn eðer yýl 1000’e bulunuyorsa ekrana “Milenyum” yazdýrýn.
			Eðer yýl 100’e bulunuyorsa ekrana “Yüzyýl” yazdýrýn.
			Eðer yýl 10’a bulunuyorsa ekrana “Onyýl” yazdýrýn.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir yýl giriniz:");
		int sayi = scan.nextInt();
		
		if(sayi%1000==0) {
			System.out.println("Milenyum");
		}else if(sayi%100==0) {
			System.out.println("Yüzyýl");
		}else if(sayi%10==0) {
			System.out.println("Onyil");
		}scan.close();

	}

}
