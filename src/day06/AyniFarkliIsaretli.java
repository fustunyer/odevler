package day06;

import java.util.Scanner;

public class AyniFarkliIsaretli {

	public static void main(String[] args) {
				// Kullan�c�dan iki say� al�n e�er say�lar�n i�aretleri ayn� ise ekrana "Ayn� i�aretli" yazd�r�n.
			    //	Say�lar�n i�aretleri farkl� ise ekrana "Farkl� i�aretli" yazd�r�n.
		
				Scanner scan= new Scanner(System.in);
				System.out.println("bir tane sayi yazin");
				
				int num1 = scan.nextInt() ;
				
				System.out.println("bir tane dah sayi yazin");
				int num2 = scan.nextInt() ;
							
				if (num1*num2>0) {
					System.out.println("Ayn� isaretli");}
				else {
					System.out.println("Farkl� isaretli");
				}
					
				scan.close();
	}

}
