package day03;

import java.util.Scanner;

public class DikdortgenAlanCevre {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dikd�rtgenin 1. kenar�= ");
		System.out.println("Dikd�rgenin 2. kenar�= ");
		int kenar1 = scan.nextInt();
		int kenar2 = scan.nextInt();
		System.out.println("Dkd�rtgenin alan�= "+kenar1*kenar2);
		System.out.println("Dikd�rtgenin �evresi= "+2*(kenar1+kenar2));
		
		
				
		scan.close();
	}

}
