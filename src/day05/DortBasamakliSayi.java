package day05;

import java.util.Scanner;

public class DortBasamakliSayi {

	public static void main(String[] args) {
		/*
		 * Kullanıcının girdiği 4 basamaklı sayının ilk ve son rakamının 
		 * toplamını ekrana yazdıran bir program yazınız.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Dört basamaklı bir sayı giriniz:");
		int sayi=scan.nextInt();
		
		int birlerBasamagı=sayi%10;
		int binlerBasamagı=(sayi/1000)%10;
		System.out.println(binlerBasamagı+" "+birlerBasamagı);	
		/*
		 * Kullanıcının girdiği 4 basamaklı sayının tüm rakamlarının toplamını
		ekrana yazdıran bir program yazınız.
		 */
		int onlarBasamagı=(sayi/10)%10;
		int yuzlerBasamagı=(sayi/100)%10;
		
		System.out.println(binlerBasamagı+yuzlerBasamagı+onlarBasamagı+birlerBasamagı);
		
		
		
		
		scan.close();
		
		
		
		
	}

}
