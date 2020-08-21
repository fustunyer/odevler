package day16;
public class MyClass02 {
	
	int x=3;
	int y=5;
	
	MyClass02(){
		x+=1;
		System.out.println("-x"+x);
	}
	MyClass02(int i){
		this();
		this.y=i;
		x+=y;
		System.out.println("-x"+x);
	}
	MyClass02(int i, int i2){
		this(3);
		this.x-=4;
		System.out.println("-x"+x);
	}
			
	public static void main(String[] args) {
		//MyClass02 mc1=new MyClass02(4,3);
	}

}


