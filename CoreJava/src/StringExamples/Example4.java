package StringExamples;

public class Example4 {
	public static void main(String[] args) {
		
		String s1=("Hello this is Rayyan from ifb i have done my diploma in pharmacy from the aristotle college of pharmacy karnataka");
		System.out.println(s1.length());
		
		char arr[]=s1.toCharArray();
		
		int count=0;
			for(char ch:arr)
			{
				if (ch=='o' || ch=='O'  || ch=='A'  || ch=='a'  || ch=='e' ||  ch=='E' || ch=='i' || ch=='I' || ch=='u' || ch=='U')
				{
					count++;
				}
			}
		System.out.println(count);
		
	}
}
