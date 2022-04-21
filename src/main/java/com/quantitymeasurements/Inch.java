/* @Purpose: As A Math Student, I Wish To Compare Lengths   
 * @File: Quantity Measurement 
 * @Author: Akshay Kumar
 */
package com.quantitymeasurements;

public class Inch {
	private double value;

	public Inch(double value) {
		this.value = value;
	}

	public Inch() {

	}

	/*
	 * @Purpose: Compare Units Inch Value
	 * 
	 * @Param: Object Values
	 * 
	 * @Result: Boolean Value (True,False)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Inch inch = (Inch) obj;
		return Double.compare(inch.value, value) == 0;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getValue() {
		return this.value;
	}

}
