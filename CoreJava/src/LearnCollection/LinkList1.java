package LearnCollection;

import java.util.LinkedList;
import java.util.function.Predicate;

public class LinkList1 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		// add method only provide value
		list.add(122);
		list.add(110);
		list.add(102);
		list.add(13);
		list.add(14);
		
		System.out.println(list);
		
		System.out.println("==============================================");
		
		// add method with index 
		list.add(2, 2222);
		System.out.println(list);
		
		System.out.println("==============================================");
		
		// get method is used to search specific index element
		list.get(1);
		System.out.println(list.get(1));
		
		
		System.out.println("==============================================");
		
		// set method is used to set ne value on specific place
		list.set(0, 333);
		System.out.println(list);
		list.add(1,331);
		list.add(0, 241);
		
		
		
		System.out.println("==============================================");
		
		Predicate<Integer> even=(num)->num%2==0;
		list.removeIf(even);
		System.out.println(list);
		
//		list.removeIf((num)->num%2==1);
//		System.out.println(list);
		
		
		
		
		
	}
	
}
