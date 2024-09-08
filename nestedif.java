class nestedif
{
	public static void main(String[]args)
	{
		// if ke underr agar ek aur ifelse lagai to usko nested ifelse kahen ge
		int a=1000;
		int b=200;
		int c=30;
		
		if (a>b)
		{
			if (a>c)
			{
				System.out.println("a is gretest");
			}
			else 
			{	
				System.out.println("c is greatest");
			}
		}
		else
		{
			if (b>c)
			{
				System.out.println("b is gretest");
			}
			else
			{
				System.out.println("c is gretest");
			}
		}
		
		
		
	
	}
}