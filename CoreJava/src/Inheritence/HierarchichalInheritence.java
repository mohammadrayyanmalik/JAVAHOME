package Inheritence;

public class HierarchichalInheritence {
	public static void main(String[] args) {
		Employee e1=new Employee(11,"Qasim",10000);
		System.out.println(e1.monthlySalary);
		
		System.out.println("=================================================================");
		
		PartTimeEmployee PTE=new PartTimeEmployee(12,"salim",10000,2000);
		System.out.println(PTE.bonus);
		System.out.println(PTE.monthlySalary);

		System.out.println("=================================================================");
		
		FullTimeEmployee FTE=new FullTimeEmployee(12,"Rizwan",10000,12,1);
		System.out.println(FTE.insuranceNo);
		
	}
}
