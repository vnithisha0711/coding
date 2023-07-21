
public class Person {
      String name;
      String Location;
      int age;
      
      
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(String name, String location, int age) {
		super();
		this.name = name;
		Location = location;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return Location;
	}


	public void setLocation(String location) {
		Location = location;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public static boolean searchName(Person parr[] , String name) {
		for(int i=0 ; i<parr.length ; i++) {
			if(parr[i].name.equals(name)) {
				return true;
			}
		}
		return false;
		
	}
	
	@Override
	public String toString() {
		return "Name=" + name + ", Location=" + Location + ", age=" + age;
	}
      
	
	
      
}
