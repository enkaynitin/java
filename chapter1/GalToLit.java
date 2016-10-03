/* 
	Try this 1-1
	
	This program converts gallons to liters.
	
	Call this program GalToLit.java.
	
*/

class GalToLit {
	public static void main(String args[]) {
		double gallons; // holds the number of gallons
		double litres; // holds conversion to litres
		
		gallons = 10; // start with 10 gallons
		
		litres = gallons * 3.7854; // convert to liters
		
		System.out.println(gallons + " gallons is " + litres + " litres.");
	}
} 
