
import java.util.Scanner;
class objects
{
	public static void main(String[]args)
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter surname");
		String surname=a.next();
		
		
		
		System.out.println("Enter Name");
		String fullname=a.nextLine();//ne when write nextLine
		
		System.out.println("Enter Age");
		int age=a.nextInt();
		
		
		System.out.println("My name is "+fullname+" and age is "+age+" and surname is "+surname);
	}
	
	
	
}
