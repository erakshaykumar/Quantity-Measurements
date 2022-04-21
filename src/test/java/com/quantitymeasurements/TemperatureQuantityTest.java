/* @Purpose: As A Math Student, I Need To Equate Temperature In FAHRENHEIT And CELSIOUS
 * @File: Quantity Measurement 
 * @Author: Akshay Kumar
 */
package com.quantitymeasurements;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureQuantityTest {

	static QuantityMeasurement quantityMeasurement = new QuantityMeasurement();

	/**
	 * Rigorous Test :- For Getting 0 Celsius And 0 Celcius Equality Check
	 */
	@Test
	public void given0celsiusAnd0celsius_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIUS, 0.0);
		double value2 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIUS, 0.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting 0 Celsius And 1 Celcius UnEquality Check
	 */
	@Test
	public void given0celsiusAnd1cesius_ShouldReturnNotEqual() {
		double value1 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIUS, 0.0);
		double value2 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIUS, 1.0);
		Assert.assertNotEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting 1 Celsius And 1 Celcius Equality Check
	 */
	@Test
	public void given1celsiusAnd1cesius_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIUS, 1.0);
		double value2 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIUS, 1.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting 0 Celsius And 1 Fahrenheit UnEquality Check
	 */
	@Test
	public void given0celsiusAnd1fahrenheit_ShouldReturnNotEqual() {
		double value1 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIUS, 0.0);
		double value2 = quantityMeasurement.unitConversion(TemperatureUnits.FAHRENHEIT, 1.0);
		Assert.assertNotEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting 100 Celsius And 212 Fahrenheit Equality Check
	 */
	@Test
	public void given100celsiousAnd212fahrenheit_ShouldReturnNotEqual() {
		double value1 = quantityMeasurement.unitConversion(TemperatureUnits.CELSIUS, 100.0);
		double value2 = quantityMeasurement.unitConversion(TemperatureUnits.FAHRENHEIT, 212.0);
		Assert.assertEquals(value1, value2, 0.0);
	}
}
