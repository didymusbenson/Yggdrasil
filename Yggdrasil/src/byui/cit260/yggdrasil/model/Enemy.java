/*
 * Program type: Class
 * Creation: 7/10/2015 at 9:56
 * Description: This class gives the program the specific information about
 *              enemies that the player can encounter.
 */
package byui.cit260.yggdrasil.model;

import java.io.Serializable;

/**
 *
 * @author Brock
 */
public class Enemy extends Actor implements Serializable {

    private int enemyEscapeChance;
    private int enemyXpReward;
    private int enemyGoldReward;

    public Enemy() {
    }

    public int getEnemyEscapeChance() {
        return enemyEscapeChance;
    }

    public void setEnemyEscapeChance(int enemyEscapeChance) {
        this.enemyEscapeChance = enemyEscapeChance;
    }

    public int getEnemyXpReward() {
        return enemyXpReward;
    }

    public void setEnemyXpReward(int enemyXpReward) {
        this.enemyXpReward = enemyXpReward;
    }

    public int getEnemyGoldReward() {
        return enemyGoldReward;
    }

    public void setEnemyGoldReward(int enemyGoldReward) {
        this.enemyGoldReward = enemyGoldReward;
    }

    @Override
    public String toString() {
        return "Enemy{" + "enemyEscapeChance=" + enemyEscapeChance + ", enemyXpReward=" + enemyXpReward + ", enemyGoldReward=" + enemyGoldReward + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.enemyEscapeChance;
        hash = 61 * hash + this.enemyXpReward;
        hash = 61 * hash + this.enemyGoldReward;
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
        final Enemy other = (Enemy) obj;
        if (this.enemyEscapeChance != other.enemyEscapeChance) {
            return false;
        }
        if (this.enemyXpReward != other.enemyXpReward) {
            return false;
        }
        if (this.enemyGoldReward != other.enemyGoldReward) {
            return false;
        }
        return true;
    }

    
}
