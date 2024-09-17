class sm_bg_Array
{
	public static void main(String[]args)
	{
		int numbers[]={12,21,23,324,212,232,121};
		
		int smallest=numbers[0];
		int biggest=numbers[numbers.length-1];
		
		for (int n:numbers)
		{	if (smallest>n)
				smallest=n;
			
			if (biggest<n)
				biggest=n;
		}
		System.out.println(smallest);
		System.out.println(biggest);
		
		System.out.println(numbers.length);
		
		
	}
}