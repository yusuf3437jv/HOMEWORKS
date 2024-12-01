package Homework;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		//email ve şifre 
		Scanner scan = new Scanner(System.in);
	    int n = 3;
	    System.out.println("En fazla 3 defa yanlis deger girebilirsiniz");
	    
	  for(int i = 1; i <= n; i++) {
		  
		  System.out.print("E-mail'inizi giriniz: ");
		  String email = scan.nextLine();
		 
		  System.out.print("Sifrenizi giriniz: ");
		  String password = scan.nextLine();		  
		  
		 if(email.contains("@gmail.com") && password.length() >= 8) {
			 System.out.println("Başarılı");
			 break;
		 }
		 else {
			 System.out.println("E-mail'iniz veya sifreniz hatali!");
			 System.out.println("");//bos satir
			 if(i == 3) {
				 System.out.println("Başarısız! Hiç deneme hakkınız kalmadı");
			 }
			 System.out.println(n-i + " kez deneme hakkiniz kaldi");
		 }
	   }
		

	}

}
