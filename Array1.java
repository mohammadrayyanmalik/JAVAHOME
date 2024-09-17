import java.util.*;
class Array1
{
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	 int numbers[]=new int [3];
	numbers[0]=10;
	numbers[1]=10;
	numbers[2]=30;
	
	System.out.println(numbers[1]);
	
	System.out.println("========================================");
	/*
	int n[]=new int [5];
	
	for (int i=0; i<=4; i++)
	{
		n[i]=sc.nextInt();
	}
		System.out.println("=====================================");
	
	for (int i=0; i<5; i++)
	{
		System.out.println(n[i]);
		
	}
	
		System.out.println("=====================================");*/
		sc.nextLine();

	
	String names[]=new String[5];
	for (int i=0; i<=4; i++)
	{
		names[i]=sc.nextLine();
		
	}
	/*
	names[0]="Rayyan";
	names[1]="Faizan";
	names[2]="Aziz";
	names[3]="Salim";
	names[4]="Asrar";*/
	
	for (int i=0; i<=4; i++)
	{
		System.out.println(names[i]);
	}
		
	
	}
}