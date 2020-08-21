package day18;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayYazimi {

	public static void main(String[] args) {
		/*Kullanıcıya kaç elemanlı bir array gireceğini sorun.
Kullanıcıdan array’in elemanlarını girmesini isteyin.
		a) Bu array’in tum elemanlarını ekrana yazdırın.
		b) Bu arayın son elemanını ilk eleman yapın ve tum elemanlarını ekrana yazdırın.
		Mesela; array {1, 2, 3} ise ekrana {3, 1, 2} seklinde yazdırın.*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Kac elemanli Array olusturmak istiyorsunuz?");
		int elemanSayisi=scan.nextInt();
		String arr[]=new String[elemanSayisi];
		
		/*for (int i = 0; i <elemanSayisi ; i++) {
			System.out.println("Array elemanlarini giriniz. ");
			arr[i]=scan.next();			 
		}
		System.out.println(Arrays.toString(arr));
		/*String arr0=arr[0];
		String arrSon=arr[arr.length-1];
		arr[0]=arrSon;
		arr[arr.length-1]=arr0;
		System.out.println(Arrays.toString(arr));*/
		
	/*	Bu array’in icinde herhangi bir elemanın var olup olmadigini kontrol edin.
		b) Bu arayın tum elemanlarını tersten yazdırın.
		Mesela; array {1, 2, 3, 4} ise ekrana {4, 3, 2, 1} seklinde yazdırın.*/
		
		for (int i = 0; i <elemanSayisi ; i++) {
			System.out.println("Array elemanlarini giriniz. ");
			arr[elemanSayisi-1-i]=scan.next();			 
		}
		System.out.println(Arrays.toString(arr));
		//arr icinde ali var mi kontrol edelim
		System.out.println("Array icinde hangi ifadeyi aramak istiyorsun" );
		String str=scan.next();
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals(str)) {
			count++;
			}
		}
		if (count!=0) {
			System.out.println("Array icinde "+str+" elemani vardir." );
		}else
			System.out.println("Array icinde "+str+" elemani yoktur." );
		
		scan.close();	
		
	}

}
