package day10;

import java.util.Scanner;

public class StringMethodExample {

	public static void main(String[] args) {
		/*
		String s = "Dunya Sevgisi Tum Hatalarin Basidir.!'^^+%&/()=?_1234567890";
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.endsWith("dir."));
		System.out.println(s.endsWith("dir"));
		System.out.println(s.contains("a"));
		System.out.println(s.contains(" "));
		System.out.println(s.contains("")); 
		System.out.println(s.contains("q"));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(34));
		System.out.println(s.replace('a', '*'));
		System.out.println(s.replace("Dunya", "uzay"));
		System.out.println(s.replaceAll("\\w" ,"*" ));
		System.out.println(s.replaceAll("\\W" ,"*" ));
		System.out.println(s.replaceAll("\\d" ,"*" ));
		
		
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Fatih üstünyer yaziniz");
		String ad=scan.nextLine();
		
		String ad1="Fatih ÜSTÜNYER";
		String ad2="FATIH ÜSTÜNYER";
		
		System.out.println(ad1==ad2);
		System.out.println(ad==ad1);
		System.out.println(ad.equals(ad1));
		
		
		System.out.println(ad.equalsIgnoreCase(ad1));
		System.out.println(ad2.equalsIgnoreCase(ad1));
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
