/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author amaro
 */
public class Array_FunctionsTest {
    
    public Array_FunctionsTest() {
    }

    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        int[] intArray = {1, 2, 3, 4, 5};
        Integer expResult = 15;
        Integer result = Array_Functions.getTotal(intArray);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        int[] intArray = {1, 2, 3, 4, 5};
        Integer expResult = 3;
        Integer result = Array_Functions.getAverage(intArray);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetHighest() {
        System.out.println("getHighest");
        int[] intArray = {1, 2, 3, 4, 5};
        Integer expResult = 5;
        Integer result = Array_Functions.getHighest(intArray);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetLowest() {
        System.out.println("getLowest");
        int[] intArray = {1, 2, 3, 4, 5};
        Integer expResult = 1;
        Integer result = Array_Functions.getLowest(intArray);
        assertEquals(expResult, result);
    }
    
}
