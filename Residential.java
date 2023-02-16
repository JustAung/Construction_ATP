/**
 * 
 */

/**
 * @author aung
 *
 */
public class Residential extends Building{
protected int numBedrooms;
protected int numBathrooms;
protected boolean laundryRoom;

//default constructor
public Residential() 
{
	
}
//preferred constructor
public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) 
{
	this.projectName = projectName;
	this.completeAddress = completeAddress;
	this.totalSquareFeet = totalSquareFeet;
	this.occupancyGroup = occupancyGroup;
	this.subgroup = subgroup;
	this.numBedrooms=numBedrooms;
	this.numBathrooms=numBathrooms;
	this.laundryRoom=laundryRoom;

}//end of preferred constructor

//draw method
public void draw() 
{
	System.out.println("Drawing an object for <<<Residential/object type.");
}

//displayData method
public String displayData() 
{
	return toString();
	
}//end of displayData method


@Override
public String toString() {
	return "Residential [Project Name=" + projectName + ", Complete Address=" + completeAddress + ", Square Feet="
			+ totalSquareFeet + ", Occupancy Group=" + occupancyGroup + ", Subgroup=" + subgroup + ", Bedrooms="
			+ numBedrooms + ", Bathrooms=" + numBathrooms + ", Laundry Room=" + laundryRoom + "]";
}
//getNumBedrooms
public int getNumBedrooms() {
	return numBedrooms;
}//end of getNumBedrooms

//setNumBedrooms
public void setNumBedrooms(int numBedrooms) {
	this.numBedrooms = numBedrooms;
}//end of setNumBedrooms

//getNumBathrooms
public int getNumBathrooms() {
	return numBathrooms;
}//end of getNumBathrooms

//setNumBathrooms
public void setNumBathrooms(int numBathrooms) {
	this.numBathrooms = numBathrooms;
}//end of setNumBathrooms

//isLaundryRoom
public boolean isLaundryRoom() {
	return laundryRoom;
}//end of isLaundryRoom

//setLaundryRoom
public void setLaundryRoom(boolean laundryRoom) {
	this.laundryRoom = laundryRoom;
}//end of setLaundryRoom

}//end of class
