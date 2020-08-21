package day16;

public class MyConstructor {
	/*
	 * This () öğesi çağrıldığında, 
	 *  hiçbir bağımsız değişken olmayan sınıfın yapıcısını çağırır.
	 */
	
	int x=5;
	MyConstructor(){
		System.out.println("-x"+x);
	}
	MyConstructor(int x){
		this();
		System.out.print("-x"+x);
	}
	public static void main(String[] args) {
		
		MyConstructor mc1 = new MyConstructor(4);
		
		MyConstructor mc2 = new MyConstructor();
		
		mc1.x=10;
		mc2.x=10;
		System.out.println(mc1.x+" "+mc2.x);
	}

}
