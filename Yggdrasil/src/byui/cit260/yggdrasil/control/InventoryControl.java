/*
 * Program type: Contorl Class
 * Creation: 9/21/2015 at 9:22
 * Description: This is the main that allows the game to be played. 
 *              His actual name is suppose to be Pothoc though.
 */
package byui.cit260.yggdrasil.control;

import byui.cit260.yggdrasil.model.Item;
import java.io.Serializable;

/**
 *
 * @author Didymus Benson & Brock Hodgson
 */
public class InventoryControl implements Serializable {

    public int sellItem(String itemName, int quantity) {
        Item item = getItem(itemName);
        
        //initialize the totalSale variable
        int totalSale;
        
        //invalid item name error
        if (item == null) {
            return -1;
        }
        
        //declare local vars to simplify the rest of the function
        int used = item.getItemsUsed();
        int value = item.getItemSellPrice();
        
        //invalid quantity error
        if (quantity <= 0) {
            return -1;
        }
        
        //lower quantity based on items actually in use
        if (quantity > used) {
            quantity = used;
        }
        
        
        // Rounds up if value of item is odd.
        totalSale = (int) (.5 * value * quantity);
        return totalSale;
    }

}
