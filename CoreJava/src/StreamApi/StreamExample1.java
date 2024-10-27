package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample1 {

	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=1; i<=10; i++)
		{
			list.add(i);
		}
		System.out.println(list);
		
		System.out.println("============================================");
		
		Stream<Integer> stream=list.stream();
		
		stream.forEach((i)->System.out.println(i));
		
		System.out.println("===========================================================");
		
		List<String> names=Arrays.asList("Samir","Qasim","Mujibullah","Rayyan");
		
		Stream<String> name=names.stream();
		
		Consumer<String> consumer=(j)->System.out.println(j);
		
		names.forEach((n)->System.out.println(n+" "+n.length()));
	}
}
