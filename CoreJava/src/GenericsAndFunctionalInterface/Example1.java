package GenericsAndFunctionalInterface;

import java.util.function.Consumer;

public class Example1 {
	public static void main(String[] args) {
		
		Consumer<Integer> tables=new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				for (int i=1; i<=10; i++)
				{
					
					System.out.println(t*i);
				}
			}
			
			
		};
		
		tables.accept(13);
		
	}
}
