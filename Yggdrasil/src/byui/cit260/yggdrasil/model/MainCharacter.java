/*
 * Program type: Class
 * Creation date: 3/10/2015 at 10:00
 * Description: This is a text based game where you assume the role of a hero
 *              to destroy the dragon Plythu.
 */

/*
 * Program Map
 *   key:
 *       0 single digit indicates class or global intereaction
 *       00 double digit indecates code within class interaction
 *
 *   1 - package
 *   2 - import
 *   3 - MainCharacter class call
 */
// 1 - this is telling the program where to get the files from
package byui.cit260.yggdrasil.model;

// 2 - this is telling the program what in needs to bring in to run correctly
import java.io.Serializable;

/**
 * @author Didymus Benson Brock Hodgson
 */
// 3 - this is the main character class that gives specific stats to a character
public class MainCharacter extends Actor implements Serializable {

    private int mainCharacterLuck;
    private int mainCharacterSpeed;
    private int mainCharacterMoney;
    private int mainCharacterTotalXp;
    private int mainCharacterCurrentLevel;

    public MainCharacter() {
        // NEW GAME MAIN CHARACTER. There is only one in the game so there
        // only needs to be one setting for the default constructor.
        this.mainCharacterCurrentLevel = 1;
        this.mainCharacterLuck = 1;
        this.mainCharacterMoney = 50;
        this.mainCharacterSpeed = 5;
        this.mainCharacterTotalXp = 0;

        this.setActorAttack(3);
        this.setActorDefense(5);
        this.setActorMaxHp(20);
        this.setActorTempHp(this.getActorMaxHp());
        
        Item fists = new Item("Fists", 2, 0, 3);
        //It shouldn't be possible to sell the fists. Double check this later.
        this.setActorWeapon(fists);
        //DOES NOT SET WEAPON OR COORDINATES     
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
