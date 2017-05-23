package courierserviceapp.domain;

public class Client {
	private String name;
	private String phone;
	private ServiceList serviceList;
	
	public Client(String name, String phone){
		this.name = name;
		this.phone = phone;
		serviceList = new ServiceList(); 
	}
	
	public String getName(){
		return name;
	}
	
	public String getPhone(){
		return phone;
	}
}
