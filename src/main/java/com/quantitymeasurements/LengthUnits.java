/* @Purpose: As A Math Student, I Wish To Compare Lengths
 * @File: Quantity Measurement 
 * @Author: Akshay Kumar
 */
package com.quantitymeasurements;

/*
 * @Purpose: Enum Units Values
 * 
 * @Param: Object Unit Values
 */
public enum LengthUnits {
	FEET(30), INCH(2.5), YARD(90), CM(1);
	// FEET(12), INCH(1), YARD(36), CM(1 / 2.5);

	public double unit;

	LengthUnits(double unit) {
		this.unit = unit;
	}
}