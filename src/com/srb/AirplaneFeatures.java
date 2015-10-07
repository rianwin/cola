/**
 * 
 */
package com.srb;

/**
 * @author srbwin
 *
 */
public abstract class AirplaneFeatures { 
	
	abstract void setSeatingCapacity(Integer seatingCapacity);
	abstract Integer getSeatingCapacity();
	
	abstract void setMaxFlyingDistance(Float maxFlyingDistance);
	abstract Float getMaxFlyingDistance();
	
	abstract void setNoOfPropellers(Integer noOfPropellers);
	abstract Integer getNoOfPropellers();
	
	abstract void setNoOfWings(Integer noOfWings);
	abstract Integer getNoOfWings();
	
}
