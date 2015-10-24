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
        amount = -223;
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
        amount = 1;
        //expected output for test case
        expResult = 3;
         //Call function to run test
        result = instance.dwarfMoneyQuest(amount);
        //compaire expected with returned value
        assertEquals(expResult, result);
    }

    /**
     * Test of calcMoneySaved method, of class MainCharacterControl.
     */
    @Test
    public void testCalcMoneySaved() {
        /***
         * Test case #1 (5 weeks, output 17.5 gold)
         */
        System.out.println("calcMoneySaved test case one");
        int weeks = 5;
        MainCharacterControl instance = new MainCharacterControl();
        float expResult = 17.5F;
        float result = instance.calcMoneySaved(weeks);
        assertEquals(expResult, result, 0.0);
        /***
         * Test case #2 (1 weeks, output 3.5 gold)
         * Lower Boundary
         */
        System.out.println("calcMoneySaved test case two");
        weeks = 1;
        expResult = 3.5F;
        result = instance.calcMoneySaved(weeks);
        assertEquals(expResult, result, 0.0);

        /***
         * Test case #3 (0 weeks, output -1 gold)
         * Invalid input test
         */
        System.out.println("calcMoneySaved test case three");
        weeks = 0;
        expResult = -1;
        result = instance.calcMoneySaved(weeks);
        assertEquals(expResult, result, 0.0);
        /***
         * Test case #4 (-10 weeks, output -1 gold)
         * Another invalid input test
         */
        System.out.println("calcMoneySaved test case four");
        weeks = -10;
        expResult = -1;
        result = instance.calcMoneySaved(weeks);
        assertEquals(expResult, result, 0.0);        
    }

}
