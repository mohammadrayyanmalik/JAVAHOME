import java.util.*;
class forloops
{	
	
	public static void main(String[]args)
	{	
		Scanner sc=new Scanner(System.in);
	
		System.out.println("1 to 100 print only");
		
		
		for (int i=1; i<=100; i++)	
		{
			System.out.print(i+" ");
		}
	
	
	
	
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("100 to 10 print only");
		
		
		
		for(int i=100; i>=10; i--)
		{
			System.out.print(i+" ");
		}
		
		
		System.out.println();
		System.out.println();
		
		
		// for tables
		
		int n=sc.nextInt();
		for(int i=1; i<=10; i++)
		{
		System.out.print(i*n+" ");
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
	  // for sum of no
		
		int sum=0;
		for(int i=100; i>=10; i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
	}
}