
public class Lab4iSavingsAccount extends Lab4iAccount {
	final double minBalance=500;
	
	public Lab4iSavingsAccount() {}
	
	public void withdraw(double amount) {
		if(getBalance()-amount < minBalance) {
			System.out.println("Insufficient balance");
		}else {
			setBalance(getBalance()-amount);
			System.out.println("withdrawal successfully");
		}
	}
}
