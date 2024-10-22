package LearnCollection;

import java.util.HashSet;
import java.util.Scanner;

public class SetExmaple2 {

	public static void main(String[] args) {
		
		HashSet<String> colors=new HashSet<String>();
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=1; i<=5; i++)
		{
			String c=sc.next();
			colors.add(c.toLowerCase());
			
			//System.out.println(c.toLowerCase());// WRONG way to write
		}
		
		System.out.println(colors);
		
	}
	
}
