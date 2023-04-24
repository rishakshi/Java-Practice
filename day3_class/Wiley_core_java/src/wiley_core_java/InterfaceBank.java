package wiley_core_java;

interface Bank {
	void account();
}

interface Bank1 {
	void account();
}

interface ATM extends Bank, Bank1 {
	void insertCard();
	void selectOption();
	void enterPassword();
}

interface AA {
	void m1();
}

abstract class newATM implements AA, ATM {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void account() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceBank extends newATM{

	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("Insert the card");
		
	}

	@Override
	public void selectOption() {
		// TODO Auto-generated method stub
		System.out.println("Select option");
		
	}

	@Override
	public void enterPassword() {
		// TODO Auto-generated method stub
		System.out.println("Enter the password");
		
	}
	
	public static void main(String[] args) {
		
	}

}
