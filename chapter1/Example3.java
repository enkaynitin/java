/* 
	this program illustrates the differences
	between int and double.
	
	Call this file Example.java
*/

class Example3 {
	public static void main(String args[]) {
		int var; // This declares a integer variable
		double x; // This declares a floating-point varibale
		
		var = 10; // assigns var the value 10
		
		x = 10.0; // assigns x the value 10.0
		
		System.out.println("Original value of var: " + var);
		System.out.println("Original value of x: " + x);
		System.out.println(); // print a blank line
		
		// now, devide both by 4 
		var = var / 4;
		x = x / 4;
		
		System.out.println("var afer division: " + var);
		System.out.println("x after division: " + x);
	}
}
		
