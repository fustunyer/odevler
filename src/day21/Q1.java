package day21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q1 {

	public static void main(String[] args) {
		
// Elemanları A, C, E, ve F olan bir String ArrayList oluşturup ekrana yazdırınız.

		List<String> str=new ArrayList<>();
		System.out.println(str);
		str.add("A");
		str.add("C");
		str.add("E");
		str.add("F");
		
//İndexsiz add() methodunu kullanarak, B’yi ekleyiniz.	
		str.add("B");
//İndex’li add() methodunu kullanarak, L’yi 1 numaralı index’e ekleyiniz.	
		str.add(1,"L");
//ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, E, F, B.
		System.out.println(str);
//set() methodu kullanarak, E’yi D yapınız.ArrayList’i ekrana yazdırınız, 
//list şöyle olmalı; A, L, C, D, F, B.
		str.set(3,"D");
		System.out.println(str);
//	remove() methodu kullanarak, F’yi siliniz.	
//ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, D, B.
		str.remove("F");
		System.out.println(str);
//sort() methodu kullanarak, elemanları alfabetik sıraya diziniz.
//ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, B, C, D, L.
		Collections.sort(str);
		System.out.println(str);
//contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de
//var olmadığını doğrulayınız.
		System.out.println(str.contains("L"));
		System.out.println(str.contains("M"));
//size() methodu kullanarak, list’in kaç eleman olduğunu ekrana yazdırınız.
		System.out.println(str.size());
//clear() methodu kullanarak, list’deki tum elemanları siliniz.
		str.clear();
//isEmpty() methodu kullanarak, list’deki tum elemanların silindiğini doğrulayınız.
		System.out.println(str.isEmpty());
		
	}

}
