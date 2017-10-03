package abstractcandpolymorphism;

public class SavingAccount extends BankAccount{

	@Override
	public void withDraw(double amount) {
     System.out.println("Withdrawing account from saaving account:$"+amount); 
		double tempbalance =getBalance();
		tempbalance=tempbalance-amount;
	    setBalance(tempbalance);
	}

	@Override
	public void deposit(double amount) {
		System.out.println("Depositing from a  saaving account:$"+amount); 
		double tempbalance =getBalance();
		tempbalance=tempbalance+amount;
	    setBalance(tempbalance);
		
	}

	
}
