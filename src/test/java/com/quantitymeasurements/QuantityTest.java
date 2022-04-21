/* @Purpose: As a math student, I wish to compare lengths 
 * TC 1.12 - 1: Null Check, 2: Reference Check, 3: Type Check 4: Value Check For Equality.
 * @File: Quantity Measurement 
 * @Author: Akshay Kumar
 */
package com.quantitymeasurements;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * @Purpose: Compare Feet = Feet and Inch = Inch
 * @Param: Values in Feet And Inch
 * @Result: Boolean Results
 */
public class QuantityTest {

	private QuantityMeasurement quantityMeasurement;

	@Before
	public void init() {
		quantityMeasurement = new QuantityMeasurement();
	}

	/**
	 * Rigorous Test :- For Getting 0 Feet And 0 Feet Equality Check
	 */
	@Test
	public void given0Feetand0Feet_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.FEET, 0.0);
		double value2 = quantityMeasurement.unitComparision(Units.FEET, 0.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting 0 Feet And 1 Feet UnEquality Check
	 */
	@Test
	public void given0Feetand1Feet_ShouldReturnNotEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.FEET, 0.0);
		double value2 = quantityMeasurement.unitComparision(Units.FEET, 1.0);
		Assert.assertNotEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting Null Feet Value Check
	 */
	@Test
	public void givenNullFeetValue_shouldReturnFalse() {
		double value1 = quantityMeasurement.unitComparision(Units.FEET, 0.0);
		Assert.assertNotNull(value1);
	}

	/**
	 * Rigorous Test :- For Getting Reference Object When Same Return True Check
	 */
	@Test
	public void givenReferenceObject_WhenSame_ShouldReturnTrue() {
		Assert.assertSame(quantityMeasurement, quantityMeasurement);
	}

	/**
	 * Rigorous Test :- For Getting Reference Object When Not Same Return True Check
	 */
	@Test
	public void givenReferenceObject_WhenNotSame_ShouldReturnTrue() {
		QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
		Assert.assertNotSame(quantityMeasurement1, quantityMeasurement);
	}

	/**
	 * Rigorous Test :- For Getting Same Type Of Object Return Equal Check
	 */
	@Test
	public void giveSameTypesOfObjects_shouldReturnEqual() {
		QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
		Assert.assertEquals(quantityMeasurement1, quantityMeasurement1);
	}

	/**
	 * Rigorous Test :- For Getting Different Type Of Object Return NotEqual Check
	 */
	@Test
	public void giveDifferentTypesOfObjects_shouldReturnNotEqual() {
		QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
		QuantityTest quantityTest = new QuantityTest();
		Assert.assertNotEquals(quantityMeasurement1, quantityTest);
	}

	/**
	 * Rigorous Test :- For Getting Same Values In Different Object Return Equal
	 * Check
	 */
	@Test
	public void givenSameValuesInDifferentObjects_shouldReturnEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.FEET, 0.0);
		QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
		double value2 = quantityMeasurement1.unitComparision(Units.FEET, 0.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting Different Values In Different Object Return
	 * NotEqual Check
	 */
	@Test
	public void givenDifferentValuesInDifferentObjects_shouldReturnNotEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.FEET, 0.0);
		QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
		double value2 = quantityMeasurement1.unitComparision(Units.FEET, 1.0);
		Assert.assertNotEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting 0 Inch And 0 Inch Equality Check
	 */
	@Test
	public void given0Inchand0Inch_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.INCH, 0.0);
		double value2 = quantityMeasurement.unitComparision(Units.INCH, 0.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting 0 Inch And 1 Inch UnEquality Check
	 */
	@Test
	public void given0Inchand1Inch_ShouldReturnNotEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.INCH, 0.0);
		double value2 = quantityMeasurement.unitComparision(Units.INCH, 1.0);
		Assert.assertNotEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting Null Inch Value Check
	 */
	@Test
	public void givenInchObjectWhenComparedWithNullValue_shouldReturnFalse() {
		double value1 = quantityMeasurement.unitComparision(Units.INCH, 0.0);
		Assert.assertNotNull(value1);
	}

	/**
	 * Rigorous Test :- For Getting Reference Object When Same Return True Check
	 */
	@Test
	public void givenInchReferenceObject_WhenSame_ShouldReturnTrue() {
		Assert.assertSame(quantityMeasurement, quantityMeasurement);
	}

	/**
	 * Rigorous Test :- For Getting Reference Object When Not Same Return True Check
	 */
	@Test
	public void givenInchReferenceObject_WhenNotSame_ShouldReturnTrue() {
		QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
		Assert.assertNotSame(quantityMeasurement1, quantityMeasurement);
	}

	/**
	 * Rigorous Test :- For Getting Two Type Of Object When Not Equal Return True
	 * Check
	 */
	@Test
	public void givenTwoTypesOfObject_WhenNotEqual_ShouldReturnTrue() {
		QuantityTest quantityTest = new QuantityTest();
		Assert.assertNotEquals(quantityTest, quantityMeasurement);
	}

	/**
	 * Rigorous Test :- For Getting Two Same Value Type Of Different Object Return
	 * Equal Check
	 */
	@Test
	public void givenTwoSameValuesOfDifferentObjects_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.INCH, 0.0);
		double value2 = new QuantityMeasurement().unitComparision(Units.INCH, 0.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting Two Different Value Of Different Object Return
	 * Not Equal Check
	 */
	@Test
	public void givenTwoDifferentValuesOfDifferentObjects_ShouldReturnNotEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.INCH, 0.0);
		double value2 = new QuantityMeasurement().unitComparision(Units.INCH, 1.0);
		Assert.assertNotEquals(value1, value2, 0.0);
	}
}
