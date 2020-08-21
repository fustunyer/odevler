package day22;

import java.util.ArrayList;
import java.util.List;

public class AyniElemanlar {

	public static void main(String[] args) {
		//İki String array oluşturunuz ve bu array’lerdeki ortak elemanları
		//	For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.
		//Ortak eleman yoksa ekrana “Ortak eleman yok” yazdırınız

		String [] arr= {"Alim","osman","Tala"};
		String [] arr1= {"Ali","Veli","Talat"};
		List<String> ortakElemanlar = new ArrayList<>();
		for (String w : arr) {
			for (String i : arr1) {
				if(w.equals(i)) {
					ortakElemanlar.add(w);
				}
			}
		}
		if(ortakElemanlar.isEmpty()) {
			System.out.println("Ortak eleman yok");
		}else {
			System.out.println(ortakElemanlar);
		}
	}

}
