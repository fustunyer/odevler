package day11;

import java.util.Scanner;

public class WhileLoop01 {

	public static void main(String[] args) {
		//Sorular �
//1)While loop kullanarak 3 den 13 e kadar tum tek tamsay�lar� ekrana yazd�r�n�z.
		int i=3;
		while(i<=13) {
			if(i%2!=0) 
				System.out.print(i+" ");
				i++;
		}
 
//2)Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
//biten t�m tamsay�lar� while loop kullanarak ekrana yazd�r�n�z.
		Scanner scan = new Scanner(System.in);
		System.out.println("Ba�lang�� de�erini giriniz:");
		int b1=scan.nextInt();
		System.out.println("Biti� de�erini giriniz:");
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
		
//3)Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden veya sonras�ndan
//ba�lay�p biti� de�erinde veya �ncesinde biten t�m �ift tamsay�lar� while loop kullanarak
//ekrana yazd�r�n�z.
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
//4)Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
//biten t�m tamsay�lar�n toplam�n� ekrana yazd�r�n.
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

