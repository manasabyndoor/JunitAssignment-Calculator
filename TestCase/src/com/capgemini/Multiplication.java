//multiplication test cases
package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Multiplication {

	// when 2 positive multiplied
	@Test
	public void Multiplicationtest2Psitive() {
		Maths math = new Maths();
		int answer = math.multiply(2, 2);

		Assert.assertEquals(4, answer);
	}

	// when two negative multiplied
	@Test
	public void Multiplication2negative() {
		Maths math = new Maths();
		int answer = math.multiply(-2, -2);

		Assert.assertEquals(4, answer);
	}

	// when one positive one negative multiplied
	@Test
	public void MultiplicationNegativegreater() {
		Maths math = new Maths();
		int answer = math.multiply(-8, 2);

		Assert.assertEquals(-16, answer);
	}

	// when one positive one negative multiplied
	@Test
	public void MultiplicationPositivegreater() {
		Maths math = new Maths();
		int answer = math.multiply(8, -2);

		Assert.assertEquals(-16, answer);
	}

}
