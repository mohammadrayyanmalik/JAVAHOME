package Abstraction;

public class bankMainClass {
	 public static void main(String[] args) {
		 
		 Bank s1=new HDFC();
		 s1.address();
		 s1.detials();
		 
		 s1.sum(11);
		 Bank.staticMethod();
			System.out.println("======================================================="); 
			HDFC h1=new HDFC();
			h1.address();
			h1.detials();
			
			
			
		 
		System.out.println("======================================================="); 
		
		Bank axis=new Bank() {
			public void detials()
			{
				System.out.println("axis bank detials");
			}
			
			public void address()
			{
				System.out.println("axis bank address");
			}
		};
		
		axis.address();
	}
}
