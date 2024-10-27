package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample2 {

	
	public static void main(String[] args) {
		
		List<String> name=Arrays.asList("Rayyan","Qasim","Hayatullah");
		Stream<String> StreamName=name.stream();
		
		StreamName.forEach((names)->{
			for(int i=1; i<=10; i++)
			{
				System.out.println(names);
			}
			System.out.println("========================");
		});
		
		
		
		
		System.out.println();
	}
}
