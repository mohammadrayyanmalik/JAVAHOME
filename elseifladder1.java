import java.util.*;
class elseifladder1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Marathi    2:English     3:Arabic    4:Hindi     5:Urdu");
		int n=sc.nextInt();
		if (n==1)
		{
			System.out.println("Selected language is Marathi");
		}
		else if (n==2)
		{
			System.out.println("Selected language is English");
		}
		else if (n==3)
		{
			System.out.println("Selected language is Arabic");
		}else if (n==4)
		{
			System.out.println("Selected language is Hindi");
		}else if (n==5)
		{
			System.out.println("Selected language is Urdu");
		}
		else
		{
			System.out.println("Invalid input");
		}
		
	}
}