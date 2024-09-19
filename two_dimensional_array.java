class two_dimensional_array
{
	public static void main(String[]args)
	{
	int numbers[][]={{1,3,10},{3,4,8}};
	
	for (int number[]:numbers)
	{
		for(int n:number)
		{
			if (n%2==0)
			{
				System.out.print(n+": is a even no ");
			}
			
			else 
			{
			System.out.print(n+" is a odd no");
			}
		}
			System.out.println();
	}
		
		System.out.println("===========================");
		
		int sum=0;
		for (int i=0; i<numbers.length; i++)
		{
			System.out.println();
			sum=0;
			for (int j=0; j<numbers[i].length; j++)
			{
				sum=(sum+(numbers[i][j]));
				
			}
			System.out.println();
			System.out.println(sum);
			
		}
			
		
	
	
	}
}