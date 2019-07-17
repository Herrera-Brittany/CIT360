package testexample;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;

/**
 *
 * @author PC User
 */
public class TestExampleIT {
    
    public TestExampleIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAddNumber() {
        int a = 6;
        int b = 8;
       TestExample test = new TestExample();
       int result = test.addNumber(a, b);
       assertEquals(14, result);
    }
 

    @Test
    public void testAddString1() {
        TestExample test1 = new TestExample();
        String result1 = test1.addString("Hello", "Bree");
        assertEquals("HelloBree" , result1);
    }
@Test
 public void assertSame() {
        String expected= "Bree";
        String actual = "Bree";
        Assert.assertSame(expected, actual);
    }
 
 @Test
   public void assertNotSame() {
       String expected= "Bree";
        String actual = "Bella";
        Assert.assertNotSame(expected, actual);
    }
 @Test
    public void assertNotNull() {
       String expected= "Bree";
       Assert.assertNotNull(expected);
   }
    @Test   
    public void assertNull() {
       String expected= null;
       Assert.assertNull(expected);
   }
    
//@Test
//public void assertFail() {
//    Assert.fail("Failes as intended");
//}
@Test
public void assertTrue() {
    int a = 30;
    int b = 20;
       Assert.assertTrue(a>b);
}
@Test
public void assertFalse() {
    int a = 10;
    int b = 20;
  
        Assert.assertFalse(a>b);
}
@Test
public void asserThat() {
     Assert.assertThat("123", CoreMatchers.is("123"));
 }
    
@Test
    public void assertMethodsValidation() {
        int[] expected = {1,2,3,4,5};
        int[] actual = {1,2,3,4,5};
        Assert.assertArrayEquals(expected, actual);
    }}