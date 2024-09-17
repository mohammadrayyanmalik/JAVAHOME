class itterate_Array
{
	public static void main(String[]args)
	{
		String language[]={"hindi","english","Arabic","Marathi","bhojpuri"};
		
		for(String lang:language)
		{
			System.out.println(lang);
		}
		char ch[]={'a','d','w','e','a','o'};
		int vowel=0;
		int consonent=0;
		
		for (char c:ch)
		{
			if (c=='a'|| c=='e'|| c=='i' || c=='o' || c=='u')
				vowel++;
			else 
				consonent++;
		}
		
		System.out.println("vowel count is:"+vowel);
		System.out.println("consonent count is:"+consonent);
		
	}
}