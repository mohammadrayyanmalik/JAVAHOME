package LearnCollection;

import java.util.LinkedList;

public class LikedList2 {

	public static void main(String[] args) {
		
		LinkedList<String> name=new LinkedList<String>();
		name.add("Rayyan");
		name.add("Samir");
		name.add("Qasim");
		
		name.add("Abrar");
		
//		name.removeIf(names->names.startsWith("A"));
	System.out.println(name);
		
		System.out.println("=====================================================");
		
		for(String n:name)
		{
			if(n.startsWith("A"))
			{
				System.out.println(n);
			}
		}
		
		System.out.println("===============================================");
		
		
		LinkedList<Products> products=new LinkedList<Products>();
		
		products.add(new Products(101,"Laptop",10000));
		products.add(new Products(102,"iphone",20000));
		products.add(new Products(103,"Mobile",30000));
		
		System.out.println(products);
		
		products.removeIf((price)-> price.getPrice()<20000);
		System.out.println(products);
				
		
		
	}
	
}
