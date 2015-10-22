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
    }

}
