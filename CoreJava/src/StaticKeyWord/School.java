package StaticKeyWord;

public class School {
	static int count=0;
	
	 School () 
	{
		count++;
		System.out.println(count);
	}
	
	
//	int schoolId;
//	String schoolName;
//	static String director;
//	
//	School(int schoolId,String schoolName)
//	{
//		this.schoolId=schoolId;
//		this.schoolName=schoolName;
//	}
//	
//
//	
	 public static void main(String[] args) {
//		School.director="priyanka";
//		
//		School s1=new School(101,"xyz");
//		System.out.println(s1.schoolId);
//		System.out.println(School.director);
//	
		 for (int i=1; i<=100; i++)
		 {
			 new School();
		 }
		 
		 
	 }
}
