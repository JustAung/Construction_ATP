/**
 * 
 */

/**
 * @author Aung
 *Construction_ATP
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Building build = new Building("Gaines House ", " 123 Main Street | Louisville, Kentucky 40201 ", 2450, " Group B " , "R1" );
		build.draw();
		System.out.println(build.displayData());
		
		
		
		Business bus = new Business("Gaines House ", " 123 Main Street | Louisville, Kentucky 40201 ", 2450, " Business " , "Group B", 20 );
		bus.draw();
		System.out.println(bus.displayData());
		
		
		
		Mall mal = new Mall("Gaines House ", " 123 Main Street | Louisville, Kentucky 40201 ", 2450, " Business " , "Group B", 20, 20, 50);
		mal.draw();
		System.out.println(mal.displayData());
		
		
		
		Residential Res = new Residential("Gaines House ", " 123 Main Street | Louisville, Kentucky 40201 ", 2450, " Residential " , "R1", 3, 2, true);
		Res.draw();
		System.out.println(Res.displayData());
		
		
		
		Apartment apart = new Apartment("Gaines House ", " 123 Main Street | Louisville, Kentucky 40201 ", 2450, " Residential " , "R2", 3, 2, true, 3, 2, true);
		apart.draw();
		System.out.println(apart.displayData());
		
		
		
		SingleFamilyHome SFM = new SingleFamilyHome("Gaines House ", " 123 Main Street | Louisville, Kentucky 40201 ", 2450, " Residential " , "R2", 3, 2, true, true);
		SFM.draw();
		System.out.println(SFM.displayData());
		
		
		
		
	}

}//end of class
