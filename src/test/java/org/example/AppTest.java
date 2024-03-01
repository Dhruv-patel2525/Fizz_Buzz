package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
import static org.example.App.FizzBuzz;
public class AppTest extends TestCase
{

    public void testFizzBuzz()
    {

        assertEquals("1",FizzBuzz(1));
        assertEquals("Fizz",FizzBuzz(3));
    }
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
