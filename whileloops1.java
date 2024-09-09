import java.util.*;
class whileloops1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int digitcount=0;
		
		// we could not write == only,<or> should write with =
		System.out.println("just for print no of time ");
		while (i<200)
		{
			System.out.println("hello "+i);
			i++;
		}
		while (i!=0)
		{
			i=i/10;
			digitcount++;

		}
			System.out.println(digitcount);
	
	}
}