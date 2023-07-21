
public class TestSingleLevel {

	public static void main(String[] args) {
		Employee employee=new Employee("deepthi","hyderabad",22,1234,"cse",45000.0);
		
		/*employee.setName("Mrunmayi");
		employee.setLocation("Mumbai");
		employee.setAge(22);
		employee.setEmpCode(100);
		employee.setDept("Mktg");
		employee.setSalary(55000.0);*/
		
		System.out.println("Name: "+employee.getName()+"\nLocation:"+employee.getLocation());

	}

}
