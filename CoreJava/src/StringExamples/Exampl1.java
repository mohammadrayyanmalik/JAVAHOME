package StringExamples;

public class Exampl1 {
	public static void main(String[] args) {
		
//		1) By using String literal

		String a="hello";
		String b="hello";
		
		System.out.println(a==b);
		
		
// by new keywords
		String c=new String("Hello");
		String d=new String ("Hello");
		System.out.println(a==c);
		System.out.println(c==d);
		
	}
}
