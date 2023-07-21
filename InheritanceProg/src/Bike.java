
public class Bike extends Vehicle {

	protected boolean splittedSeat;

	public Bike() {}
	public Bike(boolean splittedSeat) {
		super();
		this.splittedSeat = splittedSeat;
	}
	public boolean isSplittedSeat() {
		return splittedSeat;
	}
	public void setSplittedSeat(boolean splittedSeat) {
		this.splittedSeat = splittedSeat;
	}
	
	
}
