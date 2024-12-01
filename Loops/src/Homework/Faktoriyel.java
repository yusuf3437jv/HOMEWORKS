package Homework;

import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {
		//faktöriyel hesaplama programı
		Scanner scan = new Scanner(System.in);
		int j = 1;
		int sonuc = 1;
		
		System.out.print("Faktöriyeli alınması istediğiniz sayıyı giriniz: ");
		int i = scan.nextInt();
		
		if(i <= 0) {
			System.out.println("0'dan buyuk sayi girmelisiniz!");
		}
       while(j <= i) {
    	   sonuc *= j;
    	   j++;
       }
       System.out.println(i + "!= " + sonuc);
	}

}
