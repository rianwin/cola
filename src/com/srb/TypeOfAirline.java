package com.srb;

// Hello
public class TypeOfAirline {

	public static String COMMERCIAL = "COMMERCIAL";
	public static String DEFENCE = "DEFENCE";
	public static String CARGO = "CARGO";

	/**
	 * @param code
	 * @return
	 */
	public String typeOfAirline(Character code) {

		String typeOfAirline = null;
		switch (code) {
		case 'c':
			typeOfAirline = COMMERCIAL;
			break;
		case 'd':
			typeOfAirline = DEFENCE;
			break;
		case 'o':
			typeOfAirline = CARGO;
			break;
		default:
			break;
		}
		return typeOfAirline;
	}
}
