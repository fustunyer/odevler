package day03;

import java.util.Scanner;

public class KareAlanCevreHesabı {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Karenin bir kenar uzunluğunu giriniz= ");
		int kenar = scan.nextInt();
		System.out.println("karenin alanı= "+ kenar*kenar);
		System.out.println("karenin çevresi= "+ 4*kenar);
		
		scan.close();

	}

}
