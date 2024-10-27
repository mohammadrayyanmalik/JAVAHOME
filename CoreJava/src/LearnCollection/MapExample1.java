package LearnCollection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class MapExample1 {
		public static void main(String[] args) {
			
	
			HashMap<Integer, String>	students=new HashMap<Integer, String>();
			
			students.put(101, "Rayyan");
			students.put(106, "Qasim");
			students.put(105, "Razia");
			students.put(104, "shaheen");
			students.put(103, "Faizan");
			students.put(102, "Asim");
			
			System.out.println(students);
			
			 System.out.println(students.get(101));
			 
			 System.out.println(students.getOrDefault(1022, "Hamid"));
			 
			 
			 System.out.println("===========================================================");
			 
			 students.remove(101);
			 System.out.println(students);
			 
			 
			 System.out.println("===========================================================");
			 
			 
			 
			 System.out.println(students.keySet());

			 System.out.println();
//			 System.out.println(students.values());
			 
			 System.out.println("===========================================================");
			 

			 for(Integer k:students.keySet())
			 {
				 System.out.println(k+" "+students.get(k));
			 }

			 System.out.println("===========================================================");
			 
			 System.out.println(students.containsKey(102));
			 
			 System.out.println(students.containsValue("Qasim"));
			
		}
}
