package exemplo.hello;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigourous Test :-)
     */
	@Test
    public void testApp()
    {
        String expected = "Hello, World!";
		String actual = App.getGreeting();
		assertTrue( expected.equals(actual) );
    }
}
