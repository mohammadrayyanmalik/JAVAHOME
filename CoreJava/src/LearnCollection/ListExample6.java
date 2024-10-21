package LearnCollection;

import java.util.Stack;

public class ListExample6 {

	public static void main(String[] args) {
		
	Stack<Products> pro=new Stack<Products>();
//	product.push(new Products(101,"LAptop",111));
//	product.push(new Products(101,"LAptop",111));
//	product.push(new Products(101,"LAptop",111));
	
	Products p=new Products();
	p.setId(1);
	p.setName("samir");
	p.setPrice(100);
	pro.push(p);
	
	System.out.println(pro);
	
	
	
	
	
		
	}
}
