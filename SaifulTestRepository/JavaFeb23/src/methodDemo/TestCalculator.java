package methodDemo;

public class TestCalculator {

	public void dogSound() {
		sound();
		System.out.println("I can also make dog sound");
	}
	
	public static void main(String[] args) {

		Calculator calc = new Calculator();
		System.out.println( calc.doAdd(23, 45));
		System.out.println( calc.doSub(23, 45));
		
		System.out.println(calc.concatStr("Hello,",	"I am learing Java!! It's fun !!"));
		
		TestCalculator obj = new TestCalculator();
		System.out.println(obj.doMul(54, 95));
		System.out.println(doDiv(34, 7));
		//obj.sound();
		obj.dogSound();
		System.out.println(Calculator.do3Mul(4, 722, 67));
		
	}
	
	
	public int doMul(int a, int b) {		
		int c = a * b;
		System.out.println(" I am doing acition in doMul class");
		return c;		
	}
	
	public static double doDiv(int a, int b) {		
		double c = a/b;
		return c;		
	}
	
	public void sound() {
		System.out.println("Make some generic sound");
	}
	
	
	
}








