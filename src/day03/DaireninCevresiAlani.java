package day03;

import java.util.Scanner;

public class DaireninCevresiAlani {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double pi=3.14159;
		System.out.println("Dairenin yar��ap�= ");
		double yar�cap = scan.nextDouble();
		System.out.println("Dairenin �evresi");
		System.out.println(2*pi*yar�cap);
		System.out.println("Dairenin alan�");
		System.out.println(pi*yar�cap*yar�cap);
		
			
		
		scan.close();

	}

}
