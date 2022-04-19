/* @Purpose: As a math student, I wish to compare lengths 1ft = 12in 
 * TC 1.5 - 1: Null Check, 2: Reference Check, 3: Type Check
 * @File: Quantity Measurement 
 * @Author: Akshay Kumar
 */
package com.quantitymeasurements;

import org.junit.Assert;
import org.junit.Test;

/*
 * @Purpose: Compare Feet = Feet 
 * @Param: Values in Feet 
 * @Result: Boolean Result
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
}
