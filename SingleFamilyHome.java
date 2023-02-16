/**
 * 
 */

/**
 * @author aung
 *
 */
public class SingleFamilyHome extends Residential{
public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}
private boolean garage;
//default constructor
public SingleFamilyHome() 
{
		
}//end of constructor

//preferred constructor
//preferred constructor
public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) 
{
	this.projectName = projectName;
	this.completeAddress = completeAddress;
	this.totalSquareFeet = totalSquareFeet;
	this.occupancyGroup = occupancyGroup;
	this.subgroup = subgroup;
	this.numBedrooms=numBedrooms;
	this.numBathrooms=numBathrooms;
	this.laundryRoom=laundryRoom;
	this.garage=garage;

}//end of preferred constructor

public void draw() 
{
	System.out.println("Drawing an object for <<<SingleFamilyHome/object type.");	
}

//displayData method
public String displayData() 
{
	return toString();
		 	
}

@Override
public String toString() {
	return "SingleFamilyHome [Project Name=" + projectName + ", Complete Address=" + completeAddress
			+ ", Square Feet=" + totalSquareFeet + ", Occupancy Group=" + occupancyGroup + ", Subgroup=" + subgroup
			+ ", Bedrooms=" + numBedrooms + ", Bathrooms=" + numBathrooms + ", Laundry Room=" + laundryRoom
			+ ", Garage=" + garage + "]";
}







}//end of class
