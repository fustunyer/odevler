package day16;

public class Counter01 {
	
	int count=0;
	
	Counter01(){
		this.count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		Counter01 c1=new Counter01();
		Counter01 c2=new Counter01();
		Counter01 c3=new Counter01();
		System.out.println(c1.count+c2.count+c3.count);
		

	}

}
