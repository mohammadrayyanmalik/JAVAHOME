package LearnCollection;

import java.util.ArrayList;

public class ListExample1 {
	public static void main(String[] args) {
		
		//agar hum ArrayList ka type nahi dete to by default uska type object hota hai

		//  for list used this

		ArrayList list=new ArrayList<>();
		list.add(12);
		list.add("Rayyan");
		System.out.println(list);
		
		// for single single value used this
		
		for (Object i:list)
		{
			System.out.println(i);
		}
		
	}
}
