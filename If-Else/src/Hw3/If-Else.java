package Hw3;

import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double x,y ;
		
		System.out.print("Birinci sayiyi giriniz:");
		x = scan.nextDouble();
       System.out.print("İkinci sayiyi giriniz:");
		y = scan.nextDouble();
		
		if (x == y) {
			System.out.println("iki sayida birbirine eşittir");
		}else if (x > y) {
			System.out.println("Birinci sayi daha büyüktür.İkinci sayı daha küçüktür");
		}else {
			System.out.println("ikinci sayi daha büyüktür.Birinci sayı daha küçüktür");
		}// 1 bitti
		System.out.println("");//bos satir
		
		int vize  , ffinal ;
		double ort = 0;
		System.out.print("Vize notunu giriniz:");
		vize = scan.nextInt();
		
		if (vize > 100) {
			System.out.println("Hatali bir  not girdiniz,vize notu 100 ' u gecemez !");
			return ;
		}
		 
		System.out.print("\nFinal notunu giriniz:");
		ffinal = scan.nextInt();  
		
		if (ffinal > 100)  {
			System.out.println("Hatali bir  not girdiniz,final notu 100 uzeri olamaz !");
			return;
		}    
		
		ort = (vize * 0.35) + (ffinal * 0.65);
		System.out.println("Ortalama:" + ort);
		

		if (ort >= 75) {
			System.out.println("Geçti");
		}else {
			System.out.println("Kaldı");
		}// 2 bitti
		//hesap makinesine hos geldiniz
		
		System.out.println("");//bos satir
		
		    String secim = "";
		    String toplama = "+" ;
		    String cikarma = "-" ;
		    String carpma = "*" ; 
		    String bolme = "/"	;			
		    int sayiAdet;
		    double sonuc = 0 , ilkSayi;
		    
		    System.out.println("Kaç adet sayı girmek istiyorsunuz(En az 2 sayı girmelisiniz) :");
		    sayiAdet = scan.nextInt();
		    if (sayiAdet < 2) {
		    	System.out.println("En az 2 sayi ile islem yapabilirsiniz");
		    	return;
		    }
		    
		    System.out.println("İlk sayiyi giriniz :");
	        ilkSayi = scan.nextDouble();
	        sonuc = ilkSayi;
	        
	        System.out.print("lütfen yapmak istediğiniz işlemi seçiniz (isleme ait karakteri girin !) :");
			System.out.println("\ntoplama(+)\nçıkarma(-)\ncarpma(*)\nbolme(/)");
			System.out.println("Seçiminiz:");
	        secim = scan.next();
	        
	         if (secim.equals(toplama) || secim.equals(cikarma) || secim.equals(carpma) || secim.equals(bolme) ) {
	        }else {
	        	System.out.println("Hatali bir karakter girdiniz , bu karaktere atanmis bir islem bulunamadi !");
	        	return ;
	        }
	        
	            for (int i = 1; i < sayiAdet ; i++) {
	        	System.out.println((i + 1) + ". sayiyi giriniz :");
	        	double sayi = scan.nextDouble();
	        	
	        	if (secim.equals(toplama)) {
	        		sonuc += sayi;
	        	}else if (secim.equals(cikarma)) {
	        		sonuc -= sayi;
	        	}else if (secim.equals(carpma)) {
	        		sonuc *= sayi;
	        	}else if (secim.equals(bolme)) {
	        		if (sayi == 0) {
	        			System.out.println("Hata: ikinci sayi 0'a eşıttır ve sonuç belirsizdir !");
	        			return;
	        		}else {
	        			sonuc /= sayi ;
	        		}
	        	}else {
	        		System.out.println("Hatali bir karakter girdiniz , bu karaktere atanmis bir islem bulunamadi !");
	        	}
	        	
	        	if (i == (sayiAdet - 1)) {
	        		break;
	        	}
	        	System.out.println("sonuç =" + sonuc);
	        	System.out.println("");//bos satir
	        	System.out.println("Seciminiz (+ , - , * , /) :");
	        	secim = scan.next();
	        	 if (secim.equals(toplama) || secim.equals(cikarma) || secim.equals(carpma) || secim.equals(bolme)) {
	 	        }else {
	 	        	System.out.println("Hatali bir karakter girdiniz , bu karaktere atanmis bir islem bulunamadi !");
	 	        	return ;
	 	        }
	            }
	            System.out.println("sonuç =" + sonuc);
	            System.out.println("Islemleriniz sona erdi.");
	             // 3 bıttı
	            Scanner input = new Scanner(System.in);
	            System.out.println("");//bos satir
	            
	            System.out.println("Lutfen google domainli bir email giriniz :");
	            String email = input.nextLine();
	            
	            if (email.endsWith("@gmail.com")) {
	            	System.out.println("Basarili bir sekilde giris yaptiniz");
	            }else {
	            	System.out.println("Lutfen google domaini olan bir email kullaniniz !");
	            	return;
	            }
	            // 4 bitti
	            
	            System.out.println("");//bos satir
	            double boy , kilo , kitle_indeksi ;
	            
	            System.out.println("Boyunuzu giriniz :");
	            boy = input.nextDouble();
	            System.out.println("Kilonuzu giriniz :");
	            kilo = input.nextDouble();
	            
	            kitle_indeksi = kilo / (boy *boy) ;
	            System.out.println(kitle_indeksi);
	            
	            if (kitle_indeksi <= 18.5 ) {
	            	System.out.println("ZAYIF");
	            }
	            else if (kitle_indeksi <= 24.9)
	            {
	            System.out.println("NORMAL");
	            }
	            else if (kitle_indeksi <= 29.9) {
	            	System.out.println("KILOLU");
	            }
	            else {
	            	System.out.println("OBEZ");
	            }
	                
	            //5 bitti
	            //odev3 tamamlandi
	}
}
	
	
		
		