
public class B extends A{
	String name;
//constructor has invoked as A's 
	public B() {
		
		System.out.println("B's default");
	}
	
	public B(int x,double d,String name) {
		super(x,d);
		this.name=name;
	}
}
