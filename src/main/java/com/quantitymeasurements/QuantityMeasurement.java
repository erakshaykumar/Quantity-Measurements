/* @Purpose: As A Math Student, I Wish To Conversion and Addition Of Lengths,Volume,Weight,Temperature
 * @File: Quantity Measurement 
 * @Author: Akshay Kumar
 */
package com.quantitymeasurements;

public class QuantityMeasurement {
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	public double unitConversion(Units units, Double value) {
		return units.unitConversion(value);
	}

	public double unitAddition(Units unit1, double value1, Units unit2, double value2) {
		return unit1.unitConversion(value1) + unit2.unitConversion(value2);
	}
}