/*
// classes  means blueprint 
// class name always start with capital latter
// eg ClassName

// Syntex of class
	class ClassName
	{
	// variable 
	// methods
	}

// object means copy
*/

class Students
{
	// instance varible means variable only
	int rollNo;
	String name;
}


class p28
{
	public static void main(String[]args)
	{
// datatype	    object 
	Students	s1=new Students();
	
	s1.rollNO=101;
	s1.name="Rayyan";
	
	System.out.println(s1.rollNO);
	System.out.println(s1.name);
	
	}
}