package day03;

import java.util.Scanner;

public class KareAlanCevreHesabý {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Karenin bir kenar uzunluðunu giriniz= ");
		int kenar = scan.nextInt();
		System.out.println("karenin alaný= "+ kenar*kenar);
		System.out.println("karenin çevresi= "+ 4*kenar);
		
		scan.close();

	}

}
