package courierserviceapp.domain;

import java.util.ArrayList;

public class DeliveryStaffList {
	private ArrayList<DeliveryStaff> dStaffs;
	
	public DeliveryStaffList(){
		dStaffs = new ArrayList<DeliveryStaff>();
		dStaffs.add(new DeliveryStaff(111, false));
		dStaffs.add(new DeliveryStaff(222, true));
		dStaffs.add(new DeliveryStaff(333, true));
	}
	
	public String[] getAllId(){
		ArrayList<String> allIdList= new ArrayList<String>();
		
		for(DeliveryStaff dStaff : dStaffs){
			String idString = Integer.toString(dStaff.getId());
			allIdList.add(idString);
		}
		
		String[] allIdArray = new String[allIdList.size()];
		return allIdList.toArray(allIdArray);
	}
	
	public boolean checkAvailable(DeliveryStaff dStaff){
		boolean available = false;
		for(DeliveryStaff ds : dStaffs){
			if(dStaff.getId() == ds.getId()){
				available = ds.getAvailable();
			}
		}
		return available;
	}
	
	public DeliveryStaff getStaffById(int id){
		DeliveryStaff dStaff = null;
		for(DeliveryStaff ds : dStaffs){
			if(id == ds.getId()){
				dStaff = ds;
			}
		}
		return dStaff;
	}
}
