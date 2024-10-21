package LearnCollection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExample4And5 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(23);
		list.add(11);
		list.add(30);
		list.add(40);
		
		
		// extra 
		List<Integer> L=Arrays.asList(11,22,33,44);
		 Iterator<Integer> i=L.iterator();
		 
//		 System.out.println(i.next());
		 
		 System.out.println("======================================================================");
		 
		 
		
		
		Iterator<Integer> integer=list.iterator();
		
		System.out.println(integer.next());
		
		 System.out.println("======================================================================");
		 
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
			 
		 }
		 
		 while(integer.hasNext())
		 {
			 System.out.println(integer.next());
		 }
		
		
	}
	
}
//agar iterate karte karte remove ya add karna hai to hum collection iterate method ko used karenge
//has next method check karti hai ki next elemenent present hai ya nnhi jab tak true mile ga tab ta