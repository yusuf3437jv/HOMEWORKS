package HW;

import java.util.Scanner;

public class StringHW {

	private static Scanner scan;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		 System.out.println("Bir sey giriniz: ");
		 String str = scan.nextLine();
		 System.out.println("uzunluk = " + str.length());
		 
		 System.out.println("Bir sey giriniz: ");
		 String x = scan.nextLine();
		 System.out.println("2.indeks:" + x.charAt(2));
		 System.out.println(x.indexOf('e'));
		 
		 System.out.println("bir sey giriniz:");
		 String y = scan.nextLine();
		 System.out.println("yazinin guncel hali:" + y.substring(3,8));
		 
		 System.out.println("bir sey giriniz:");
		 String metin = scan.nextLine();
		 System.out.println("buyuk hali:" + metin.toUpperCase());
		 
		 System.out.println("bir sey giriniz:");
		 String a = scan.nextLine();
		 System.out.println("yaziniz bununla mi basliyor?" + a.startsWith("AV"));
		 System.out.println("yaziniz bununla mi bitiyor?" + a.endsWith("SA"));
		 
		 System.out.println("bir sey giriniz:");
		 String str2 = scan.nextLine();
	         System.out.println("yazinin yeni hali:" + str2.replace("futbol","basketbol"));
		 
		 
		 
				
		 

	}

}
