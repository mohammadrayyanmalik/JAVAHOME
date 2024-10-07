package StringExamples;
	import java.util.Scanner;
public class Example3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		String firstName="Mohammad";
//		String lastName="Qasim";
		
		
		System.out.println("Firstame");
		String fname=sc.next();
		System.out.println("LastNAme");
		String lname=sc.next();
		
		String email1=fname+lname+"@gmail.com";
		String email2=fname+"@gmail.co";
		String email3=fname+"_"+lname+"example.com";
		
		System.out.println(email1);
		System.out.println(email2);
		System.out.println(email3);
		
		sc.close();
		
//		 if(firstName.equals(fname) && lastName.equals(lname))
//		 {
//			 System.out.println("Correct name");
//		 }
//		 
//		 else 
//			 System.out.println("incorrect name");
		 
		 
	}
}
 