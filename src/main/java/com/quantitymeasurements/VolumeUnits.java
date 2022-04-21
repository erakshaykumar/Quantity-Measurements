/* @Purpose: As A Math Student, I Wish To Compare Volume 
 * @File: Quantity Measurement 
 * @Author: Akshay Kumar
 */
package com.quantitymeasurements;

/*
 * @Purpose: Enum Volume Units Values
 * 
 * @Param: Object Unit Values
 */
public enum VolumeUnits {
	GALLON(3.78 * 1000), LITER(1000), MILLILITER(1);

	public double unit;

	VolumeUnits(double units) {
		this.unit = units;
	}
}
