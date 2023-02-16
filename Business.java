/**
 * 
 */

/**
 * @author aung
 *Construction_ATP
 */
public class Business extends Building{
protected int numRentableUnits;

//default constructor 
public Business() 
{
	
}//end of default constructor

//preferred constructor
public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits) 
{
	this.projectName = projectName;
	this.completeAddress = completeAddress;
	this.totalSquareFeet = totalSquareFeet;
	this.occupancyGroup = occupancyGroup;
	this.subgroup = subgroup;
	this.numRentableUnits=numRentableUnits;
}//end of preferred constructor

//draw method
public void draw() 
{
	System.out.println("Drawing an object for <<<Business/object type.");
}

//displayData method
public String displayData() 
{
	return toString();
	
}//end of displayData method



@Override
public String toString() {
	return "Business [Project Name=" + projectName + ", Complete Address=" + completeAddress + ", Square Feet="
			+ totalSquareFeet + ", Occupancy Group=" + occupancyGroup + ", Occupancy Subgroup=" + subgroup + ", Rentable Units=" + numRentableUnits + "]";
}

//getter getNumRentableUnits
public int getNumRentableUnits() {
	return numRentableUnits;
}

//setter setNumRentableUnits
public void setNumRentableUnits(int numRentableUnits) {
	this.numRentableUnits = numRentableUnits;
}//end of setNumRentableUnits

}//end of class
