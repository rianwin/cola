/**
 * 
 */
package com.srb;

/**
 * @author srbwin
 *
 */

public class Hello {

	int flighttype;
	
	public int getFlighttype() {
		return flighttype;
	}

	public void setFlighttype(int flighttype) {
		this.flighttype = flighttype;
		System.out.println();;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(printHelloWorld());
		Hello a = new Hello();
		a.setFlighttype(1234);
		System.out.println(a.getFlighttype());
		
	}
	
	private static String printHelloWorld() {
		return "Thanks Colaberry!";
		
		
	}
}
