package Abstraction;

public interface Bank {
	void detials();
	void address();
	
	default void sum(int a)
	{
		System.out.println(a+a);
	}
	
	static void staticMethod()
	{
		System.out.println("Static mathod");
	}
}
