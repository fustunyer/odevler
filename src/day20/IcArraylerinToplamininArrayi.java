package day20;

import java.util.Arrays;

public class IcArraylerinToplamininArrayi {

	public static void main(String[] args) {
		/*
Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların 
toplamını birer birer bulan ve herbir sonucu yeni bir array’in elemanı yapan 
ve yeni array’i ekrana yazdıran bir program yazınız
{ {1,2,3}, {4,5}, {6,7} }
Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
Multi Dimensional Array Soruları
		 */
		int arr[][]= {{1,2,3},{4,5},{6,7}};
		int arr1[]=new int[arr.length];
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr1[i]+=arr[i][j];
			}
		}
		System.out.println(Arrays.toString(arr1));//[6,9,13]
		
		
		
		
	}

}
