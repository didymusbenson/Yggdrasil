/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author Didymus
 */
public class Town extends Scene implements Serializable{
    
    private Inventory inventory;
    
    private String townName;
    private String townGossip;
    private String townInnStory;
    private String townShopStory; // Move to shop class?
    private String townQuestStory;
    private boolean questCompleted;
    private int townInnPrice;
    
    
    public Town(){
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    
    public boolean isQuestCompleted() {
        return questCompleted;
    }

    public void setQuestCompleted(boolean questCompleted) {
        this.questCompleted = questCompleted;
    }
    
    public String getTownGossip() {
        return townGossip;
    }

    public void setTownGossip(String townGossip) {
        this.townGossip = townGossip;
    }

    public String getTownInnStory() {
        return townInnStory;
    }

    public void setTownInnStory(String townInnStory) {
        this.townInnStory = townInnStory;
    }

    public String getTownShopStory() {
        return townShopStory;
    }

    public void setTownShopStory(String townShopStory) {
        this.townShopStory = townShopStory;
    }

    public String getTownQuestStory() {
        return townQuestStory;
    }

    public void setTownQuestStory(String townQuestStory) {
        this.townQuestStory = townQuestStory;
    }

    public int getTownInnPrice() {
        return townInnPrice;
    }

    public void setTownInnPrice(int townInnPrice) {
        this.townInnPrice = townInnPrice;
    }

    @Override
    public String toString() {
        return "Town{" + "townGossip=" + townGossip + ", townInnStory=" + townInnStory + ", townShopStory=" + townShopStory + ", townQuestStory=" + townQuestStory + ", townInnPrice=" + townInnPrice + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.townGossip);
        hash = 97 * hash + Objects.hashCode(this.townInnStory);
        hash = 97 * hash + Objects.hashCode(this.townShopStory);
        hash = 97 * hash + Objects.hashCode(this.townQuestStory);
        hash = 97 * hash + this.townInnPrice;
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
        final Town other = (Town) obj;
        if (!Objects.equals(this.townGossip, other.townGossip)) {
            return false;
        }
        if (!Objects.equals(this.townInnStory, other.townInnStory)) {
            return false;
        }
        if (!Objects.equals(this.townShopStory, other.townShopStory)) {
            return false;
        }
        if (!Objects.equals(this.townQuestStory, other.townQuestStory)) {
            return false;
        }
        if (this.townInnPrice != other.townInnPrice) {
            return false;
        }
        return true;
    }
    
}
