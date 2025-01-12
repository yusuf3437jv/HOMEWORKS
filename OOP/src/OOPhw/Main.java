package OOPhw;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
        Employee emp = new Employee("Yusuf", 22125.0, 45, 2010);

		System.out.println("Çalışanın İsmi: " + emp.getName());
		System.out.println("Çalışanın Maaşı: " + emp.getSalary());
		System.out.println("Çalışanın Çalışma Saati: " + emp.getWorkHours());
		System.out.println("Hire Date: " + emp.getHireYear());

		emp.everyThing();
		System.out.println("*************************************************");

		System.out.println("How many emplooyes would you like to add?");
		int number = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < number; i++) {
			System.out.println("Name of the emplooye you want to add: ");
			String name = scan.nextLine();

			System.out.println("Salary of the employee you want to add: ");
			double wage = scan.nextDouble();

			System.out.println("Work hours of the employee you want to add:");
			int workHour = scan.nextInt();

			System.out.println("Hire date of the employee you want to add:");
			int hireYear = scan.nextInt();
			scan.nextLine();
			System.out.println("*************************************************");

			Employee emp2 = new Employee(name, wage, workHour, hireYear);
			employees.add(emp2);
		}

		System.out.println("\nAll Employees: ");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}
