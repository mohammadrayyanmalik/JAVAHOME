package LearnCollection;

import java.util.PriorityQueue;

public class QueueExample2 {
	
	public static void main(String[] args) {
	
	PriorityQueue<Products> products=new PriorityQueue<Products>((o1,o2)->o1.getPrice()-o2.getPrice());
	
	products.add(new Products(101,"Laptpo",20000));
	products.add(new Products(103,"watch",10000));
	products.add(new Products(102,"Mobile",30000));
	System.out.println(products);
	
	System.out.println(products.poll());
	System.out.println(products);
	System.out.println(products.peek());
	System.out.println(products);
	
}
}
