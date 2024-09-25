package StaticKeyWord;

public class Employee {
	
	int empId;
	static String empName;
	String manager;
	
	Employee()
	{
		System.out.println("non parametarized conctructur");
	}
	
	
	Employee(int empId , String manager)
	{
		this.empId=empId;
		this.manager=manager;
	}
	
	static void changeEmpName(String employeeName)
	{
		empName=employeeName;
	}
	

}
