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
public class Shop implements Serializable {
    
    
    private String[] shopItemsHeld;
    
    public Shop(){
    }

    public String[] getShopItemsHeld() {
        return shopItemsHeld;
    }

    public void setShopItemsHeld(String[] shopItemsHeld) {
        this.shopItemsHeld = shopItemsHeld;
    }

    // See comment in "Inventory" class.
    @Override
    public String toString() {
        return "Shop{" + "shopItemsHeld=" + Arrays.toString(shopItemsHeld) + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Arrays.deepHashCode(this.shopItemsHeld);
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
        final Shop other = (Shop) obj;
        if (!Arrays.deepEquals(this.shopItemsHeld, other.shopItemsHeld)) {
            return false;
        }
        return true;
    }


   
}
