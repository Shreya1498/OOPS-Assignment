package OopsAssignment;

public class SavingsDemo {

	public static void main(String[] args) {
		SavingsAccount savingsaccount=new SavingsAccount(2000,4);
		savingsaccount.getBalance();
		System.out.println("Acccount Balance is "+savingsaccount.getBalance());
		savingsaccount.getInterest();
		System.out.println("Acccount Balance is "+savingsaccount.getInterest()+"%");
		savingsaccount.withdraw();
		System.out.println("Balance after withdrawing is "+savingsaccount.getBalance());
		savingsaccount.deposit();
		System.out.println("Balance on depositing "+savingsaccount.getBalance());
		
		
	}

}
