/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.model;

import java.io.Serializable;

/**
 *
 * @author Didymus Benson Brock Hodgson
 */
public class MainCharacter implements Serializable {

    private int mainCharacterLuck;
    private int mainCharacterSpeed;
    private int mainCharacterMoney;
    private int mainCharacterTotalXp;
    private int mainCharacterCurrentLevel;

    public MainCharacter() {
    }

    public int getMainCharacterLuck() {
        return mainCharacterLuck;
    }

    public void setMainCharacterLuck(int mainCharacterLuck) {
        this.mainCharacterLuck = mainCharacterLuck;
    }

    public int getMainCharacterSpeed() {
        return mainCharacterSpeed;
    }

    public void setMainCharacterSpeed(int mainCharacterSpeed) {
        this.mainCharacterSpeed = mainCharacterSpeed;
    }

    public int getMainCharacterMoney() {
        return mainCharacterMoney;
    }

    public void setMainCharacterMoney(int mainCharacterMoney) {
        this.mainCharacterMoney = mainCharacterMoney;
    }

    public int getMainCharacterTotalXp() {
        return mainCharacterTotalXp;
    }

    public void setMainCharacterTotalXp(int mainCharacterTotalXp) {
        this.mainCharacterTotalXp = mainCharacterTotalXp;
    }

    public int getMainCharacterCurrentLevel() {
        return mainCharacterCurrentLevel;
    }

    public void setMainCharacterCurrentLevel(int mainCharacterCurrentLevel) {
        this.mainCharacterCurrentLevel = mainCharacterCurrentLevel;
    }

    @Override
    public String toString() {
        return "MainCharacter{" + "mainCharacterLuck=" + mainCharacterLuck + ", mainCharacterSpeed=" + mainCharacterSpeed + ", mainCharacterMoney=" + mainCharacterMoney + ", mainCharacterTotalXp=" + mainCharacterTotalXp + ", mainCharacterCurrentLevel=" + mainCharacterCurrentLevel + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.mainCharacterLuck;
        hash = 37 * hash + this.mainCharacterSpeed;
        hash = 37 * hash + this.mainCharacterMoney;
        hash = 37 * hash + this.mainCharacterTotalXp;
        hash = 37 * hash + this.mainCharacterCurrentLevel;
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
        final MainCharacter other = (MainCharacter) obj;
        if (this.mainCharacterLuck != other.mainCharacterLuck) {
            return false;
        }
        if (this.mainCharacterSpeed != other.mainCharacterSpeed) {
            return false;
        }
        if (this.mainCharacterMoney != other.mainCharacterMoney) {
            return false;
        }
        if (this.mainCharacterTotalXp != other.mainCharacterTotalXp) {
            return false;
        }
        if (this.mainCharacterCurrentLevel != other.mainCharacterCurrentLevel) {
            return false;
        }
        return true;
    }

}
