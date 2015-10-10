/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Didymus
 */
public class Inventory implements Serializable {

    private String[] inventoryItemsHeld;

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
        return "Inventory{" + "inventoryItemsHeld=" + Arrays.toString(inventoryItemsHeld) + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Arrays.deepHashCode(this.inventoryItemsHeld);
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
        return true;
    }

}
