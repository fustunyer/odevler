package day03;

import java.util.Scanner;

public class KareAlanCevreHesab� {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Karenin bir kenar uzunlu�unu giriniz= ");
		int kenar = scan.nextInt();
		System.out.println("karenin alan�= "+ kenar*kenar);
		System.out.println("karenin �evresi= "+ 4*kenar);
		
		scan.close();

	}

}
