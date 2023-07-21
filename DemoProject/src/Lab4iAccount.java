
public class Lab4iAccount extends Lab4iPerson{
	private long accNum;
	private double balance;
	private Person accHolder;
	
	public Lab4iAccount() {}

	public Lab4iAccount(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double amount) {
		balance=balance+amount;
			System.out.println(balance);
		}
	
	
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient balance");
		}
		else {
			balance=balance-amount;
			System.out.println("Amount withdrawal succesful= " +balance);
		}
	}

	
}
