package day21;

import java.util.Scanner;

public class SekilSorusu {

	public static void main(String[] args) {
		
		/*System.out.println("<------->");
		for(int i=1; i<=5; i++) {
			System.out.println("+\t+");
			System.out.println("    +");
		}
		System.out.println("<------->");
		*/
		
		
		
		
		
		Scanner giris=new Scanner(System.in);
	     int min,max,degistir;
	     System.out.println("Lütfen min değer giriniz=");
	     min=giris.nextInt();
	     System.out.println("Lütfen max değer giriniz=");
	     max=giris.nextInt();
	     if(min==max){
	     System.out.println("Min ve Max değer aynı olmamalı.Lütfen max değer giriniz=");
	     max=giris.nextInt();
	     }
	     if(min>max){
	     degistir=min;
	     min=max;
	     max=degistir;
	      }
	     giris.close();
	     for(;min<max;min++) {
	    	 System.out.print(min+" ");
	     }
	}

}
