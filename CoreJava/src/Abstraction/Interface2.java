package Abstraction;

public class Interface2 implements Interface1{
	public void display()
	{
		System.out.println("over riding methods of class A");
	}
	
	public void square(int n)
	{
		System.out.println(n*n);
	}
	
	public int number(int a)
	{
		return a;
	}
	
	
}
