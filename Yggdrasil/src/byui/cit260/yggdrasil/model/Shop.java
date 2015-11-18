/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.model;

import java.io.Serializable;
import java.util.Arrays;


/**
 * Nothing in a shop should change. Can make enum?
 * @author Didymus
 */
public class Shop implements Serializable {
    
    
    private Inventory inventory;
    
    public Shop(){
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    
}
