package StaticKeyWord;

public class Category {
	int categoryId;
	String categoryName;
	
	
	Category()
	{
		System.out.println("this is non parametarized constructor");
	}
	
	Category (int categoryId,String categoryName)
	{
		
		this.categoryId=categoryId;
		this.categoryName=categoryName;
	}
	
}
