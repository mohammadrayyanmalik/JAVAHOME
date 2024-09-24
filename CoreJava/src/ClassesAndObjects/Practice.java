package ClassesAndObjects;

public class Practice {
	
	
	
	boolean isEven(int number)
	{
		return (number%2==0);

	}
	
	
	
	public static void main(String[] args) {
		Practice p1=new Practice();	
		int number=101;
		if (p1.isEven(number))
		{
			System.out.println(number+" no is even");
		}
		else
		{
			System.out.println(number+" no is odd");
		}
		
	}
	
}
