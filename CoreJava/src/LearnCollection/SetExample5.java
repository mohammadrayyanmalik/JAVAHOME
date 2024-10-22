package LearnCollection;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class SetExample5 {

	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(11,221,122,22);
		
			TreeSet<Integer> set=new TreeSet<Integer>(list);
		
			System.out.println(set);
			System.out.println(set.higher(11));// uske uper ki elements deta hai
			
			System.out.println(set.lower(221));// uske niche ka digit provide karta hai
			
			System.out.println("=============================================================");
			
			
			System.out.println(set.ceiling(100)); // pahle woh digit dhodta hai other wise uske uper ka digit de deta hai
			
			System.out.println(set.floor(101));	 // pahle woh digit dhodta hai other wise uske niche ka digit de deta hai
			
			System.out.println("===============================================================");
			
			System.out.println(set.headSet(221));  //uske aage ka sara provide karta hai usko chhodh kar
			
			System.out.println(set.headSet(11,true));//uske aage ka sara provide karta hai usko lekar kar
			
			System.out.println(set.tailSet(11));	 //uske peeche ka sara provide karta hai usko lekar kar
			System.out.println(set.tailSet(11,false));
			
	}
}
