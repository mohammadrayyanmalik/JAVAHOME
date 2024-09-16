class typecasting
{
	public static void main(String[]args)
	{
		// jab bade datatype ko chote datatype me assign kiya jata hai java comiler machine automatic comile kar deta hai so it is called widening typecasting.
		// eg.
	int a=100;
	long b=a;
	
	System.out.println(b);
	
	
	// jab chote datatype ko bade datatype me assign kiya jata hai java comiler machine automatic comile nahi karta  hai  bulki usko manullay change karna padta hai so it is called narrowing typecasting.
	
	int c=10;
	byte d=(byte)c;
	System.out.println(d);
	
	
	// we can typecasting at the time of print like follow
	System.out.println((byte)d);
	
	
	System.out.println("========================================");
	
	
	// int to char
	// typecasting int to char we should used ascii code to find the value of alphabet
	
	int n=65;
	char ch=(char)n;
	
	System.out.println(ch);
	
	System.out.println("========================================");
	
	
	for ( int i=65; i<=(65+25); i++)
	{
		System.out.println((char)i);	
		
	}
	
	System.out.println("========================================");
	
	
	for (int i=97; i<=(97+25); i++ )
	{
	System.out.println((char)i);
		
	}
	
	
	}
}