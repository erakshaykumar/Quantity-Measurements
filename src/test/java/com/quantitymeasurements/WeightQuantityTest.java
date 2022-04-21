/* @Purpose: As A Math Student, I Wish To Compare And Add Weights in gram
 * 1 kg = 1000 grams, 1 ton = 1000 kgs, 1 ton + 1000 gm = 1001 kg
 * @File: Quantity Measurement 
 * @Author: Akshay Kumar
 */
package com.quantitymeasurements;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WeightQuantityTest {

	private QuantityMeasurement quantityMeasurement;

	@Before
	public void init() {
		quantityMeasurement = new QuantityMeasurement();
	}

	/**
	 * Rigorous Test :- For Getting 0 Gram And 0 Gram Equality Check
	 */
	@Test
	public void given0Gramand0GramWhenEqual_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitConversion(WeightUnits.GRAM, 0.0);
		double value2 = quantityMeasurement.unitConversion(WeightUnits.GRAM, 0.0);
		Assert.assertEquals(value1, value2, 0);
	}

	/**
	 * Rigorous Test :- For Getting 1 Kg And 1000 Gram Equality Check
	 */
	@Test
	public void given1KGand1000GramsWhenEqual_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitConversion(WeightUnits.KG, 1.0);
		double value2 = quantityMeasurement.unitConversion(WeightUnits.GRAM, 1000.0);
		Assert.assertEquals(value1, value2, 0);
	}

	/**
	 * Rigorous Test :- For Getting 1 Ton And 1000 Kg Equality Check
	 */
	@Test
	public void given1Tonneand1000KGWhenEqual_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitConversion(WeightUnits.TONNE, 1.0);
		double value2 = quantityMeasurement.unitConversion(WeightUnits.KG, 1000.0);
		Assert.assertEquals(value1, value2, 0);
	}

	/**
	 * Rigorous Test :- For Getting 1 Ton And 1000 Gram Equals 1001 Kg Check
	 */
	@Test
	public void givenOneTonneAndThousandgramsWhenAdded_ShouldReturn1001KG() {
		double value1 = quantityMeasurement.unitAddition(WeightUnits.TONNE, 1.0, WeightUnits.GRAM, 1000.0);
		double value2 = quantityMeasurement.unitConversion(WeightUnits.KG, 1001.0);
		Assert.assertEquals(value1, value2, 0);
	}
}
