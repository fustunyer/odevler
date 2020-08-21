package day14;

import java.util.Scanner;

 public class AydinDalli {
	 	public static void main(String[] args) {
		/*
		 Kullanicidan isim ve soyismini alin. Kullanicidan isim ve soyisminin ilk harflerini büyük
		diger harflerini kücük harf olarak ekrana yazdiran programi yaziniz.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Voer voornaam en achternaam in ;");
		String isim = scan.nextLine();
		String adSoyad = isim.toLowerCase();
		groteletter(adSoyad);
		scan.close();
	}
	
	public static void groteletter(String naam) {
		String voornaam = naam.substring(0, naam.lastIndexOf(" "));
		String achternaam = naam.substring(naam.lastIndexOf(" ")+1);
		String voornaam1;
		String voornaam2;
		if (voornaam.contains(" ")) {
			voornaam1= voornaam.substring(0, naam.indexOf(" "));
			voornaam2= voornaam.substring(naam.indexOf(" ")+1);
			System.out.print(voornaam1.substring(0,1).toUpperCase()+voornaam1.substring(1)+" ");
			System.out.print(voornaam2.substring(0,1).toUpperCase()+voornaam2.substring(1)+" ");
		}else {
			System.out.println(voornaam.substring(0,1).toUpperCase()+voornaam.substring(1)+" ");
		}
		System.out.println(achternaam.substring(0,1).toUpperCase()+achternaam.substring(1)+" ");
		
	}
}