package StaticKeyWord;

public class Category1 {
	public static void main(String[] args) {
		
	Category c1= new Category(1,"sam");
	 System.out.println(c1.categoryId);
	 System.out.println(c1.categoryName);
	 
	 new Category();
	 
	 Category c2= new Category(1,"sam");
	
	 System.out.println(c2.categoryId);
	 System.out.println(c2.categoryName);
	}
}

