package day09;

import java.util.Scanner;

public class UcBasamakli {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir tamsayı girmesini isteyin,
		 *  o tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
			3 basamaklı degilse çift olup olmadigini kontrol edin. 	
			Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
			Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayı yazınız:");
		int sayi = scan.nextInt();
		
		boolean s = (sayi>99&&sayi<1000)||(sayi<-99&&sayi>-1000);
		
		String result = s ? "3 basamaklı" : sayi%2==0 ? "3 basamaklı olmayan çift sayı" : "3 basamaklı olmayan tek sayı";
		System.out.println(result);
		scan.close();
		

	}

}
