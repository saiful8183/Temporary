package inheritance;

public class Test implements InterfaceDemo{

	public static void main(String[] args) {
//		Test obj = new Test();
//		obj.makeSound();

		ConstructorDemo obj1 = new ConstructorDemo("Masud", 1);

		System.out.println(obj1.name);
		System.out.println(obj1.rollNo);	
		
	}

	public void makeSound() {
		System.out.println("Please sing a sweet song");
	}

}
