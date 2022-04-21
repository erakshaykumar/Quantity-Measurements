/* @Purpose: As A Math Student, I Wish To Compare Lengths And Volume
 * @File: Quantity Measurement 
 * @Author: Akshay Kumar
 */
package com.quantitymeasurements;

public class QuantityMeasurement {
	double feet;
	double inch;

	public double unitComparision(LengthUnits units, double value) {
		return units.unit * value;
	}

	public double unitConversion(VolumeUnits units, Double value) {
		return units.unit * value;
	}

	/*
	 * @Purpose: Compare Units Value
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
		QuantityMeasurement that = (QuantityMeasurement) obj;
		return Double.compare(that.feet, feet) == 0 && Double.compare(that.inch, inch) == 0;
	}

}
