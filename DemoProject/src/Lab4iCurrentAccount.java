
public class Lab4iCurrentAccount extends Lab4iAccount{
	private double overdraftLimit;
	
	public double getOverdraft() {
		return overdraftLimit;
	}
	
	public void setOverdraft(double overdraft) {
		this.overdraftLimit=overdraft;
	}
	public void withdraw(double amount) {
		if((getBalance()-amount) < overdraftLimit){
			System.out.println("withdraw successfully");
			setBalance(getBalance()-amount);
		}
		else {
			System.out.println("withdraw doesnot happen overdraft limit");
		}
	}
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit=overdraftLimit;
	}

}
