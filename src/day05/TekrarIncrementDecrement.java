package day05;

import java.util.Scanner;

public class TekrarIncrementDecrement {
	
	public static void main(String[] args) {
		
		/* 0)sayýlarý kullanýcýdan alýn.
		 * 1)2 tane int variable oluþturun. a=5 b=3 gibi
		 * 2)bu integerlarýn deðerlerinin yerlerini deðiþtirin a=3 ve b= 5 olsun
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz:");
		int s1 = scan.nextInt();
		System.out.println("ikinci sayýyý giriniz:");
		int s2 = scan.nextInt();
		
		System.out.println(s1+" "+s2);
		/* 
		int bos = 0;
		bos = s1;
		s1  = s2;
		s2  = bos;
		System.out.println(s1+" "+s2);
		*/
				
		s1 = s1 + s2;
		s2 = s1 - s2;
		s1 = s1 - s2;
		System.out.println(s1+" "+s2);
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
