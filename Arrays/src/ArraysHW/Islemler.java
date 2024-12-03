package ArraysHW;

import java.util.ArrayList;
import java.util.Random;

public class Islemler {

	public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>() ;
    
    Random rd = new Random();
    
    for(int i = 0; i < 3;i++) {
    	numbers.add(rd.nextInt(101)) ;
    }
    System.out.println("Elemanlar: " + numbers);
    System.out.println("");//bos satir
    
   //toplami hesaplama 
    int toplam = 0;
    
    for(int i = 0; i < numbers.size();i++) {
    	toplam += numbers.get(i) ;
    }
     System.out.println("Toplam: " + toplam);
    
     //ortalama hesaplama
     double ort = (double) toplam / numbers.size() ;
     
     System.out.println("Ortalama: " + ort);
     
     int max = numbers.get(0);
     for(int i = 0; i < numbers.size();i++) {
    	 if (numbers.get(i) > max) {
    		 max = numbers.get(i) ;
    	 }
     }
     System.out.println("Max deger: " + max);
      
    

	}

}
