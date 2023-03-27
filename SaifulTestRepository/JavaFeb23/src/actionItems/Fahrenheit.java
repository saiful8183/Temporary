package actionItems;

public class Fahrenheit {
	
	/* 08.	Write a method that accepts Celsius temperature as argument. 
	 * The method should return Fahrenheit temperature after 
	 * converting Celsius into Fahrenheit. 
		[Formula F=(C x 9/5) + 32]  
	 */

	public static void main(String[] args) {

			System.out.println("Fahrenheit temperature is: " 
			+ convertCelsius(30));

	}
	
	public static double convertCelsius(double celsius) {
		
		double fahrenheit = (celsius * 9/5) + 32; 
		return fahrenheit; 		
	}

}
