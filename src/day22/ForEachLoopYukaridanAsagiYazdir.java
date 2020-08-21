package day22;

public class ForEachLoopYukaridanAsagiYazdir {

	public static void main(String[] args) {
	/*	Bir String oluşturunuz, bu String’deki character’leri yukarıdan aşağıya
			for-each loop kullanarak yazdırınız.
			İpucu: split()*/
		
		
		String str="Java ogreniyorum!";
		
		String [] chr = str.split(""); 
		
		for (String w : chr) {
			System.out.println(w);
		}
		
		
		
		
		
	}

}
