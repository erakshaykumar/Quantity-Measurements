/* @Purpose: As A Math Student, I Wish To Compare Volume
 * 0 gallon = 0 gallon, 1 gallon = 3.78 liters, 1 gallon = 3.78 liters 
 * 1 gallon + 3.78 liters = 7.57 liters, 1 liter + 1000 ml = 2 liters
 * @File: Quantity Measurement 
 * @Author: Akshay Kumar
 */
package com.quantitymeasurements;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VolumeQuantityTest {
	private QuantityMeasurement quantityMeasurement;

	@Before
	public void init() {
		quantityMeasurement = new QuantityMeasurement();
	}

	/**
	 * Rigorous Test :- For Getting 0 Gallon And 0 Gallon Equality Check
	 */
	@Test
	public void given0Gallonand0GallonWhenEqual_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitConversion(VolumeUnits.GALLON, 0.0);
		double value2 = quantityMeasurement.unitConversion(VolumeUnits.GALLON, 0.0);
		Assert.assertEquals(value1, value2, 0);
	}

	/**
	 * Rigorous Test :- For Getting 1 Gallon And 3.78 Liters Equality Check
	 */
	@Test
	public void given1GallonandThreepointSevenEightLitersWhenEqual_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitConversion(VolumeUnits.GALLON, 1.0);
		double value2 = quantityMeasurement.unitConversion(VolumeUnits.LITER, 3.78);
		Assert.assertEquals(value1, value2, 0);
	}

	/**
	 * Rigorous Test :- For Getting 1 Liter And 1000 Ml Equality Check
	 */
	@Test
	public void given1litreand1000MilliLitersWhenEqual_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitConversion(VolumeUnits.LITER, 1.0);
		double value2 = quantityMeasurement.unitConversion(VolumeUnits.MILLILITER, 1000.0);
		Assert.assertEquals(value1, value2, 0);
	}

	/**
	 * Rigorous Test :- For Getting 1 Gallon And 3.78 Liter Equals 7.56 Liter Check
	 */
	@Test
	public void givenOneGallonAndThreePointSevenEightLitersWhenAdded_ShouldReturnSevenPointFiveSixLiters() {
		double value1 = quantityMeasurement.unitAddition(VolumeUnits.GALLON, 1.0, VolumeUnits.LITER, 3.78);
		double value2 = quantityMeasurement.unitConversion(VolumeUnits.LITER, 7.56);
		Assert.assertEquals(value1, value2, 0);
	}

	/**
	 * Rigorous Test :- For Getting 1 Liter And 1000 Ml Equals 2 Liter Check
	 */
	@Test
	public void givenOneLitreAndThousandMillilitersWhenAdded_ShouldReturnTwoLiters() {
		double value1 = quantityMeasurement.unitAddition(VolumeUnits.LITER, 1.0, VolumeUnits.MILLILITER, 1000);
		double value2 = quantityMeasurement.unitConversion(VolumeUnits.LITER, 2.0);
		Assert.assertEquals(value1, value2, 0);
	}

}
