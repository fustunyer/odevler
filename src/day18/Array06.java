package day18;

import java.util.Arrays;

public class Array06 {

	public static void main(String[] args) {
		/*
		 * Bir array’de herhangi iki elemanın aynı olup olmadığını kontrol
eden bir program yazınız.Aynı eleman varsa “Aynı eleman var” yoksa
“Aynı eleman yok” yazdırınız.
		 */
		int arr[]= {12,22,23,25,366,155};
		
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 12));
		
		
		
		
		
	}
}
