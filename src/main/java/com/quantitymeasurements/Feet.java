/* @Purpose: As a math student, I wish to compare lengths 1ft = 12in 
 * @File: Quantity Measurement 
 * @Author: Akshay Kumar
 */
package com.quantitymeasurements;

public class Feet {
	private double value = 0.0;

	public Feet(double value) {
		this.value = value;
	}

	public Feet() {

	}

	/*
	 * @Purpose: Compare units 0feet = 0feet
	 * 
	 * @Param: Object Value
	 * 
	 * @Result: Boolean (true,false)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Feet feet = (Feet) obj;
		return Double.compare(feet.value, value) == 0;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}
}