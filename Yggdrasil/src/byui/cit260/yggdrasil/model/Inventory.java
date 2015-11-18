/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
/**
 *
 * @author Didymus
 */
public class Inventory implements Serializable {

    private Game game;
    
    
    private String[] inventoryItemsHeld;
    private HashMap<String, Item> items = new HashMap<>(); 

    public HashMap<String, Item> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Item> items) {
        this.items = items;
    }

    public Inventory() {
    }

    public String[] getInventoryItemsHeld() {
        return inventoryItemsHeld;
    }

    public void setInventoryItemsHeld(String[] inventoryItemsHeld) {
        this.inventoryItemsHeld = inventoryItemsHeld;
    }

    /* I had to look up an answer on how to get the array of strings to
     print properly here. I eventually found the "Arrays.toString()" method */

    @Override
    public String toString() {
        return "Inventory{" + "inventoryItemsHeld=" + inventoryItemsHeld + ", items=" + items + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Arrays.deepHashCode(this.inventoryItemsHeld);
        hash = 41 * hash + Objects.hashCode(this.items);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inventory other = (Inventory) obj;
        if (!Arrays.deepEquals(this.inventoryItemsHeld, other.inventoryItemsHeld)) {
            return false;
        }
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        return true;
    }
  

}
