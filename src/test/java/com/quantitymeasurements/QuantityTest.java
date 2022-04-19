/* @Purpose: As a math student, I wish to compare lengths 1ft = 12in 
 * TC 1.3 - 1: Null Check
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
}
