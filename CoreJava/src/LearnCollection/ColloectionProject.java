package LearnCollection;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class ColloectionProject {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
//		TreeSet<Products> products=new TreeSet<Products>((p1,p2)-> p1.getId()-p2.getId());
		TreeSet<Products> products = new TreeSet<Products>((p1,p2)->p1.getId()-p2.getId());
		
		
		
		
		products.add(new Products(101,"Car",929000));
		products.add(new Products(102,"Cupset",34000));
		products.add(new Products(105,"Jug",61000));
		products.add(new Products(104,"Table",23000));
		
		
		
		
		System.out.println("Enter number :");
		int n=sc.nextInt();
		
		
			
	
		
		 switch (n) {
		case 1: {
			
			System.out.println("a for Asc and b for Desc");
			char ch=sc.next().charAt(0);
			if (ch=='a')
			{
				 
				TreeSet<Products> product=new TreeSet<Products>((p1,p2)-> p1.getId()-p2.getId());
				System.out.println(products);
			}
			
			else if(ch=='b')
			{
				TreeSet<Products> product=new TreeSet<Products>((p1,p2)-> p2.getId()-p1.getId());
				System.out.println(products);
			}
			else 
			{
				System.out.println("invlaid entry");
			}
			
		}
		break;	
		
		case 2:
		{
			System.out.println("a for asc b for desc");
			
			char ch=sc.next().charAt(0);
			if(ch=='a')
			{
				TreeSet<Products> pro=new TreeSet<Products>();
			}
			
			
		}
			
			
		
		
		default:
			
			throw new IllegalArgumentException("Unexpected value: " + n);
		}
		
		
		
		
		
	}
	
}
