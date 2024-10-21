package LearnCollection;

import java.util.Stack;

public class ListExample5 {

	public static void main(String[] args) {
		
		Stack<Integer> list=new Stack<Integer>();
		list.push(11);
		list.push(12);
		list.push(13);
		
		System.out.println(list);
		System.out.println("================================");
		
		System.out.println(list.search(11));
		
		System.out.println("=======================================");
		System.out.println(list.pop());
	
		System.out.println(list);
		
		
		System.out.println("=======================================");
		System.out.println(list.peek());
		
		
		System.out.println("=======================================");
		// return bollean
		System.out.println(list.empty());
		
		
		
		
		
	}
	
}
