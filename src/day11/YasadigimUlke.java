package day11;

import java.util.Scanner;

public class YasadigimUlke {

	public static void main(String[] args) {
		/*
4)Kullan�c�dan ya�ad��� �lkenin ismini al�n bu �lkenin ismi 
 Amerika ise ekrana USA, Ingiltere ise ekrana UK, Almanya ise ekrana DE yazd�r�n.
 Di�er �lkeler i�in ise NA yazd�r�n.
5)Kullan�c�dan ya�ad��� �lkenin ismini al�n bu �lkenin ilk iki harfini 
b�y�k harf olarak ekrana yazd�r�n.
6)Kullan�c�dan ya�ad��� �lkenin ismini al�n bu �lkenin bastan ikinci harfi 
ile sondan ikinci harfini b�y�k harf olarak ekrana yazd�r�n.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Ya�ad��n�z �lkeyi yaz�n�z: ");
		String ulke= scan.nextLine();
		
		//5)
			switch(ulke) {
		case "Ingiltere":
			System.out.println("UK");
			break;
		case "Amerika":
			System.out.println("USA");
			break;
		case "Almanya":
			System.out.println("DE");
			break;
		default:
			System.out.println("NA");
		}
		//6)		
		System.out.println(ulke.toUpperCase().charAt(0)+""+ulke.toUpperCase().charAt(1));
		//7)
		System.out.println(ulke.toUpperCase().charAt(1)+""+ulke.toUpperCase().charAt(ulke.length()-2));
		
			
			
			
		scan.close();
		
		
		
	}

}
