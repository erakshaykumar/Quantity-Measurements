/* @Purpose: As A Math Student, I Wish To Compare Weights
 * @File: Quantity Measurement 
 * @Author: Akshay Kumar
 */
package com.quantitymeasurements;

public enum WeightUnits {
	GRAM(1), KG(1000), TONNE(1000 * 1000);

	public double unit;

	WeightUnits(double units) {
		this.unit = units;
	}
}
