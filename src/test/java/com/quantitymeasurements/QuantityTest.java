/* @Purpose: As a math student, I want to be able to add two lengths in inches
 * 2in + 2in = 4in, 1ft + 2in = 14in
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

	/**
	 * Rigorous Test :- After Getting Re-factor Checking 0 Feet and 0 Inch Equality
	 */
	@Test
	public void given0Feetand0Inch_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.FEET, 0.0);
		double value2 = quantityMeasurement.unitComparision(Units.INCH, 0.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- After Getting Re-factor Checking 0 Feet and 1 Inch Equality
	 */
	@Test
	public void given0Feetand1Inch_ShouldReturnNotEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.FEET, 0.0);
		double value2 = quantityMeasurement.unitComparision(Units.INCH, 1.0);
		Assert.assertNotEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- After Getting Re-factor Checking 1 Feet and 0 Inch Equality
	 */
	@Test
	public void given1Feetand0Inch_ShouldReturnNotEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.FEET, 1.0);
		double value2 = quantityMeasurement.unitComparision(Units.INCH, 0.0);
		Assert.assertNotEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- After Getting Re-factor Checking 1 Feet and 1 Inch Return
	 * Not Equal
	 */
	@Test
	public void given1Feetand1Inch_ShouldReturnNotEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.FEET, 1.0);
		double value2 = quantityMeasurement.unitComparision(Units.INCH, 1.0);
		Assert.assertNotEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- After Getting Re-factor Checking 1 Feet and 12 Inch Return
	 * Equal
	 *
	 */
	@Test
	public void given1Feetand12Inch_ShouldReturnEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.FEET, 1.0);
		double value2 = quantityMeasurement.unitComparision(Units.INCH, 12.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting 0 Yard And 0 Yard Equality Check
	 */
	@Test
	public void given0yardand0yard_shouldReturnEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.YARD, 0.0);
		double value2 = quantityMeasurement.unitComparision(Units.YARD, 0.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting 0 Yard And 1 Yard Equality Check
	 */
	@Test
	public void given0yardand1yard_shouldReturnEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.YARD, 0.0);
		double value2 = quantityMeasurement.unitComparision(Units.YARD, 1.0);
		Assert.assertNotEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting 3 Feet And 1 Yard Equality Check
	 */
	@Test
	public void given3ftand1yd_shouldReturnEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.FEET, 3);
		double value2 = quantityMeasurement.unitComparision(Units.YARD, 1);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting 1 Feet And 1 Yard Equality Check
	 */
	@Test
	public void given1ftand1yd_shouldReturnNotEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.FEET, 1);
		double value2 = quantityMeasurement.unitComparision(Units.YARD, 1);
		Assert.assertNotEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting 1 Inch And 1 Yard Equality Check
	 */
	@Test
	public void given1inand1yd_shouldReturnNotEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.INCH, 1);
		double value2 = quantityMeasurement.unitComparision(Units.YARD, 1);
		Assert.assertNotEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting 1 Yard And 36 Inch Equality Check
	 */
	@Test
	public void given1ydand36in_shouldReturnEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.YARD, 1);
		double value2 = quantityMeasurement.unitComparision(Units.INCH, 36);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting 36 Inch And 1 Yard Equality Check
	 */
	@Test
	public void given36inand1yd_shouldReturnEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.INCH, 36);
		double value2 = quantityMeasurement.unitComparision(Units.YARD, 1);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting 1 Yard And 3 Feet Equality Check
	 */
	@Test
	public void given1ydand3ft_shouldReturnEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.YARD, 1);
		double value2 = quantityMeasurement.unitComparision(Units.FEET, 3);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting 0 CM And 0 CM Equality Check
	 */
	@Test
	public void given0cmAnd0cm_shouldReturnEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.CM, 0.0);
		double value2 = quantityMeasurement.unitComparision(Units.CM, 0.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting 0 CM And 1 CM Equality Check
	 */
	@Test
	public void given0cmAnd1cm_shouldReturnNotEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.CM, 0.0);
		double value2 = quantityMeasurement.unitComparision(Units.CM, 1.0);
		Assert.assertNotEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting 2 Inch And 5 CM Equality Check
	 */
	@Test
	public void given2inAnd5cm_shouldReturnEqual() {
		double value1 = quantityMeasurement.unitComparision(Units.INCH, 2.0);
		double value2 = quantityMeasurement.unitComparision(Units.CM, 5.0);
		Assert.assertEquals(value1, value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting 2 Inch And 2 Inch Equals 4 Check
	 */
	@Test
	public void givenTwoInchAndTwoInch_WhenAdded_ShouldReturnFourInch() {
		double value1 = quantityMeasurement.unitComparision(Units.INCH, 2.0);
		double value2 = quantityMeasurement.unitComparision(Units.INCH, 2.0);
		double value3 = quantityMeasurement.unitComparision(Units.INCH, 4);
		Assert.assertEquals(value3, value1 + value2, 0.0);
	}

	/**
	 * Rigorous Test :- For Getting 1 Feet And 2 Inch Equals 14 Inch Check
	 */
	@Test
	public void givenOneFeetAndTwoInch_WhenAdded_ShouldReturnFourteenInch() {
		double value1 = quantityMeasurement.unitComparision(Units.FEET, 1);
		double value2 = quantityMeasurement.unitComparision(Units.INCH, 2.0);
		double value3 = quantityMeasurement.unitComparision(Units.INCH, 14.0);
		Assert.assertEquals(value3, value1 + value2, 0.0);
	}

}
