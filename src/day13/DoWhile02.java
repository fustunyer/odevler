package day13;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýya sayý girmesini söyleyin. 
		 * Kullanýcý sýfýr girdiðinde, ekrana o ana kadar girmiþ olduðu
tüm sayýlarýn toplamýný yazdýrýnýz.
Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdýrýn
		 */
		Scanner scan = new Scanner(System.in);
		int i=1;
		int sum=0;
		do {
			System.out.println("bir sayý giriniz: ");
			i = scan.nextInt();
			sum=sum+i;
			
		}while(i!=0);
		System.out.println(sum);
		
		scan.close();
		
		
	}

}
