package com.stackroute.pe2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class StudentGradeTest {
	private static StudentGrade sg;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		sg = new StudentGrade();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		sg = null;

	}
	int[] arr ={86,65,98,77};
	@Test
	void testInput()
	{
	
		assertEquals(sg.isValid(20), true, "Student grade is between 1 and 100");
		assertEquals(sg.isValid(200), false, "Student grade is not between 1 and 100");
		assertNotEquals(sg.isValid(90), false, "Student grade is between 1 and 100");


	}

	void avgTest()
	{
		assertEquals("The average is 81.50",sg.AverageFunc(arr));

	}
	
	@Test
	void minTest()
	{
		assertEquals("The minimum is 65",sg.minFunc(arr));
	
	}
	
	@Test
	void maxTest()
	{
		assertEquals("The maximum is 98",sg.maxFunc(arr));
	
	}
}
