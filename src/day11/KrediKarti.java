package day11;

import java.util.Scanner;

public class KrediKarti {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan kredi kartý numarasýný alýn ve 
		 * bu numaranýn üçüncü, dördüncü ve sonuncu
			rakamlarýný ekrana yazdýrýn.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("16 haneli kredi kartý numaranýzý giriniz: ");
		String k = scan.nextLine();
		
		
		System.out.println(k.charAt(2));
		System.out.println(k.charAt(3));
		System.out.println(k.charAt(k.length()-1));
		scan.close();		
		
	}


}
