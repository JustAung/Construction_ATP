/**
 * 
 */

/**
 * @author Aung
 * Construction_ATP
 *
 */
//Building class
public class Building {
protected String projectName;
protected String completeAddress;
protected double totalSquareFeet;
protected String occupancyGroup;
protected String subgroup;

//default constructor
public Building()
{
	
}//end of default constructor

/**
 * @param projectName
 * @param completeAddress
 * @param totalSquareFeet
 * @param occupancyGroup
 * @param subgroup
 */
public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,String subgroup) 
{
	this.projectName = projectName;
	this.completeAddress = completeAddress;
	this.totalSquareFeet = totalSquareFeet;
	this.occupancyGroup = occupancyGroup;
	this.subgroup = subgroup;
}//end of preferred

//draw method
public void draw() 
{
	System.out.println("Drawing an object for <<<Building/object type.");
}

//displayData method
public String displayData() 
{
	return toString();
	
}//end of displayData method


@Override
public String toString() {
	return "Building [Project Name=" + projectName + ", Complete Address=" + completeAddress + ", Square Feet="
			+ totalSquareFeet + ", Occupancy Group=" + occupancyGroup + ", subgroup=" + subgroup + "]";
}

//getProjectName
public String getProjectName() {
	return projectName;
}//end of getProjectName

//setProjectName
public void setProjectName(String projectName) {
	this.projectName = projectName;
}//end of setProjectName

//getCompleteAddress
public String getCompleteAddress() {
	return completeAddress;
}//end of getCompleteAddress

//setCompleteAddress
public void setCompleteAddress(String completeAddress) {
	this.completeAddress = completeAddress;
}//end of setCompleteAddress

//getTotalSquareFeet
public double getTotalSquareFeet() {
	return totalSquareFeet;
}//end of getTotalSquareFeet

//setTotalSquareFeet
public void setTotalSquareFeet(double totalSquareFeet) {
	this.totalSquareFeet = totalSquareFeet;
}//end of setTotalSquareFeet

//getOccupancyGroup
public String getOccupancyGroup() {
	return occupancyGroup;
}//end of getOccupancyGroup

//setOccupancyGroup
public void setOccupancyGroup(String occupancyGroup) {
	this.occupancyGroup = occupancyGroup;
}//end of setOccupancyGroup

//getSubgroup
public String getSubgroup() {
	return subgroup;
}//end of getSubgroup

//setSubgroup
public void setSubgroup(String subgroup) {
	this.subgroup = subgroup;
}//end of setSubgroup


}//end of class
