package methodsHW;

import java.util.ArrayList;
import java.util.Scanner;

public class functions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int result = multiplication(scan);
		System.out.println("The result of the multiplication is: " + result);
		// 1
		System.out.println("");// bos satir

		averageOfTheGrades(scan);
		// 2
		System.out.println("");// bos satir

		midtermFinalCalculation(scan);
	}

	public static int multiplication(Scanner scan) {
		int result = 1;
		System.out.println("How many numbers do you want to add to multiply: ");

		int a = scan.nextInt();
		scan.nextLine();

		int[] numbers = new int[a];

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter the " + (i + 1) + ". number: ");
			numbers[i] = scan.nextInt();
		}
		for (int number : numbers) {
			result *= number;
		}

		return result;

	}
	// 1 bitti

	public static void averageOfTheGrades(Scanner scan) {
		ArrayList<Integer> grades = new ArrayList<>();

		grades.add(53);
		grades.add(26);
		grades.add(85);
		System.out.println("Current Grades: " + grades);
        
		System.out.println("Do you want to add more grades ? (Yes or No)");
		String choice = scan.next();
		
		if (choice.equalsIgnoreCase("yes")) {
		System.out.println("How many notes would you like to add: ");
		int manynotes = scan.nextInt();

		for (int i = 1; i <= manynotes; i++) {
			System.out.print("Enter the note: ");
			int newnote = scan.nextInt();
			grades.add(newnote);
		}
		int total = 0;
		for (int j = 0; j < grades.size(); j++) {
			total += grades.get(j);
		}
		double average = (double) total / grades.size();

		System.out.println("Average of the grades is: " + average); }
	}// 2 bitti

	public static void midtermFinalCalculation(Scanner scan) {
		System.out.print("Enter your visa note: ");
		int midterm = scan.nextInt();

		System.out.println("Enter your final note: ");
		int finall = scan.nextInt();

		double note = (midterm * 0.4) + (finall * 0.6);
		System.out.println("Your note is : " + note);
	} 

}
