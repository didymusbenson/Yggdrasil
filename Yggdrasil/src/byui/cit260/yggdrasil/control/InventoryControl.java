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

    public void addToInventory(Item item){
        int itemsHeld = item.getItemsUsed();
        if (itemsHeld == 99)
            return; // Don't add item.
        item.setItemsUsed(itemsHeld++);
    }
    
    public void removeFromInventory(Item item){
        int itemsHeld = item.getItemsUsed();
        if (itemsHeld == 0)
            return; // Don't remove item.
        item.setItemsUsed(itemsHeld--);
    }    
    
    
    public int buyItem(Item item, int quantity){
        //initialize the totalSale variable
        int totalSale;
        //declare local vars to simplify the rest of the function
        int used = item.getItemsUsed();
        int value = item.getItemBuyPrice();
        //invalid quantity error
        if (quantity <= 0) {
            return -1;
        }
        //Maximum "items used" number is 99
        if (quantity > (99 - used)) {
            quantity = (99 - used);
        }
        // Rounds up if value of item is odd.
        totalSale = value * quantity;
        return totalSale;
    }
    
    public int sellItem(Item item, int quantity) {
        
        //initialize the totalSale variable
        int totalSale;
        //declare local vars to simplify the rest of the function
        int used = item.getItemsUsed();
        int value = item.getItemBuyPrice();
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
