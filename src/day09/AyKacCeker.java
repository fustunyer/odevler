package day09;

import java.util.Scanner;

public class AyKacCeker {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan ay ismi alýn 
eðer ay ismi 31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdýrýn.
Eðer ay ismi 30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdýrýn.
Eðer ay ismi 28 veya 29 çeken aylardan biri ise ekrana “Bu ay Þubat ayýdýr” yazdýrýn.
Bu isimlerin dýþýndaki isimler için “Geçersiz ay ismi” yazdýrýn.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir ay giriniz:");
		String ay = scan.nextLine();
		
		switch(ay) {
		case "ocak":
		case "mart":
		case "mayýs":
		case "temmuz":
		case "aðustos":
		case "ekim":
		case "aralýk":
			System.out.println("bu ay 31 gündür");
			break;
		case "nisan":
		case "haziran":
		case "eylül":
		case "kasým":
			System.out.println("bu ay 30 gündür");
			break;
		case "þubat":
			System.out.println("bu ay 28 gündür");
			break;
		default:
			System.out.println("geçersiz ay ismi");
		
		}
		scan.close();

	}

}
