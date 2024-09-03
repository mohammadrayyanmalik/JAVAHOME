import java.util.Scanner;
class ifstatement
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		if (n%2==0)
		{
			System.out.println(n+" no is even");
		}
		System.out.println(n+" no is odd");
	}
}