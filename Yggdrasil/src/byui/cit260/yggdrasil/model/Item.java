/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.model;

import java.io.Serializable;

/**
 * TODO: CONVERT ITEM TO ENUM
 * @author Didymus
 */
public class Item implements Serializable{

    private Inventory inventory;
    
    private int itemType; // 1 = restorative, 2 = damaging, 3 = weapon
    private int itemBuyPrice;
    private int itemSellPrice;
    private int itemModifier;
    private int itemsUsed;
    public Item() {

    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public int getItemsUsed() {
        return itemsUsed;
    }

    public void setItemsUsed(int itemsUsed) {
        this.itemsUsed = itemsUsed;
    }

    public int getItemBuyPrice() {
        return itemBuyPrice;
    }

    public void setItemBuyPrice(int itemBuyPrice) {
        this.itemBuyPrice = itemBuyPrice;
    }

    public int getItemSellPrice() {
        return itemSellPrice;
    }

    public void setItemSellPrice(int itemSellPrice) {
        this.itemSellPrice = itemSellPrice;
    }

    public int getItemModifier() {
        return itemModifier;
    }

    public void setItemModifier(int itemModifier) {
        this.itemModifier = itemModifier;
    }

    @Override
    public String toString() {
        return "Item{" + "itemType=" + itemType + ", itemBuyPrice=" + itemBuyPrice + ", itemSellPrice=" + itemSellPrice + ", itemModifier=" + itemModifier + ", itemsUsed=" + itemsUsed + '}';
    }

    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.itemType;
        hash = 71 * hash + this.itemBuyPrice;
        hash = 71 * hash + this.itemSellPrice;
        hash = 71 * hash + this.itemModifier;
        hash = 71 * hash + this.itemsUsed;
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
        final Item other = (Item) obj;
        if (this.itemType != other.itemType) {
            return false;
        }
        if (this.itemBuyPrice != other.itemBuyPrice) {
            return false;
        }
        if (this.itemSellPrice != other.itemSellPrice) {
            return false;
        }
        if (this.itemModifier != other.itemModifier) {
            return false;
        }
        if (this.itemsUsed != other.itemsUsed) {
            return false;
        }
        return true;
    }
    
}
