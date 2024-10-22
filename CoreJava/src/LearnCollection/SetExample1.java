package LearnCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class SetExample1 {

	public static void main(String[] args) {
		
		HashSet<Integer> set=new HashSet<Integer>();
		
		set.add(11);
		set.add(20);
		set.add(11);
		set.add(21);
		set.add(10);
		set.add(20);
		System.out.println(set);
		
		System.out.println("=========================================================");
		
		List<Integer> list=Arrays.asList(11,22,33,44,11);
		
		HashSet<Integer> sets=new HashSet<Integer>(list);
		System.out.println(list);
		System.out.println(sets);
		
		
	}
	
}
