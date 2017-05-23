package courierserviceapp.domain;

public class AppController {
	private ClientList clientList;
	private DeliveryStaffList dStaffList;
	private ServiceList serviceList;
	private Service currentService;
	private Client currentClient;
	private DeliveryStaff currentDStaff;
	private DateTime date;
	
	public AppController(){
		clientList = new ClientList();
		dStaffList = new DeliveryStaffList();
		serviceList = new ServiceList();
		date = new DateTime();
	}
	
	public void setCurrentClient(Client client){
		currentClient = client;
	}
	
	public void setCurrentService(Service service){
		currentService = service;
	}
	
	public void setCurrentDStaff(DeliveryStaff dStaff){
		currentDStaff = dStaff;
	}

	public Client getCurrentClient(){
		return currentClient;
	}

	public Service getCurrentService(){
		return currentService;
	}
	
	public DeliveryStaff getCurrentDStaff(){
		return currentDStaff;
	}
	
	public String getDate(){
		return date.getDate();
	}
	
	public String[] getAllId(){
		return dStaffList.getAllId();
	}	
	
	public void addClient(String name, String phone){
		currentClient = new Client(name, phone);
		clientList.addClient(currentClient);
	}
	
	public void addService(int trackNo, String pAddr, String dAddr, 
			String date, double charge, Client client){
		currentService = new Service(trackNo, pAddr, dAddr, date, charge, currentClient);
		serviceList.addService(currentService);
	}
	
	public Client searchClient(String name){
		currentClient = clientList.searchClient(name);
		return currentClient;
	}
	
	public Service trackService(int trackNo){
		currentService = serviceList.trackService(trackNo);
		
		if(currentService != null){
			currentClient = currentService.getClient();
			if(currentService.getDStaff() != null)
				currentDStaff = currentService.getDStaff();
		}
		return currentService;
	}
	
	public boolean checkAvailable(int id){
		currentDStaff = dStaffList.getStaffById(id);
		return dStaffList.checkAvailable(currentDStaff);
	}
	
	public void assignDStaff(Service service, DeliveryStaff dStaff){
		serviceList.assignDStaff(service, dStaff);
		dStaff.setAvailability(false);
	}
	
	public void updateDelivered(Service service){
		service.updateDelivered();
		currentDStaff.setAvailability(true);
	}
}
