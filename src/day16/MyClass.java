package day16;

public class MyClass {
	/*
1) Turquoises instance variables dir ….TRUE
2) Orange olan parametresiz constructordir ….TRUE
3) Pink olan parametreli constructordir. ….TRUE
4) Green olan parametreli constructordir. ….FALSE
5) Blue olan parametreli constructordir. ….FALSE
6) Variable “letter” local variabledir ….TRUE
7) Instance variablelara baslangic degeri atanmalıdır ….TRUE
8) Verilen kodda sadece 1 Compile Time Error vardır. ….FALSE
9) “this” keyword instance variablelari ifade eder...FALSE
	 */
	int num1;
	String name="Ali";
	
	MyClass(){
		char letter='c';
		System.out.println(letter);
	}
	
	MyClass(int num1){
		this.num1=num1;
	}
	void MyClass1() {
		num1++;
	}
	//increase(int num1){
	//	name++;
	//}
	public static void main(String[] args) {
		

	}

}
