package entities;

public class Holder {

	private static int number;
	private static String holder;
	private static double balance;
	private static double initialDeposit;
    
	public Holder(int number2, String holder2, double initialDeposit2) {

	}

	public Holder(int number2, String holder2) {
		// TODO Auto-generated constructor stub
	}

	public void accountHolder() {
	}
	
	public void accountHolder(int number, String holder) {
		Holder.number = number;
		Holder.holder = holder;
	}

	public void accountHolder(int number, String holder, double initialDeposit) {
		Holder.number = number;
		Holder.holder = holder;
		deposit(initialDeposit);

	}

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		Holder.number = number;
	}

	public static String getHolder() {
		return holder;
	}

	public static void setHolder(String holder) {
		Holder.holder = holder;
	}

	public static double getBalance() {
		return balance;
	}

	public static double getInitialDeposit() {
		return initialDeposit;
	}

	public static double setInitialDeposit(double initialDeposit) {
		balance += initialDeposit;
		return balance;
	}

	public static void deposit(double theAmount) {
		balance += theAmount;
	}

	public static void withdrawal(double theAmount) {
		balance -= theAmount + 5.00;
	}

	public String toString() {
		return "Checking account: " 
	           + number 
	           + "\n" 
	           + "Current account holder: " 
	           + holder + "\n"
			   + "Current account balance: R$ " 
	           + String.format("%.2f\n ", balance);
	}

}
