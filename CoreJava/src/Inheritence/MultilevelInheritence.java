package Inheritence;

public class MultilevelInheritence {
		public static void main(String[] args) {
			
			Person p1=new Person(11,"Rayyan");
			System.out.println(p1.id);
			System.out.println(p1.name);
			
			
			System.out.println("=====================================================================");
			
			SchoolPassOutPerson SPOP=new SchoolPassOutPerson(12,"samir","sch123");
			System.out.println(SPOP.name);
			
			
			
			System.out.println("=====================================================================");

			CollegePassOutPerson CPOP=new CollegePassOutPerson(101,"ahmad","sch111","cpl111");
			System.out.println(CPOP.collegeCertificateNo);
			
			
			
			
			
		}
}
