/**
 * 
 */

/**
 * @author Aung
 *
 */
public class Mall extends Business{
private int NumRentedUnits;
private double medianUnitSize;
private int numParkingSpaces;

//default constructor 
public Mall() 
{
	
}//end of default constructor

//preferred constructor
public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int NumRentedUnits, double medianUnitSize, int numParkingSpaces) 
{
	this.projectName = projectName;
	this.completeAddress = completeAddress;
	this.totalSquareFeet = totalSquareFeet;
	this.occupancyGroup = occupancyGroup;
	this.subgroup = subgroup;
	this.NumRentedUnits=NumRentedUnits;
	this.medianUnitSize=medianUnitSize;
	this.numParkingSpaces=numParkingSpaces;
}//end of preferred constructor 

public void draw() 
{
	System.out.println("Drawing an object for <<<Mall/object type.");
}

//displayData method
public String displayData() 
{
	return toString();
	 
}


@Override
public String toString() {
	return "Mall [Project Name=" + projectName + ", Complete Address=" + completeAddress + ", Square Feet="
			+ totalSquareFeet + ", Occupancy Group=" + occupancyGroup + ", Occupancy Subgroup=" + subgroup + ", Rentable Units=" + numRentableUnits 
			+", Rented Units=" + NumRentedUnits + ", Medium Unit Size =" + medianUnitSize + ", Parking Spaces="
					+ numParkingSpaces +  "]";
}

//getNumRentedUnits
public int getNumRentedUnits() {
	return NumRentedUnits;
}//end of getNumRentedUnits

//setNumRentedUnits
public void setNumRentedUnits(int numRentedUnits) {
	NumRentedUnits = numRentedUnits;
}//end of setNumRentedUnits

//getMedianUnitSize
public double getMedianUnitSize() {
	return medianUnitSize;
}//end of getMedianUnitSize

//setMedianUnitSize
public void setMedianUnitSize(double medianUnitSize) {
	this.medianUnitSize = medianUnitSize;
}//end of setMedianUnitSize

//getNumParkingSpaces
public int getNumParkingSpaces() {
	return numParkingSpaces;
}//end of getNumParkingSpaces

//setNumParkingSpaces
public void setNumParkingSpaces(int numParkingSpaces) {
	this.numParkingSpaces = numParkingSpaces;
}//end of setNumParkingSpaces


}//end of class
