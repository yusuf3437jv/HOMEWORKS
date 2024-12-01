package Homework;

import java.util.Random;

public class RastgeleSayi {

	public static void main(String[] args) {
		Random rd = new Random();
		int j = 0;
		
		 for(int i=1; i <= 50; i++) {
			 int x = rd.nextInt(101);//0-100 arasinda rastgele bir sayi alir
			 System.out.println(x);
			 
			 if(x % 2 == 0) {
				 j++;
			 }
		 }
		 System.out.println("");//boş satır
		 System.out.println("Kaç tane çift kaç tane tek sayı var ?");
		 System.out.println("Çift Sayılar:" + j + "  Tek Sayılar:" +(50 - j));
	}

}
