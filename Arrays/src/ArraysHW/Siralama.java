package ArraysHW;

import java.util.ArrayList;
import java.util.Random;

public class Siralama {

	public static void main(String[] args) {
	ArrayList<Integer> numbers = new ArrayList<Integer>() ;
 
	Random rd = new Random() ;	
	
	for(int i = 0; i < 15; i++) {
		numbers.add(rd.nextInt(100)+1) ; //1-100 arasinda
	}
	  System.out.println("Elemanlar: " + numbers);
	 
	  for(int i = 0; i < numbers.size(); i++) {
		  
		  for(int j = i + 1; j < numbers.size(); j++) {
			  
			  if(numbers.get(i) > numbers.get(j)) {
				  
				 int temp = numbers.get(i) ;
				 
				 numbers.set(i, numbers.get(j)) ;
				 
				 numbers.set(j, temp) ;
			  }
		  }
	  }
	
	
	  System.out.println("Küçükten Büyüğe Sıralama: " + numbers);
	
	
	
	}

}
