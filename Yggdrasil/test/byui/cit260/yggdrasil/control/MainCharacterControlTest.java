/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brock
 */
public class MainCharacterControlTest {

    public MainCharacterControlTest() {
    }

    /**
     * Test of dwarfMoneyQuest method, of class MainCharacterControl.
     */
    @Test
    public void testDwarfMoneyQuest() {
        System.out.println("dwarfMoneyQuest");
        /**
         * Test Case 1 
         */
        System.out.println("/tTest case #1");
        //input value for test case
        int amount = 10;
        //expected output for test case
        int expResult = 30;
        //create instance of class
         MainCharacterControl instance = new MainCharacterControl();
         //Call function to run test
        int result = instance.dwarfMoneyQuest(amount);
        //compaire expected with returned value
        assertEquals(expResult, result);
        
        /**
         * Test Case 2 
         */
        System.out.println("/tTest case #2");
        //input value for test case
        amount = 15;
        //expected output for test case
        expResult = 45;
         //Call function to run test
        result = instance.dwarfMoneyQuest(amount);
        //compaire expected with returned value
        assertEquals(expResult, result);
        
        /**
         * Test Case 3 
         */
        System.out.println("/tTest case #3");
        //input value for test case
        amount = 8;
        //expected output for test case
        expResult = 24;
         //Call function to run test
        result = instance.dwarfMoneyQuest(amount);
        //compaire expected with returned value
        assertEquals(expResult, result);
        
        /**
         * Test Case 4 
         */
        System.out.println("/tTest case #4");
        //input value for test case
        amount = jello;
        //expected output for test case
        expResult = -1;
         //Call function to run test
        result = instance.dwarfMoneyQuest(amount);
        //compaire expected with returned value
        assertEquals(expResult, result);
        
        /**
         * Test Case 5 
         */
        System.out.println("/tTest case #5");
        //input value for test case
        amount = -223;
        //expected output for test case
        expResult = -1;
         //Call function to run test
        result = instance.dwarfMoneyQuest(amount);
        //compaire expected with returned value
        assertEquals(expResult, result);
        
        /**
         * Test Case 6 
         */
        System.out.println("/tTest case #6");
        //input value for test case
        amount = 1.8;
        //expected output for test case
        expResult = -1;
         //Call function to run test
        result = instance.dwarfMoneyQuest(amount);
        //compaire expected with returned value
        assertEquals(expResult, result);
        
        /**
         * Test Case 7 
         */
        System.out.println("/tTest case #7");
        //input value for test case
        amount = 1;
        //expected output for test case
        expResult = 5;
         //Call function to run test
        result = instance.dwarfMoneyQuest(amount);
        //compaire expected with returned value
        assertEquals(expResult, result);
    }

}
