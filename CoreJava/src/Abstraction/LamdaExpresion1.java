package Abstraction;
	
@FunctionalInterface
interface Test
	{
		boolean isEven(int n);
		
	}



public class LamdaExpresion1 {
	public static void main(String[] args) {
//		
//		Test t1=new Test() {
//			public boolean isEven(int n) 
//			{
//				return n%2==0;
//			}
//		};
//		 boolean t2=t1.isEven(12);
//		System.out.println(t2);
//		System.out.println(t1.isEven(12));
//		
		Test t=(n)->n%2==0;
		boolean ans=t.isEven(11);
		System.out.println(ans);
		
		
		
	}
}
