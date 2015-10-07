/**
 * 
 */
package com.srb;

/**
 * @author srbwin
 *
 */
public class AirplaneImpl extends AirplaneFeatures implements AirplaneInterface{
	
	int seatingCapacity;
	String brand;
	Float maxFlyingDistance;
	int noOfWings;
	private Integer noOfPropellers;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TypeOfAirline typeOfAirline = new TypeOfAirline();
		String typeOfAirlineStr = typeOfAirline.typeOfAirline('c');
		System.out.println(typeOfAirlineStr);
	
		AirplaneImpl airplaneImpl = new AirplaneImpl();
		airplaneImpl.setbrand("Boeing");
		airplaneImpl.setSeatingCapacity(100);
		airplaneImpl.setMaxFlyingDistance(2000f);
		airplaneImpl.setNoOfPropellers(4);
		
		System.out.println(airplaneImpl.getBrand());
		System.out.println(airplaneImpl.getSeatingCapacity());
		System.out.println(airplaneImpl.getMaxFlyingDistance());
		System.out.println(airplaneImpl.getNoOfPropellers());
		
	}

	@Override
	public void setbrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public void setSeatingCapacity(Integer seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
		
	}

	@Override
	public Integer getSeatingCapacity() {
		return seatingCapacity;
	}

	@Override
	public void setMaxFlyingDistance(Float maxFlyingDistance) {
		this.maxFlyingDistance = maxFlyingDistance;
		
	}

	@Override
	public Float getMaxFlyingDistance() {
		return maxFlyingDistance;
	}

	@Override
	public void setNoOfPropellers(Integer noOfPropellers) {
		this.noOfPropellers = noOfPropellers;
		
	}

	@Override
	public Integer getNoOfPropellers() {
		// TODO Auto-generated method stub
		return noOfPropellers;
	}

	@Override
	public void setNoOfWings(Integer noOfWings) {
		this.noOfWings = this.noOfWings;
	}

	@Override
	public Integer getNoOfWings() {
		return noOfWings;
	}

	
}
