package LearnCollection;

import java.util.ArrayList;

public class ListExample3 {
	public static void main(String[] args) {
		
		ArrayList<Products> products=new ArrayList<Products>();
		
		products.add(new Products(101,"Samsung",100000));
		products.add(new Products(102,"google",300000));
		products.add(new Products(103,"Iphone",200000));
		
		System.out.println(products);
		
		System.out.println("=======================================================");
		
		for (Products p:products) 
		{
			System.out.println(p);
		}
		
		System.out.println("=======================================================");

		for (Products p:products)
		{
			if(p.getName().startsWith("S"))
			{
				System.out.println(p);
			}
		}
		
	}
}
