package com.stackroute.pe2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
public class isEvenTest {


	@Test	
	void testEven()
	{

		assertEquals(
				"isEven returns true when passed 2, because it is even",true, EvenNumTest.isEven(2)
				);
		assertEquals(
				"isEven returns true when passed 3, because it is odd",false, EvenNumTest.isEven(3)
				);
		
		assertNotEquals(
				"isEven returns false because 3 is odd.",
				true,EvenNumTest.isEven(3)
				);

	

	}
}
