/**
 * 
 */
package com.srb;

/**
 * @author srbwin
 *
 */
public interface AirplaneInterface {
	String NAME = "SAURABH";
	
	void setSeatingCapacity(Integer seatingCapacity);
	Integer getSeatingCapacity();
	
	void setMaxFlyingDistance(Float maxFlyingDistance);
	Float getMaxFlyingDistance();
	
	void setNoOfPropellers(Integer noOfPropellers);
	Integer getNoOfPropellers();
	
	void setNoOfWings(Integer noOfWings);
	Integer getNoOfWings();
	
	void setbrand(String brand);
	String getBrand();
	
}
