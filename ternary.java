class ternaryoperator
{
	public static void main(String[]args)
	{
	int Rayyan=20;
	int Asrar=100;
	
	// ternaryoperator if true then out is first value before : otherwise second value that means after colon value
		// syntex of ternaryoperator is (statement?value1:value2)
	int biggervaue=Rayyan>Asrar?Rayyan:Asrar;
	System.out.println(Rayyan>Asrar?"Rayyan is greater":"Asrar is greater");
	System.out.println(Rayyan==20?Rayyan:Asrar);
	
	
	}

}