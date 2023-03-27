package actionItems;

public class AddingNumbers {

	public static void main(String[] args) {
		
		  // add all the numbers from 5 to 15
		  
		  int sum = 0; 
		  for(int i = 5; i<=15; i++) { sum = sum + i; }
		  
		  System.out.println("The ressult is : " + sum);
		 
		
		int sum1 = 0; 
		int i = 0;
		while (i<=15)
		{
			sum1 = sum1 + i;
			i++;
		}
		System.out.println("The ressult is : " + sum1);		
		
	}

}
