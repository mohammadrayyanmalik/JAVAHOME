import java.util.*;
class whileloops1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		// we could not write == only,<or> should write with =
		while (i<20)
		{
			System.out.println("hello "+i);
			i++;
		}
		
	}
}