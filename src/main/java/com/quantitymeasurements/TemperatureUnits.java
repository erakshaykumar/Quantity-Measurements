/* @Purpose: As A Math Student, I Need To Equate Temperature In FAHRENHEIT And CELSIOUS
 * @File: Quantity Measurement 
 * @Author: Akshay Kumar
 */
package com.quantitymeasurements;

import java.util.function.Function;

/*
 * @Purpose: Enum Length Units Values
 * 
 * @Param: Object Unit Values
 */
public enum TemperatureUnits implements Units {
	CELSIUS(false), FAHRENHEIT(true);

	final Function<Double, Double> degFToCelcius = (degF) -> {
		return ((degF.doubleValue() - 32) * 5 / 9);
	};

	final Function<Double, Double> degCToCelcius = (degC) -> {
		return degC.doubleValue();
	};
	private final Function<Double, Double> conversion_value;

	TemperatureUnits(boolean isFahrenheit) {
		if (isFahrenheit) {
			this.conversion_value = degFToCelcius;
		} else {
			this.conversion_value = degCToCelcius;
		}
	}

	@Override
	public double unitConversion(Double value) {
		return conversion_value.apply(value);
	}
}
