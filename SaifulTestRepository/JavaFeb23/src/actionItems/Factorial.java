package actionItems;

/* 03.	Write a program that returns the factorial (!) of a 
 * given number using while loop. For example: 3! equals 3*2*1 = 6 
 * again 5! equals 5*4*3*2*1 = 120. 
 */

public class Factorial {

	public static void main(String[] args) {
		
		
		doFactorial(9);
		doFactorial(8);
		doFactorial(17);
		
	}
	
	public static void doFactorial(int number) {
		int i=1;
		long factorial = 1; 
		while (i<=number) {
			factorial *=i;
			i++;
		}
		System.out.printf("Factorial of %d = %d", number, factorial);
		System.out.println();
	
	}
	

}
