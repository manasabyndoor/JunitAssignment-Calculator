addition test cases
package com.capgemini;

import static org.junit.Assert.*;
import org.junit.Ignore;


import org.junit.Test;

import junit.framework.Assert;

public class AdditionTestCase {

	//two positive added
	@Test
	public void testTwoPostive() {
		Maths maths=new Maths();
		int answer=maths.add(2,2);
		Assert.assertEquals(4, answer,0);
		
	}
	//two negative added
	@Test
	public void testTwoNegative() {
		Maths maths=new Maths();
		int answer=maths.add(-2,-2);
		Assert.assertEquals(-4, answer,0);
		
	}
	//one positive one negative added
	@Test
	public void testOnepositivegraterOnenegative() {
		Maths maths=new Maths();
		int answer=maths.add(6,-2);
		Assert.assertEquals(4, answer,0);
		
	}
	@Test
	public void testOnenegativegreaterOnepositive() {
		Maths maths=new Maths();
		int answer=maths.add(-20,2);
		Assert.assertEquals(-18, answer,0);
		
	}

}
