package LearnCollection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample1 {

	
	public static void main(String[] args) {
		
		
		Comparator<Integer> comparator=(o1,o2)->o1-o2;
		PriorityQueue<Integer> number=new PriorityQueue<Integer>(comparator);
		
		Iterator<Integer> iteretor=number.iterator();
		for(int i=1;i<=10;i++)
		{
			number.add(i);
		}
		
		System.out.println(number);
		System.out.println(number.poll());
		System.out.println(number);
		
		
		
	}
	
}
