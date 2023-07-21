
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person parr[]=new Person[3];
		
		parr[0] = new Person("Medha" , "Bengaluru" , 20); 
		parr[1] = new Person("Manmit" ,"Delhi" , 22);
		parr[2] = new Person("Mohit" , "London" , 24);
		
		for(int i=0 ; i<parr.length ; i++) {
			System.out.println(parr[i]);
		}
		
		boolean flag = Person.searchName(parr ,"Mohit");
		
		if(flag) {
			System.out.println("Name found");
		}
		else {
			System.out.println("Name not found");
		}
		
		
	}

}
