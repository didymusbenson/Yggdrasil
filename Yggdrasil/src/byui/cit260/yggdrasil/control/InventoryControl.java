/*
 * Program type: Contorl Class
 * Creation: 9/21/2015 at 9:22
 * Description: This is the main that allows the game to be played. 
 *              His actual name is suppose to be Pothoc though.
 */
package byui.cit260.yggdrasil.control;

import Exceptions.InventoryControlException;
import byui.cit260.yggdrasil.model.Item;
import java.io.Serializable;

/**
 *
 * @author Didymus Benson & Brock Hodgson
 */
public class InventoryControl implements Serializable {

    public static Item[] createGameInventory() {
        //INITIALIZE THE ARRAY OF ITEMS THAT MAKE UP THE ENTIRE GAME
        Item[] items = new Item[7];

        //constructor format:  public Item(int type, int price, int modifier)
        Item potion = new Item("Potion", 1, 10, 30);
        items[0] = potion;

        Item hiPotion = new Item("Hi-Potion", 1, 30, 100);
        items[1] = hiPotion;

        Item fullPotion = new Item("Full Potion", 1, 100, 9999); // Player health never exceeds 9999
        items[2] = fullPotion;

        Item dagger = new Item("Dagger", 3, 20, 5);
        items[3] = dagger;

        Item sword = new Item("Sword", 3, 50, 10);
        items[4] = sword;

        Item greatSword = new Item("Greatsword", 3, 100, 15);
        items[5] = greatSword;

        Item ultimaSword = new Item("Ultima Sword", 3, 500, 25);
        items[6] = ultimaSword;

        Item fork = new Item("Fork", 3, 9999, 50); // Costs 9999 because it can't be bought in the store
        items[7] = fork;

        return items;
    }

    public void addToInventory(Item item) 
        throws InventoryControlException {
        int itemsHeld = item.getItemsUsed();
        if (itemsHeld == 99) {
            return; // Don't add item.
        }
        item.setItemsUsed(itemsHeld++);
    }

    public void removeFromInventory(Item item) 
        throws InventoryControlException {
        int itemsHeld = item.getItemsUsed();
        if (itemsHeld == 0) {
            return; // Don't remove item.
        }
        item.setItemsUsed(itemsHeld--);
    }

    public int buyItem(Item item, int quantity) 
            throws InventoryControlException {
        //initialize the totalSale variable
        int totalSale;
        //declare local vars to simplify the rest of the function
        int used = item.getItemsUsed();
        int value = item.getItemBuyPrice();
        //invalid quantity error
        if (quantity <= 0) {
            throw new InventoryControlException("Error 6!");
        }
        //Maximum "items used" number is 99
        if (quantity > (99 - used)) {
            quantity = (99 - used);
        }
        // Rounds up if value of item is odd.
        totalSale = value * quantity;
        return totalSale;
    }

    public int sellItem(Item item, int quantity) 
            throws InventoryControlException {

        //initialize the totalSale variable
        int totalSale;
        //declare local vars to simplify the rest of the function
        int used = item.getItemsUsed();
        int value = item.getItemBuyPrice();
        //invalid quantity error
        if (quantity <= 0) {
            throw new InventoryControlException("Error 7!");
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
