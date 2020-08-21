package day03;

import java.util.Scanner;

public class DikdortgenAlanCevre {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dikdörtgenin 1. kenarý= ");
		System.out.println("Dikdörgenin 2. kenarý= ");
		int kenar1 = scan.nextInt();
		int kenar2 = scan.nextInt();
		System.out.println("Dkdörtgenin alaný= "+kenar1*kenar2);
		System.out.println("Dikdörtgenin çevresi= "+2*(kenar1+kenar2));
		
		
				
		scan.close();
	}

}
