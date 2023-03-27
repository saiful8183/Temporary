package encapsulation;

public class Bank {
	
	
	int accontNumber = 12345678;
	private int pinNumber = 1234;
	private double balance = 150000;
	
	public void drawMoney(int acctNo, int pinNo, int amount) {
	
		if(acctNo == accontNumber && pinNo == pinNumber) {
			
			if(amount <= balance) {			
			balance = balance - amount;
			System.out.println("Amount withdrawn : "+ amount);
			} else {
				System.out.println("Insufficient balance");
			}			
		}else {			
			System.out.println("Invalid credentials");			
		}	
	}
	public void updatePin(int acconuntNo, int oldPin, int newPin) {
		
		if(acconuntNo == accontNumber && oldPin == pinNumber) {
			pinNumber = newPin; 
			System.out.println("Pin is updated.");
			
		}else {
			System.out.println("Invalid credentials!");
		}
		
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAccontNumber() {
		return accontNumber;
	}
		
	
	
	
	
	

}
