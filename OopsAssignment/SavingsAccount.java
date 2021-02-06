package OopsAssignment;

public class SavingsAccount{
	double Balance;
	int Interest;
	
	
	public SavingsAccount(double balance, int interest) {
		super();
		this.Balance = balance;
		this.Interest = interest;
	}


	public double getBalance() {
		return Balance;
	}


	
	public int getInterest() {
		return Interest;
	}
	
	void withdraw() {
		Balance=Balance-1000;
	}
	void deposit() {
		Balance=Balance+1000;
	}
	
	




}





