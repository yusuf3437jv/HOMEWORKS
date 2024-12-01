package datatypeshw;

import java.util.Scanner;

public class Homework2 {
	
	private static Scanner scan;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("iki sayi giriniz:");
		double a=scan.nextDouble();
		double b=scan.nextDouble();
	    double toplama = a+b;
	    double cikarma = a-b;
	    double carpma = a*b;
	    double bolme = a/b;
	   
	    System.out.println("toplama sonucu:"+toplama);
	    System.out.println("çıkarma sonucu:"+cikarma);
	    System.out.println("çarpma sonucu:"+carpma);
	    System.out.println("bölme sonucu:"+bolme);
	    System.out.println(); // Boş satır

	    System.out.println("Bır eşkenar üçgenin yükseklik ve taban değerlerini sırasıyla giriniz:");
	    double y=scan.nextDouble();
	    double t=scan.nextDouble();
	    double ucgenalan = (y*t)/2;
	    double ucgencevre =t*3 ;
	    System.out.println("üçgenin alanı:"+ucgenalan);
	    System.out.println("üçgenın çevresi:"+ucgencevre);
	    System.out.println(); // Boş satır
	
	    System.out.println("Dairenin yarıçapını giriniz");
	    double r=scan.nextDouble();
	    double pi = 3.14;
	    double dairealan = pi*r*r;
	    double dairecevre = 2*pi*r;
	    System.out.println("dairenin alanı:"+dairealan);
	    System.out.println("dairenin çevresi:"+dairecevre);
	 
	    		
	   
	    		
	    
			
		        
		}

	}

	


