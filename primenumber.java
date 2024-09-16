class primenumber
{
	public static void main(String[]args)
	{
	int n=13;
	int count=0;
	for (int i=1; i<=n; i++)
	{
		if (n%i==0)
		{
		System.out.println(i);
		count++;
		}
		
		
	}
		System.out.println(count);
	
		if (count==2)
		{
		System.out.println(n+" no is prime");
		}
		else 
		{
		System.out.println(n+" no is not prime");
			
		}
	}
	
}