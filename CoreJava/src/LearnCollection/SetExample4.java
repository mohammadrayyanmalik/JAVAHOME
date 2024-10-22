package LearnCollection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class SetExample4 {

	public static void main(String[] args) {
		
		
	List<Integer> set=Arrays.asList(11,33,33,2,332);
	

	
	

//			Comparator<Integer> c=(o1,o2)->o1-o2; 
			
			//{
//		
//		@Override
//		public int compare(Integer o1, Integer o2) {
//			// TODO Auto-generated method stub
//			return o1-o2;
//		}
//	};
		
	TreeSet<Integer> treeset=new TreeSet<Integer>(set);	
		
		System.out.println(treeset);
		
	}
	
	
}
