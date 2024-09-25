package StaticKeyWord;

public class Employee1 {
	public static void main(String[] args) {
		new Employee();
		Employee.empName="Rayyan";
		
		Employee.changeEmpName("Samir");
		
		Employee e1=new Employee(11, "Priyanka");
		System.out.println(e1.empId);
		System.out.println(Employee.empName);
	}
}
