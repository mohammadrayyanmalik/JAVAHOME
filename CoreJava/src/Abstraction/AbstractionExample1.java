package Abstraction;
	abstract class Electronics
	{
		abstract void start();
	}
	
	class TV  extends Electronics
	{
		void start()
		{
			System.out.println("Tv on");
		}
	}
	
	
	class AC extends Electronics 
	{
		void start()
		{
			System.out.println("AC on");
		}
	}





public class AbstractionExample1 {
	public static void main(String[] args) {
		new TV().start();
		new AC().start();
		
		Electronics e1=new Electronics()
		{
			void start()
			{
				System.out.println("hello electrics abstract obj");
			}
		};
		
		e1.start();
		
		
	}
}
