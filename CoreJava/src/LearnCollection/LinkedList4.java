package LearnCollection;

import java.util.LinkedList;

public class LinkedList4 {
	
	public static void main(String[] args) {
		
		LinkedList<Products> products=new LinkedList<Products>();
		
		products.add(new Products(101,"Samsung",100000));
		products.add(new Products(102,"google",300000));
		products.add(new Products(10,"Iphone",200000));
		
		 System.out.println(products);
		
	}
	
}
