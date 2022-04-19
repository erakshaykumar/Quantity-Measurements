/* @Purpose: As a math student, I wish to compare lengths 1ft = 12in 
 * TC 1.11 - 1: Null Check, 2: Reference Check, 3: Type Check.
 * @File: Quantity Measurement 
 * @Author: Akshay Kumar
 */
package com.quantitymeasurements;

import org.junit.Assert;
import org.junit.Test;

/*
 * @Purpose: Compare Feet = Feet and Inch = Inch
 * @Param: Values in Feet And Inch
 * @Result: Boolean Results
 */
public class QuantityTest {
	/**
	 * Rigorous Test :- For Getting 0 Feet And 0 Feet Equality Check
	 */
	@Test
	public void given0Feetand0Feet_ShouldReturnEqual() {
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(0.0);
		Assert.assertEquals(feet1, feet2);
	}

	/**
	 * Rigorous Test :- For Getting 0 Feet And 1 Feet UnEquality Check
	 */
	@Test
	public void given0Feetand1Feet_ShouldReturnNotEqual() {
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(1.0);
		Assert.assertNotEquals(feet1, feet2);
	}

	/**
	 * Rigorous Test :- For Getting Null Feet Value Check
	 */
	@Test
	public void givenNullFeetValue_shouldReturnFalse() {
		Feet feet = new Feet(0.0);
		Assert.assertFalse(feet.equals(null));
		Assert.assertNotNull(feet);
		Assert.assertNotEquals(null, feet);
	}

	/**
	 * Rigorous Test :- For Getting Reference Object When Same Return True Check
	 */
	@Test
	public void givenReferenceObject_WhenSame_ShouldReturnTrue() {
		Feet feet = new Feet();
		Assert.assertSame(feet, feet);
	}

	/**
	 * Rigorous Test :- For Getting Reference Object When Not Same Return True Check
	 */
	@Test
	public void givenReferenceObject_WhenNotSame_ShouldReturnTrue() {
		Feet feet = new Feet(0.0);
		Feet feet1 = new Feet(0.0);
		Assert.assertNotSame(feet, feet1);
	}

	/**
	 * Rigorous Test :- For Getting Same Type Of Object Return Equal Check
	 */
	@Test
	public void giveSameTypesOfObjects_shouldReturnEqual() {
		Feet feet = new Feet();
		Assert.assertEquals(feet, feet);
	}

	/**
	 * Rigorous Test :- For Getting Different Type Of Object Return NotEqual Check
	 */
	@Test
	public void giveDifferentTypesOfObjects_shouldReturnNotEqual() {
		Feet feet = new Feet();
		Inch inch = new Inch();
		Assert.assertNotEquals(feet, inch);
	}

	/**
	 * Rigorous Test :- For Getting Different Value In Different Object Return Equal
	 * Check
	 */
	@Test
	public void givenSameValuesInDifferentObjects_shouldReturnEqual() {
		Feet feet = new Feet();
		feet.setValue(2);
		Feet feet1 = new Feet();
		feet1.setValue(2);
		Assert.assertEquals(feet.getValue(), feet1.getValue(), 0.0);
	}

	/**
	 * Rigorous Test :- For Getting Different Value In Different Object Return
	 * NotEqual Check
	 */
	@Test
	public void givenDifferentValuesInDifferentObjects_shouldReturnNotEqual() {
		Feet feet = new Feet();
		feet.setValue(5);
		Feet feet1 = new Feet();
		feet1.setValue(7);
		Assert.assertNotEquals(feet.getValue(), feet1.getValue(), 0.0);
	}

	/**
	 * Rigorous Test :- For Getting 0 Inch And 0 Inch Equality Check
	 */
	@Test
	public void given0Inchand0Inch_ShouldReturnEqual() {
		Inch inch1 = new Inch(0.0);
		Inch inch2 = new Inch(0.0);
		Assert.assertEquals(inch1, inch2);
	}

	/**
	 * Rigorous Test :- For Getting 0 Inch And 1 Inch UnEquality Check
	 */
	@Test
	public void given0Inchand1Inch_ShouldReturnNotEqual() {
		Inch inch1 = new Inch(0.0);
		Inch inch2 = new Inch(1.0);
		Assert.assertNotEquals(inch1, inch2);
	}

	/**
	 * Rigorous Test :- For Getting Null Inch Value Check
	 */
	@Test
	public void givenInchObjectWhenComparedWithNullValue_shouldReturnFalse() {
		Inch inch1 = new Inch(0.0);
		Assert.assertFalse(inch1.equals(null));
		Assert.assertNotNull(inch1);
		Assert.assertNotEquals(null, inch1);
	}

	/**
	 * Rigorous Test :- For Getting Reference Object When Same Return True Check
	 */
	@Test
	public void givenInchReferenceObject_WhenSame_ShouldReturnTrue() {
		Inch inch = new Inch(0.0);
		Assert.assertSame(inch, inch);
	}

	/**
	 * Rigorous Test :- For Getting Reference Object When Not Same Return True Check
	 */
	@Test
	public void givenInchReferenceObject_WhenNotSame_ShouldReturnTrue() {
		Inch inch = new Inch(0.0);
		Inch inch1 = new Inch(0.0);
		Assert.assertNotSame(inch, inch1);
	}

	/**
	 * Rigorous Test :- For Getting Two Same Type Of Object Return Equal Check
	 */
	@Test
	public void giveTwoSameTypesOfObjects_shouldReturnEqual() {
		Inch inch = new Inch();
		Assert.assertEquals(inch, inch);
	}

	/**
	 * Rigorous Test :- For Getting Two Different Type Of Object Return Equal Check
	 */
	@Test
	public void givenTwoTypesOfObject_WhenNotEqual_ShouldReturnNotEquals() {
		Inch inch = new Inch(0.0);
		Feet feet = new Feet(0.0);
		Assert.assertNotEquals(inch, feet);
	}

}
