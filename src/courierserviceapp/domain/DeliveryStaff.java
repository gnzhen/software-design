package courierserviceapp.domain;

public class DeliveryStaff {
	private int id;
	private boolean available;
	
	public DeliveryStaff(int id, boolean available){
		this.id = id;
		this.available = available;
	}
	
	public int getId(){
		return id;
	}
	
	public boolean getAvailable(){
		return available;
	}
	
	public void setAvailability(boolean availability){
		this.available = availability;
	}

}
