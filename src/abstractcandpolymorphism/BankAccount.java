package abstractcandpolymorphism;

public abstract class BankAccount {
    private String name;
    private  double  balance;
    private int  accountNumber;
	
    
    public abstract void  withDraw(double amount);
    public abstract void deposit(double amount);
    
    
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
 
 
	
	
	
}
