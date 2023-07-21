
public class Person {
    protected String name;
    protected String location;
	protected int age;
	public Person() {}
	public Person(String name, String location, int age) {
		super();
		this.name = name;
		this.location = location;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", location=" + location + ", age=" + age + "]";
	}
	
}
