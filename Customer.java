/** Represents a customer in the bank.
Each customer has a name and ID.
@author Tarik Abdalla, Liko Salas, Richard Maclennan, Jane Obada, Vridhi Dubey
*/
public class Customer{
	private String name;
	private int customerID;
	
	/** Default constructor. Sets name to "No name yet" and ID to -1.
	*/
	public Customer( ){
		this.name = "No name yet";
		this.customerID = 0;
	}
	
	/** Initializes customer with name and ID.
	@param newName The new name for the customer.
	@param newID The new ID number for the customer.
	*/
	public Customer(String newName, int newID){
		this.name = newName;
		this.customerID = newID;
	}
	
	/** Initializes customer with name.
	@param newName The new name for the customer.
	*/	
	public Customer(String newName){
		this.name = newName;
	}
	
	/** Initializes customer with ID.
	@param newID The new ID number for the customer.
	*/	
	public Customer(int newID){
		this.customerID = newID;
	}
	
	/** Copy's name and ID from old customer to new one.
	@param oldCustomer The customer to copy the data from.
	*/	
	public Customer(Customer oldCustomer){
		this.name = oldCustomer.name;
		this.customerID = oldCustomer.customerID;
	}
	
	/** Prints out customers name and ID when called
	@return Customer: (name), ID: (customerID)
	*/
	public String toString(){
		return "Customer: " + this.name +", ID: " + this.customerID;
	}
	
	/** Returns customer's name.
	@return Name of customer.
	*/
	public String getName(){
		return this.name;
	}

	/** Returns customer's ID.
	@return ID of customer.
	*/
	public int getID(){
		return this.customerID;
	}

	/** Sets customer's name.
	@param newName The new name for the customer.
	*/
	public void setName(String newName){
		this.name=newName;
	}

	/** Sets customer's ID.
	@param newID The new ID for the customer.
	*/	
	public void setCustomerID(int newID){
		this.customerID = newID;
	}

}
