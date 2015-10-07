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
	
	void setAirplaneFeatures(AirplaneFeatures airlAirplaneFeatures);
	AirplaneFeatures getAirplaneFeatures();
	
	void setTypeOfAirline(TypeOfAirline typeOfAirline);
	TypeOfAirline getTypeOfAirline();
	
	void setbrand(String brand);
	String getBrand();
	
}
