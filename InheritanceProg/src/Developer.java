
public class Developer extends Employee implements Certification {
	private int no_of_projects_done;

	public Developer() {}
	
	public Developer(String name,String location,int age,int empCode, String dept, double salary,int no_of_projects_done) {
		super(name,location,age,empCode,dept,salary);
		this.no_of_projects_done = no_of_projects_done;
	}
	public void getCertification(String cname) {
		System.out.println("get certified");
	}
	

}
