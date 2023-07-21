
public class TestVehicle {

	public static void main(String[] args) {

		Car car=new Car();
		Bike bike=new Bike();
		car.setRegno(1234);
		car.setVehicleName("i10");
		car.setPrice(10000.0);

		bike.setRegno(1235);
		bike.setVehicleName("R15");
		bike.setPrice(20000.0);
 
		System.out.println("Regno:"+car.getRegno()+"\nName:"+car.getVehicleName()+"\nMileage:"+car.getMileage());
	}

}
