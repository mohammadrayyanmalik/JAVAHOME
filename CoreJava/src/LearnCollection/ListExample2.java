package LearnCollection;

import java.util.ArrayList;

public class ListExample2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(128);
		list1.add(11);
		list1.add(90);
		list1.add(43);
		
		System.out.println(list1);
		System.out.println(list1.size());
		
		
		System.out.println("=======================================");
		
		for(int i:list1)
		{
			System.out.println(i);
		}
		
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("=======================================");

		
		list1.remove(list1.size()-1);
		System.out.println(list1);
		
		System.out.println("=======================================");

		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(122);
		
		
		list1.addAll(list);
		System.out.println(list1);
		
		System.out.println("=======================================");
		
		list1.removeAll(list);
		System.out.println(list1);
		
		System.out.println("=======================================");
		
		list1.clear();
		System.out.println(list1);

		
	}
	
}
