/**
 * 
 */

/**
 * @author aung
 *
 */
public class Apartment extends Residential{
private int NumRentableUnits;
private double avgUnitSize;
private boolean parkingAvailable;
	
//default constructor
public Apartment() 
{
	
}//end of constructor

//preferred constructor
public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup,int numBedrooms, int numBathrooms, boolean laundryRoom, int NumRentableUnits, double avgUnitSize, boolean parkingAvailable) 
{
	this.projectName = projectName;
	this.completeAddress = completeAddress;
	this.totalSquareFeet = totalSquareFeet;
	this.occupancyGroup = occupancyGroup;
	this.subgroup = subgroup;
	this.numBedrooms=numBedrooms;
	this.numBathrooms=numBathrooms;
	this.laundryRoom=laundryRoom;
	this.NumRentableUnits=NumRentableUnits;
	this.avgUnitSize=avgUnitSize;
	this.parkingAvailable=parkingAvailable;
}//end of preferred

//draw method
public void draw() 
{
	System.out.println("Drawing an object for <<<Apartment/object type.");
}//end of draw method

//displayData method
public String displayData() 
{
	return toString();
	 
	
}//end of displayData method



@Override
public String toString() {
	return "Apartment [Project Name=" + projectName + ", Complete Address=" + completeAddress + ", Square Feet="
			+ totalSquareFeet + ", Occupancy Group=" + occupancyGroup + ", Subgroup=" + subgroup + ", Bedrooms="
			+ numBedrooms + ", Bathrooms=" + numBathrooms + ", Laundry Room=" + laundryRoom + ", avgUnitSize="
			+ avgUnitSize + ", Rentable Units=" + NumRentableUnits + ", Parking Available=" + parkingAvailable + "]";
}

//getNumRentableUnits
public int getNumRentableUnits() {
	return NumRentableUnits;
}//end of getNumRentableUnits

//setNumRentableUnits
public void setNumRentableUnits(int numRentableUnits) {
	NumRentableUnits = numRentableUnits;
}//end of setNumRentableUnits

//getAvgUnitSize
public double getAvgUnitSize() {
	return avgUnitSize;
}//end of getAvgUnitSize

//setAvgUnitSize
public void setAvgUnitSize(double avgUnitSize) {
	this.avgUnitSize = avgUnitSize;
}//end of setAvgUnitSize

//isParkingAvailable
public boolean isParkingAvailable() {
	return parkingAvailable;
}//end of isParkingAvailable

//setParkingAvailable
public void setParkingAvailable(boolean parkingAvailable) {
	this.parkingAvailable = parkingAvailable;
}//end of setParkingAvailable


}//end of class
