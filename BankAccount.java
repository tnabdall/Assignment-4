/** Represents an individuals bank account.
No parameters are needed to initialize an account.
@author Tarik Abdalla, Liko Salas, Richard Maclennan, Jane Obada, Vridhi Dubey
*/
public class BankAccount {

	/** Instance variables for balance and overdraftAmount.
	*/
	private double balance; // dollars
	private double overdraftAmount; //dollars
	private Customer cust;
	
	/* For testing trace code.
	public static void main(String[] args){
		Customer c1 = new Customer("Alison Brown", 123); 
		BankAccount b1 = new BankAccount(c1, 100.00);

		Customer c2 = b1.getCustomer(); 
		c2.setName("Charles Green"); 
		System.out.println(c1); 
		System.out.println(c2);

		Customer c3 = c1; 
		c3.setName("Eva White"); 
		System.out.println(b1.getCustomer()); 
		System.out.println(c3);
	}
	*/
	
	/** Constructor for BankAccount. Balance is 0.0. Overdraft limit is 100.0. Customer needs to be set.
	*/
	public BankAccount(){
		cust = new Customer();
		balance = 0.0;
		overdraftAmount = 100.0;
	}
	
	/** Constructor for BankAccount. Balance is 0.0. Overdraft limit is 100.0.
	@param newCust Customer to be set to bank account.
	*/
	public BankAccount(Customer newCust){
		cust = newCust;
		balance = 0.0;
		overdraftAmount = 100.0;
	}
	
	/** Constructor for BankAccount. Customer needs to be set. Overdraft limit is 100.0.
	@param newBalance Balance to be set into bank account in dollars.
	*/
	public BankAccount(double initialBalance){
		cust = new Customer();
		balance = initialBalance;
		overdraftAmount = 100.0;
	}

	/** Constructor for BankAccount. Overdraft limit is 100.0.
	@param newCust Customer to be set to bank account.
	@param newBalance Balance to be set into bank account in dollars.
	*/
	public BankAccount(Customer newCust, double newBalance){
		cust = newCust;
		balance = newBalance;
		overdraftAmount = 100.0;
	}

	
	/** Constructor for BankAccount
	@param newCust Customer to be set to bank account.
	@param newBalance Balance to be set into bank account in dollars.
	@param newOverdraft Overdraft limit to be set into bank account.
	*/
	public BankAccount(Customer newCust, double newBalance, double newOverdraft){
		cust = newCust;
		balance = newBalance;
		overdraftAmount = newOverdraft;
	}

	/** Method for depositing funds
	When someone deposits funds the value is added to the balance in the account.
	@param addMoney The add value is the amount deposited which will be added to balance in dollars. Must be positive.
	*/
	public void deposit(double addMoney) {
		if (addMoney < 0) {
			System.out.println("Cannot deposit a negative amount.");
		} else {
			balance += addMoney;
			System.out.println("Deposited: " + addMoney + ". The current balance is: " + balance + ".");
		}
	}

	/** Method for withdrawing funds
	If withdraw amount request will exceed the overdraft limit in the account then an error message is produced,
	else the amount is withdrawn from the balance.
	@param minusMoney The minus value is the amount withdrawn and subtracted from the balance in dollars. Must be positive.
	*/
	public void withdraw(double minusMoney) {
		if (minusMoney < 0) {
			System.out.println("Cannot withdraw a negative amount.");
		} else if ((balance + overdraftAmount) < minusMoney) { // Ensures we do not withdraw beyond the overdrafted limit.
			System.out.println("Cannot withdraw " + minusMoney + ". The current withdrawable amount is " + (balance + overdraftAmount) + "." );
		} else {
			balance -= minusMoney;
			System.out.println("Withdrawn: " + minusMoney + ". The current balance is: " + balance + ".");
		}
	}

	/** Method for getting the balance.
	@return balance The balance in the account in dollars.
	*/
	public double getBalance() {
		return balance;
	}

	/** Method to set the overDraftAmount
	If the balance is already less than what would be allowable for
	the new overdraft amount an error message is produced.
	Else the overdraftAmount is modified by the input overdraft.
	@param overdraft The overdraft limit to be set in dollars. Must be positive.
	*/
	public void setOverdraftAmount(double overdraft) {
		if (overdraft < 0) {
			System.out.println("Overdraft amount cannot be negative.");
		} else if ((balance + overdraft) < 0) { // Ensures we do not set the overdraft limit less than the overdrafted balance.
			System.out.println("Cannot set overdraft amount when balance is less than overdraft.");
		} else {
			overdraftAmount = overdraft;
		}
	}
	
	/** Method for getting the customer data.
	@return customer The Customer data object.
	*/
	public Customer getCustomer(){
		return cust;
	}
	
	/** Method for setting the customer data.
	@param newCustomer The Customer data object to be set.
	*/
	public void setCustomer(Customer newCustomer){
		cust = newCustomer;
	}
}
