package day03;

import java.util.Scanner;

public class DaireninCevresiAlani {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double pi=3.14159;
		System.out.println("Dairenin yarýçapý= ");
		double yarýcap = scan.nextDouble();
		System.out.println("Dairenin çevresi");
		System.out.println(2*pi*yarýcap);
		System.out.println("Dairenin alaný");
		System.out.println(pi*yarýcap*yarýcap);
		
			
		
		scan.close();

	}

}
