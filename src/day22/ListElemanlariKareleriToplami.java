package day22;

import java.util.ArrayList;
import java.util.List;

public class ListElemanlariKareleriToplami {

	public static void main(String[] args) {
	//	Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin toplamını
	//  For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.
		
		List<Integer> lint= new ArrayList<>();
		lint.add(2);
		lint.add(3);
		lint.add(4);
		lint.add(1);
		
		System.out.println(lint);
		int sum=0;
		for (int  w : lint) {//4+9+16+1
			sum+=w*w;
		}
		System.out.println(sum);
		
		
	}

}
