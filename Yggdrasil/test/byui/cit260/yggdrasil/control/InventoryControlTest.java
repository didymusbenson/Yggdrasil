/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.control;

import byui.cit260.yggdrasil.model.Item;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tsunami
 */
public class InventoryControlTest {

    public InventoryControlTest() {
    }

    /**
     * Test of sellItem method, of class InventoryControl.
     */
    @Test
    public void testSellItem() {
        /**
         * *****************************
         * TEST CASE #1
         ******************************
         */

        System.out.println("sellItem test case #1");
        Item potion = new Item();

        potion.setItemBuyPrice(10);
        potion.setItemsUsed(11);

        int quantity = 12;
        InventoryControl instance = new InventoryControl();
        int expResult = 55;
        int result = instance.sellItem(potion, quantity);
        assertEquals(expResult, result);

        /**
         * *****************************
         * TEST CASE #2
         ******************************
         */
        System.out.println("sellItem test case #2");
        Item dagger = new Item();

        dagger.setItemBuyPrice(20);
        dagger.setItemsUsed(2);

        quantity = 1;

        expResult = 10;
        result = instance.sellItem(dagger, quantity);
        assertEquals(expResult, result);
        
         /**
         * *****************************
         * TEST CASE #3
         ******************************
         */
        System.out.println("sellItem test case #3");

        potion.setItemsUsed(10);

        quantity = -10;

        expResult = -1;
        result = instance.sellItem(potion, quantity);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
         /**
         * *****************************
         * TEST CASE #4
         ******************************
         */
        System.out.println("sellItem test case #4");

        potion.setItemsUsed(1);

        quantity = 1;

        expResult = 5;
        result = instance.sellItem(potion, quantity);
        assertEquals(expResult, result); 
         /**
         * *****************************
         * TEST CASE #5
         ******************************
         */
        System.out.println("sellItem test case #4");

        dagger.setItemsUsed(99);

        quantity = 99;

        expResult = 990;
        result = instance.sellItem(dagger, quantity);
        assertEquals(expResult, result);
    }

}
