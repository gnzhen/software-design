package courierserviceapp.domain;

public class Service {

	private int trackNo;
	private String status;
	private String deliveryAddr;
	private String pickupAddr;
	private double charge;
	private String date;
	private Client client;
	private DeliveryStaff dStaff;
	
	public Service(int trackNo, String pickupAddr, String deliveryAddr, 
			String date, double charge, Client client){
		this.trackNo = trackNo;
		this.pickupAddr = pickupAddr;
		this.deliveryAddr = deliveryAddr;
		this.date = date;
		this.charge = charge;
		status = "pending";
		this.client = client;
	}
	
	public void setDeliveryStaff(DeliveryStaff dStaff){
		this.dStaff = dStaff;
		status = "delivering";
	}
	
	public void updateDelivered(){
		this.status = "delivered";
	}
	
	public int getTrackNo(){
		return trackNo;
	}
	
	public String getPickupAddr(){
		return pickupAddr;
	}
	
	public String getDeliveryAddr(){
		return deliveryAddr;
	}
	
	public String getDate(){
		return date;
	}
	
	public double getCharge(){
		return charge;
	}
	
	public DeliveryStaff getDStaff(){
		return dStaff;
	}
	
	public String getStatus(){
		return status;
	}
	
	public Client getClient(){
		return client;
	}
	
}