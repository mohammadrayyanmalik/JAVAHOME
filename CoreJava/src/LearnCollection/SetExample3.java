package LearnCollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetExample3 {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();

		set.add(11);
		set.add(11);
		set.add(13);
		set.add(12);
		set.add(112);
		
		System.out.println(set.size());
		System.out.println("--------------------------------------------------------------------");
		
		Iterator<Integer> iterator=set.iterator();
		
		System.out.println(iterator.next());
		
		while (iterator.hasNext()) {
				System.out.println(iterator.next()); 
			
		}
		
	}
}
