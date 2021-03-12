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
public class Array_High_NumbersTest {
    
    public Array_High_NumbersTest() {
    }
    
    @Test
    public void testArrayCountReturn() {
        System.out.println("arrayCountReturn");
        int[] intArray = {1 , 3 , 5 ,7 ,9};
        int number = 4;
        Integer expResult = 3;
        Integer result = Array_High_Numbers.arrayCountReturn(intArray, number);
        assertEquals(expResult, result);
    }
    
}
