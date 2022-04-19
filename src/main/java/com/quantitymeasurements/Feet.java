/* @Purpose: As A Math Student, I Wish To Compare Lengths 1ft = 12in 
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
	 * @Purpose: Compare Units Feet Values
	 * 
	 * @Param: Object Values
	 * 
	 * @Result: Boolean Values (True,False)
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