// 03-09-2024////////////////////////////////////////////////////////////////////////////

// conditional statement 
 // dicicion control statement also called
 // syntex of if 
 // if (expresion which give true or false){}
 // example of if ,
 // if condition true then statement exicute otherwise not example
 /*import java.util.*;
 class ifstatement
 {
	 public static void main(String[]args)
	 {
		Scanner sc=new Scanner(System.in);
		// hum direct object me input nahi daal sakte hain isiliye varible declare karte hain with datatype jis type ka input hume chahiye
		
		boolean subscribed=false;
		
		System.out.println("Do you want to subscribe?? Y/N");
		char desicion=sc.next().charAt(0);
		
		if (desicion=='Y' || desicion=='y')
		{
			subscribed=true;
			
		}
		 System.out.println("Subscribed:"+subscribed);
	 }
 }*/
 
 import java.util.*;
 class ifstatement
 {
	 public static void main(String[]args)
	 {
		Scanner sc=new Scanner(System.in);
		boolean subscribed;
		 
		 System.out.println("Do you want to subscrinbed??  Y/N");
		 char decision=sc.next().charAt(0);
		 
		 if (decision=='Y'  ||  decision=='y')
		 {
			 subscribed=true;
			 System.out.println("it can be subscribed.");
		 }
		 else
		 {
			 subscribed=false;
			 System.out.println("it can't be subscribes.");;;
		 }
		 		 System.out.println("subscribed:"+subscribed);
	 }
 }