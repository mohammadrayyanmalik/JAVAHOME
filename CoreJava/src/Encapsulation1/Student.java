package Encapsulation1;

public class Student {
	
	private int id;
	private String name;
	private int salary;
	private int marks;
	private int fees;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Student(int id, String name, int salary, int marks, int fees) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.marks = marks;
		this.fees = fees;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return this.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
