package LearnCollection;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class ColloectionProject {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		TreeSet<Products> products=new TreeSet<Products>((p1,p2)-> p1.getId()-p2.getId());
		
		
		
		
		products.add(new Products(101,"Car",1000));
		products.add(new Products(101,"Cupset",1000));
		products.add(new Products(101,"Jug",1000));
		products.add(new Products(101,"Table",1000));
		
		
		
		System.out.println("Enter number :");
		int n=sc.nextInt();
		
		
			
	
		
		 switch (n) {
		case 1: {
			char ch=sc.next().charAt(0);
			if (ch=='a')
			{
				 
				TreeSet<Products> product=new TreeSet<Products>((p1,p2)-> p1.getId()-p2.getId());
				System.out.println(products);
			}
			else if(ch=='b')
			{
				TreeSet<Products> product=new TreeSet<Products>((p1,p2)-> p2.getId()-p1.getId());
			}
			
			
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}
		
		
		
		
		
	}
	
}
