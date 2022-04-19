/* @Purpose: As a math student, I wish to compare lengths 1ft = 12in 
 * TC 1.1 - Given 0 Feet and 0 Feet Should Return equal
 * @File: Quantity Measurement 
 * @Author: Akshay Kumar
 */
package com.quantitymeasurements;

import org.junit.Assert;
import org.junit.Test;

/*
 * @Purpose: Compare 0 Feet = 0 Feet 
 * @Param: 0.0 Feet 
 * @Result: Boolean result
 */
public class QuantityTest {
	/**
	 * Rigorous Test :- For Getting 0 Feet And 0 Feet Equality
	 */
	@Test
	public void given0Feetand0Feet_ShouldReturnEqual() {
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(0.0);
		Assert.assertEquals(feet1, feet2);
	}

}
