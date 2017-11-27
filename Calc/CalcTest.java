package calc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcTest {
    
    public CalcTest() {
      
        String str1=null;
        String str2="abc";
        
        assertNull(str1);
        assertNotNull(str2);
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("BEFORE CLASS");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("AFTER CLASS");
    }
    
    @Before
    public void setUp() {
        System.out.println("BEFORE");
    }
    
    @After
    public void tearDown() {
        System.out.println("AFTER");
    }

 
    @Test
    public void testAdd() {
        System.out.println("add");
        int firstDigit = 3;
        int secondDigit = 6;
        Calc instance = new Calc();
        int expResult = 9;
        int result = instance.add(firstDigit, secondDigit);
        assertEquals(expResult, result);
     
    }

    
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int firstDigit = 3;
        int secondDigit = 6;
        Calc instance = new Calc();
        int expResult = 18;
        int result = instance.multiply(firstDigit, secondDigit);
        //assertEquals(expResult, result);
        assertTrue(instance.multiply(firstDigit, secondDigit)==expResult);
    
    }

    
    @Test
    public void testShare() {
        System.out.println("share");
        int firstDigit = 9;
        int secondDigit = 3;
        Calc instance = new Calc();
        int expResult = 3;
        int result = instance.share(firstDigit, secondDigit);
        //assertEquals(expResult, result);
        assertFalse(instance.share(firstDigit, secondDigit)!=expResult);
      
    }

    
    @Test
    public void testSetFirstDigit() {
        System.out.println("setFirstDigit");
        int firstDigit = 7;
        Calc instance = new Calc();
        instance.setFirstDigit(firstDigit);
    
    }

    
    @Test
    public void testSetSecondDigit() {
        System.out.println("setSecondDigit");
        int secondDigit = 7;
        Calc instance = new Calc();
        instance.setSecondDigit(secondDigit);
     
    }

    
    @Test
    public void testGetFirstDigit() {
        System.out.println("getFirstDigit");
        Calc instance = new Calc();
        int expResult = 0;
        int result = instance.getFirstDigit();
        assertEquals(expResult, result);
       // assertNotNull(result);
        
    }

    
    @Test
    public void testGetSecondDigit() {
        System.out.println("getSecondDigit");
        Calc instance = new Calc();
        int expResult = 0;
        int result = instance.getSecondDigit();
        assertEquals(expResult, result);
        
    }

   
    
    
    
    
}
