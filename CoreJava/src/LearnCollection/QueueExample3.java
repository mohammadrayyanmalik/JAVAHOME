package LearnCollection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class QueueExample3 {

	public static void main(String[] args) {
		
		
		List<Integer> list=new LinkedList<Integer>();
		
		list.addLast(122);
		
		for(int i=1; i<=10;i++)
		{
			list.add(i);
		}
		list.addLast(100);
		System.out.println(list);
		
		
		System.out.println("=================================================");
		
		
		list.addFirst(200);
		System.out.println(list);
		
		System.out.println("=================================================");
		
		list.removeFirst();
		System.out.println(list);
		
		System.out.println("=================================================");
		
		list.removeLast();
		System.out.println(list);
		
		System.out.println("=================================================");
		
		
		System.out.println(list.get(3));
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		
		
		
	}
	
}
