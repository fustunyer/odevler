package day04;

public class TypeCasting01 {

	public static void main(String[] args) {
		// double 100.235 i int’e çevirip ekrana yazdiriniz.
		
		double d1 = 100.235;
		int i1 = (int) d1;
		System.out.println(d1);
		System.out.println(i1);
		
		// int data type’ýnda oluþturulan 5 sayýsý ile double data type’ýnda oluþturulan
		// 6.2 sayýsýný toplayýp sonucu ekrana yazdýrýnýz.
		int i2= 5;
		double d2=6.2;
		System.out.println(i2+d2);//11.2
		
		short num1 = 255;
		byte num2 = (byte) num1;
		System.out.println(num2);//-1
		
		int n1 = 5/2;
		System.out.println(n1);//2
		float n2 = 5f/2f;
		System.out.println(n2);//2.5
		double n3 = 5d/2d;
		System.out.println(n3);//2.5
		
		int nm1 = 5/3;
		System.out.println(nm1);//1
		float nm2 = 5f/3f;
		System.out.println(nm2);//1.6666666
		double nm3 = 5d/3d;
		System.out.println(nm3);//1.666666666666667
		
	}

}
