// its similar to elseifladder something
// in if statement we can give boolean ( true and  false) but in switch we can give string and char.
// break key word agar value true hoti hai to direct case se bahar aane ke liye hum break ka use karte hai
// we can write break  in elseifladder but defult only for switch

import java.util.*;
class switch1
{	
	public static void main(String[]args)
	{
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1:Monday  2:Tuesday  3: Wednesday  4:Thursday  5: friday 6: Satarday  7:Sunday");
		
		int n=sc.nextInt();
		
		switch(n)
		{
			case 1:
				System.out.println("1 is monday");
			break;
			case 2:
				System.out.println("2 is Tuesday");
			break;
			case 3:
				System.out.println("3 is Wednesday");
			break;
			case 4:
				System.out.println("4 is Thursday");
			break;
			case 5:
				System.out.println("5 is friday");
			break;
			case 6:
				System.out.println("6 is satarday");
			break;
			case 7:
				System.out.println("7 is Sunday");
			break;
		}s
	
	}
}