import java.util.Scanner;
class elseifladder2
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 no.");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	
	System.out.println("a:Add   b:Substraction    c: Multiplication   4:Division   ");
	 int dicision=sc.nextInt();
	 
	 if (dicision==1)
	 {
		 System.out.println(n1+n2);
	 }
	 if (dicision==2)
	 {
		 System.out.println(n1-n2);
	 }
	  if (dicision==3)
	  {
		  System.out.println(n1*n2);
	  }
	  if (dicision==4)
		  
	  {
	  System.out.println(n1/n2);
	  }
	
	
	}
}