class prime_no_nestedloops
{
	public static void main(String[]args)
	{
		int n=0;
		int prime_no_count=0;
		for(n=1; n<=54; n++)
		{
	int count=0;
	for (int i=1; i<=n; i++)
	{
		if (n%i==0)
		{
		count++;
		}
		
		
	}
	
		if (count==2)
		{
		System.out.print(n+" ");
		prime_no_count++;
		}
		
		
		}
		System.out.println();
		
			System.out.println(prime_no_count);
	}
	
}