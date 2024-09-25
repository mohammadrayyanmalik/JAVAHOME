package Inheritence;

class A
{
	int add(int a,int b)
	{
		return a+b;
	}
	
	A()
	{
		System.out.println("it's non parametarized constructor");
	}
	
	A(String value)
	{
		System.out.println("its parametarized costructor "+value);
	}
}

class B extends A
{
	int subs(int a,int b)
	{
		return a-b;
	}
	
	B()
	{
		System.out.println("it's non parametarized constructor");
	}
	
	B(String value)
	{
		super("World");
		System.out.println("its parametarized costructor "+value);
	}
	

}


public class SingleInheritence {

	public static void main(String[] args) {
		B obj=new B("hello");
		
		
		System.out.println("====================================================================");
		int sum=obj.add(100, 11);
		System.out.println(sum);
		
		System.out.println("subs is :"+obj.subs(100, 101));
		
		
		
	}
}


//inheritence is used to borrow of another class property
//1) single inheritence means one parents one child
//	clas_b extendes <class_a>
//void type ke object  ko hum sysout me nahi likh sakte 
//agar hum child ka object banain ge to parent ka bhi constructor call hoga
//in case of parametarized and non parametarized constructor when we create child object then it called parent object also
//child ke constroctor ke through kuch parent ke constructor ko value deni ho to hum "Super " keyword ka use karenge