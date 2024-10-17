package LearnCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LinkedList3 {

	public static void main(String[] args) {
		
		List<Integer> number=Arrays.asList(12,22,333,44,55,553);
		System.out.println(number);
		
		System.out.println("===============================================");
		
		Collections.sort(number);
		System.out.println(number);
		
		System.out.println(number.get(0));
		System.out.println(number.get(number.size()-1));
		
		System.out.println("===============================================");
		
		
		
		
		
		
		
	}
	
}
