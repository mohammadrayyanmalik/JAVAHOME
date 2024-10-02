package Inheritence;

public class FullTimeEmployee extends Employee {
	int noOfLeaves;
	int insuranceNo;
	
	FullTimeEmployee(int id, String name, double monthlySalary,int noOfLeaves,int insuranceNo)
	{
		super(id,name,monthlySalary);
		this.noOfLeaves=noOfLeaves;
		this.insuranceNo=insuranceNo;
	}
}
