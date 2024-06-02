class Person {
	private String name;
	
	Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
class Employee extends Person {

		private double annualSalary;
		private int yearOfStart;
		private String nationalInsuranceNo;
		
		Employee(String name, double annualSalary, int yearOfStart, String nationalInsuranceNo) {
			super(name);
			this.annualSalary = annualSalary;
			this.yearOfStart = yearOfStart;
			this.nationalInsuranceNo = nationalInsuranceNo;
		}

		public double getAnnualSalary() {
			return annualSalary;
		}

		public int getYearOfStart() {
			return yearOfStart;
		}

		public String getNationalInsuranceNo() {
			return nationalInsuranceNo;
		}


}
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee e = new Employee("Alice", 1000000, 2010, "01248204");
		
		System.out.println("Details of Employee:");
		System.out.println("Name: " + e.getName());
		System.out.println("Year Of Starting: " + e.getYearOfStart());
		System.out.println("Annual Salary: " + e.getAnnualSalary());
		System.out.println("Insurance Number: " + e.getNationalInsuranceNo());

	}

}
