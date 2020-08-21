package day06;

import java.util.Scanner;

public class AyniFarkliIsaretli {

	public static void main(String[] args) {
				// Kullanıcıdan iki sayı alın eğer sayıların işaretleri aynı ise ekrana "Aynı işaretli" yazdırın.
			    //	Sayıların işaretleri farklı ise ekrana "Farklı işaretli" yazdırın.
		
				Scanner scan= new Scanner(System.in);
				System.out.println("bir tane sayi yazin");
				
				int num1 = scan.nextInt() ;
				
				System.out.println("bir tane dah sayi yazin");
				int num2 = scan.nextInt() ;
							
				if (num1*num2>0) {
					System.out.println("Aynı isaretli");}
				else {
					System.out.println("Farklı isaretli");
				}
					
				scan.close();
	}

}
