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
public enum Units {
	FEET(30), INCH(2.5), YARD(90), CM(1);

	public double unit;

	Units(double unit) {
		this.unit = unit;
	}
}