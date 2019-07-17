
package testexample;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author PC User
 */
public class TestExample {
    public int addNumber(int a, int b) {
        
    return a + b;
}
    public String addString(String c, String e) {
            return c + e;
    }
    
    public void assertMethodValidation() 
    {
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, actual);
    }
    
public void FailingTest_thenFailed() {
        
    fail("FAIL - test not completed");
}
    public void assertTrue() {
       Assert.assertTrue(30<20);
       
    }
    public void assertFalse() {
        Assert.assertFalse(10>20);
    }
 
    public void assertFail() {
    
       
    Assert.fail("Failes as intended");
}
    
    public void asserThat() {
     Assert.assertThat("123", CoreMatchers.is("123"));
    }
    public void assertSame() {
        String expected= "Bree";
        String actual = "Bella";
        Assert.assertSame(expected, actual);
    }
   public void assertNotSame() {
       String expected= "Bree";
        String actual = "Bella";
        Assert.assertNotSame(expected, actual);
    }
   public void assertNotNull() {
       String expected= "Bree";
       Assert.assertNotNull(expected);
   }
      public void assertNull() {
       String expected= "Bree";
       Assert.assertNull(expected);
      }
   }
    

    

