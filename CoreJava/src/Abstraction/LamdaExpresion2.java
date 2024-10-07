package Abstraction;
@FunctionalInterface

	interface Test1
	{
		void printName(String name);
	}

	interface Test2
	{
		int add(int a, int b);
	}


public class LamdaExpresion2 {
		public static void main(String[] args) {
			Test1 t1=(name)-> System.out.println(name);
			t1.printName("Rayyan");
			
//			for (int i=1; i<=100; i++)
//			{
//				t1.printName("Samir");
//			}
			
		Test2 t2=(a,b)->a+b; 
		
		System.out.println(t2.add(11, 11));
			
			
		}
}
