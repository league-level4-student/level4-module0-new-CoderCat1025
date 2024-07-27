package _01_Encapsulate_the_Data;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class EncapsulateTheData {

	// 1. Encapsulate all the members.

	// 2. Implement the setter restrictions described above each member variable.

	// 3. Pass all the JUnit tests.

	/* 
	 * All negative arguments should set itemsReceived to 0.
	 */

	private int itemsReceived;

	public void setItemsReceived(int i) {
		if (i > 0) {
			itemsReceived = i;
		} else {
			itemsReceived = 0;
		}
	}
	
	public int getItemsReceived() {
		return itemsReceived;
	}
	
	/*
	 * degreesTurned must be locked between 0.0 and 360.0 inclusive.
	 * 
	 * All parameters outside this range should set degreesTurned to the nearest
	 * bound.
	 */

	private double degreesTurned;
	
	public void setDegreesTurned(Double e) {
		if (e >= 0.0 && e <= 360.0) {
			degreesTurned = e;
		} else {
			if (e > 360) {
				degreesTurned = 360.0;
			} else {
				degreesTurned = 0.0;
			}
		}
	}
	
	public Double getDegreesTurned() {
		return degreesTurned;
	}

	/*
	 * nomenclature must not contain an empty String.
	 * 
	 * An empty String parameter should set nomenclature to a String with a single
	 * space.
	 */

	private String nomenclature;

	public void setNomenclature(String s) {
		if (s.isEmpty()) {
			nomenclature = " ";
		} else {
			nomenclature = s;
		}
	}
	
	public String getNomenclature() {
		return nomenclature;
	}
	
	/*
	 * memberObj must not be a String.
	 * 
	 * A String parameter should set memberObj to a new Object();
	 * 
	 * Hint: Use the instanceof operator.
	 * 
	 * Example:
	 * 
	 * Robot rob = new Robot();
	 * 
	 * System.out.println(rob instanceof Robot); // prints true
	 * 
	 * System.out.println(rob instanceof Random); //prints false
	 */

	private Object memberObj;

	public void setMemberObj(Object i) {
		if (i instanceof String) {
			memberObj = new Object();
		} else {
			memberObj = i;
		}
	}
	
	public Object getMemberObj() {
		return memberObj;
	}
}
