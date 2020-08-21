package day11;

import java.util.Scanner;

public class WhileLoop01 {

	public static void main(String[] args) {
		//Sorular …
//1)While loop kullanarak 3 den 13 e kadar tum tek tamsayýlarý ekrana yazdýrýnýz.
		int i=3;
		while(i<=13) {
			if(i%2!=0) 
				System.out.print(i+" ");
				i++;
		}
 
//2)Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
//biten tüm tamsayýlarý while loop kullanarak ekrana yazdýrýnýz.
		Scanner scan = new Scanner(System.in);
		System.out.println("Baþlangýç deðerini giriniz:");
		int b1=scan.nextInt();
		System.out.println("Bitiþ deðerini giriniz:");
		int b2=scan.nextInt();
		
		if(b1<=b2) {
			while(b1<=b2) {
				System.out.print(b1+" ");
				b1++;
			} 
			
			}else if(b1>=b2) {
				while (b1>=b2) {
					System.out.println(b1);
					b1--;
				}			
	}
		
//3)Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden veya sonrasýndan
//baþlayýp bitiþ deðerinde veya öncesinde biten tüm çift tamsayýlarý while loop kullanarak
//ekrana yazdýrýnýz.
		if(b1<=b2) {
			while(b1<=b2) {
				if(b1%2==0) 
				System.out.print(b1+" ");
				b1++;
			} 
				
			}else if(b1>=b2) {
				while (b1>=b2) {
					if(b1%2==0)
					System.out.println(b1);
					b1--;
				}			
	}
//4)Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
//biten tüm tamsayýlarýn toplamýný ekrana yazdýrýn.
		int sum=0;
		if(b1<=b2) {
			while(b1<=b2) {
				sum=sum+b1;
				b1++;
			}System.out.print("toplam: " + sum);
		
			}else if(b1>=b2) {
				while (b1>=b2) {
					sum=sum+b1;
					b1--;
				}System.out.println("toplam: "+sum);
							
	}scan.close(); 
	}	 
}

