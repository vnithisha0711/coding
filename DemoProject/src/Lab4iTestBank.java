public class Lab4iTestBank {
	
	public static void main(String[] args) {
		
		Lab4iAccount ac1=new Lab4iAccount();
		ac1.setAccNum(1234567);
		ac1.setBalance(2000);
		
		Lab4iAccount ac2=new Lab4iAccount();
		ac2.setAccNum(7654321);
		ac2.setBalance(3000);
		
		Person p1=new Person();
		p1.setName("smith");
		p1.setAge(31);
		
		Person p2=new Person();
		p2.setName("kathy");
		p2.setAge(32);
		
		ac1.setAccHolder(p1);
		ac2.setAccHolder(p2);
		
		ac1.deposit(2000);
		System.out.println("after deposit balance is " +ac1.getBalance());
		ac2.withdraw(2000);
		System.out.println("after withdrawal balance is " +ac2.getBalance());
	}
}
