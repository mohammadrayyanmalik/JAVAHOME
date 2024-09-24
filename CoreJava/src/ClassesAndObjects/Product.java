package ClassesAndObjects;

class Product {
	int productId;
	String productName;
	String productType;
	
	
	void setProductdetials(int productId,String productName)
	{
		this.productId=productId;
		this.productName=productName;
	
	}
	
	
	
	
	public static void main(String[] args) {
		Product p1=new Product();
		p1.setProductdetials(1,"Samir");
		for (int i=1; i<=100; i++)
		{
		
			System.out.println(p1.productName);
			System.out.println(i);
		}
		
		
	}
}


