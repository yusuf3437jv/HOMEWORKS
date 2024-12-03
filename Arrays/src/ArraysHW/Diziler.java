package ArraysHW;

import java.util.ArrayList;

public class Diziler {

	public static void main(String[] args) {
		//  Bir array list oluştur ve isimleri ekle 10 tane
		ArrayList<String> names = new ArrayList<String>();		
		
		names.add("Yusuf");
		names.add("Ezel");
		names.add("Efe");
		names.add("Ufuk");
		names.add("Semih");
		names.add("Toprak");
		names.add("Hasan");
		names.add("Helin");
		names.add("Fou");
		names.add("Eylül");
		
	   // 1. Arraydeki elemanların hepsini yazdır
		for(int i = 0; i < names.size(); i++) {
			System.out.println("Eleman: " + names.get(i));
		}
		System.out.println("");//bos satir
		
		// 2. Bir eleman üzerinde güncelleme yap
		names.set(0,"Osimhen");
		
		for(int i = 0; i < names.size(); i++) {
			System.out.println("Güncelleme sonrası isimler:  " + names.get(i));
		}
		System.out.println("");//bos satir 
		
		//3. Bir elemanı diziden çıkar
		names.remove(4);
		
		for(int i = 0; i < names.size(); i++) {
			System.out.println("Bir eleman cikarildiktan sonra liste:  " + names.get(i));
		}
		System.out.println("");
		
		 // 4. Tüm elemanları büyük harflerle yazdır
		for(int i = 0; i < names.size(); i++) {
			System.out.println("Tum elemanlar buyuk harfle yazildiktan sonra liste:  " + names.get(i).toUpperCase());
		}
		
		//Finish
		
		
		
			
	}

}
