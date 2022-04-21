/* @Purpose: As A Math Student, I Wish To Compare Lengths
 * @File: Quantity Measurement 
 * @Author: Akshay Kumar
 */
package com.quantitymeasurements;

/*
 * @Purpose: Enum Units Feet, Inch Values
 * 
 * @Param: Object Unit Values
 */
public enum Units {
	FEET(12), INCH(1);

	public double unit;

	Units(double unit) {
		this.unit = unit;
	}
}