public class SavingsAccount extends BankAccount{
	
	private double annualInterestRate; // In percentage (%), converts to 0.05 decimal
	
	/** Constructor for Savings Account
	Initializes the account balance and the annual interest rate (in %)
	*/
	public SavingsAccount(double initialBalance, double interestRate){
		deposit(initialBalance);
		this.annualInterestRate = interestRate;
	}
	
	/** Default constructor for Savings Account
	Initializes the account balance to 0 and annual interest rate to 1.5%.
	*/
	public SavingsAccount(){
		deposit(0);
		this.annualInterestRate = 1.5;
	}
	
	/** Deposits monthly interest into the account balance using the annual interest rate.
	*/
	public void depositMonthlyInterest(){
		double currentBalance = getBalance();
		deposit(currentBalance*annualInterestRate/(100*12));
	}
	
	/** Sets the new annual interest rate (in %).
	@param newRate New annual interest rate (in %).
	*/
	public void setAnnualInterestRate(double newRate){
		annualInterestRate = newRate;
	}
	
	/** Gives the annual interest rate (in %).
	@return Annual interest rate (in %).
	*/
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public static void main(String[] args){
		SavingsAccount s = new SavingsAccount(1000, 1.5);
		s.deposit(1000);
		s.depositMonthlyInterest();
		System.out.println(s.getBalance());
	}
	
}

//javac -cp .;junit-4.12.jar;hamcrest-core-1.3.jar *.java
//java -cp .;junit-4.12.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore BankAccountTest
//java -cp .;junit-4.12.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore SavingsAccountTest