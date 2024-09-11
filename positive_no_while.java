import java.util.*;
class positive_no_while
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		
		while(n>=0)
		{
			n=sc.nextInt();
			count++;
		}
		
		System.out.println(count);
	}
}