package com.stackroute.pe2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {

	@Before
    public void setUp()
    {	    }

    @After
    public void tearDown()
    {
    }
   
   
    @Test
    public void testFact1()
    {   int result=Factorial.fact(1);
        assertEquals("The factorial of 1 is 1", 1,result);
    }

 
    @Test
    public void testFact2()
    {int result=Factorial.fact(2);
        assertEquals("The factorial of 2 is 2", result);
    }

 
    @Test
    public void testFact12()
    {int result=Factorial.fact(12);
        assertEquals("The factorial of 12 is 479001600", result);
    }
    
    @Test
    public void testFact13()
    {
        assertEquals("The factorial of 13 is out of range", Factorial.fact(13));
    }
    
    @Test
    public void testLongFact()
    {
        assertEquals("The factorial of 20 is is 2432902008176640000.", Factorial.longFactorial(20));
    }
    
    @Test
    public void testLongFactout()
    {
        assertEquals("The factorial of 21 is out of range.", Factorial.longFactorial(21));
    }
  
  

}
