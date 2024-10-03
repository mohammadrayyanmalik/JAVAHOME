package Abstraction;

public class ABCMainClass {
	public static void main(String[] args) {
		C c=new C();
		c.add(11, 11);
		int ans=c.square(12);
		System.out.println(ans);
		
		c.subs(12, 11);
		
		
		System.out.println("============================================================");
		
		A.staticMethod();
		
	}
}
