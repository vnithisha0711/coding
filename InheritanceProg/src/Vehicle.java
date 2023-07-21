
public class Vehicle {

	protected int regno;
	protected String vehicleName;
	protected double price;
	protected double mileage;
	public Vehicle() {}
	public Vehicle(int regno, String vehicleName, double price, double mileage) {
		super();
		this.regno = regno;
		this.vehicleName = vehicleName;
		this.price = price;
		this.mileage = mileage;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	
	
}
