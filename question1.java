
import java.util.Scanner;
class question1
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	
	/*
	int i=1;
	while(i<=10)
	{
		if (i>=0){
		
		System.out.println(i);
		i++;
		}
	}*/
	int count=0;
	for(int i=1; i<=5; i++)
	{
			int n=sc.nextInt();
		
		if (n%7==0)
		{
			count++;
		}
	}
		System.out.println(count);
	
	}
}