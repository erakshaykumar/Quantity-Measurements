/* @Purpose: As A Math Student, I Wish To Compare Weights
 * @File: Quantity Measurement 
 * @Author: Akshay Kumar
 */
package com.quantitymeasurements;

/*
 * @Purpose: Enum Length Units Values
 * 
 * @Param: Object Unit Values
 */
public enum WeightUnits implements Units {
	GRAM(1), KG(1000), TONNE(1000 * 1000);

	public double unit;

	WeightUnits(double units) {
		this.unit = units;
	}

	@Override
	public double unitConversion(Double value) {
		return unit * value;
	}
}
