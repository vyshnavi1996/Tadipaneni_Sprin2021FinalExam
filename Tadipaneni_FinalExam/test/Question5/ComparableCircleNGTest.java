/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class ComparableCircleNGTest {
    
    public ComparableCircleNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of compareTo method, of class ComparableCircle.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        ComparableCircle circle1 = new ComparableCircle(1.4);
        ComparableCircle circle2 = new ComparableCircle(1.3);
        int expResult = 1;
        
        int result = circle1.compareTo(circle2);
        System.out.println("compareTo" + result);
        
        assertEquals(result, expResult);
        fail("Circle 1 is larger than Circle 2");
    }
    
}