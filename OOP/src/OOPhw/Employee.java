package OOPhw;

public class Employee {

	public String name;
	public double salary;
	public int workHours, hireYear;

	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
    public Employee(String name, double salary, int workHours) {
    	this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = 0;
    }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

	public double tax() {
		if (this.salary <= 158000) {
			return this.salary * 0.15;
		}
		return 0.0;
	}

	public double bonus() {
		int extraHours = this.workHours - 40;
		if (extraHours > 0) {
			return extraHours * 200;
		}
		return 0.0;
	}
	
	public double raise() {
		int year = 2025 - this.hireYear;
		if (year < 10) {
			return this.salary * 0.05;
		} else if (year > 9 && year < 20) {
			return this.salary * 0.10;
		} else {
			return this.salary * 0.15;
		}
	}

	public void printInfo() {
		System.out.println("Tax: " + tax());
		System.out.println("Bonus: " + bonus());
		System.out.println("Raise of Salary: " + raise());
		double totalSalary = this.salary - tax() + bonus();
		System.out.println("Salary with tax and bonus: " + totalSalary);
		System.out.println("Total Salary with the raise of salary: " + (this.salary + raise()));
	}
	 @Override
	    public String toString() {
	        return "Name: " + name + ", Salary: " + salary + ", Work Hours: " + workHours + ", Hire Year: " + hireYear;
	    }
}
