package GenericsAndFunctionalInterface;

import java.util.function.Consumer;

import Encapsulation1.Student;

public class Example2 {
	
	public static void main(String[] args) {
		
		Consumer<Student> grade=new Consumer<Student>() {

			@Override
			public void accept(Student t) {
				// TODO Auto-generated method stub
				
				if(t.getMarks() > 90)
				{
					System.out.println("Grade A");
				}
				else if (t.getMarks()>60)
				System.out.println("Grade B");
				
				else if (t.getMarks()>40)
					System.out.println("Grade c");
				
				else if (t.getMarks()>0)
					System.out.println("fail");
				
				else 
				System.out.println("invalid marks");
			}
			
		};
		
		Student student=new Student(1,"Rayyan",10000,44,2000);
		grade.accept(student);
		
	}
}
