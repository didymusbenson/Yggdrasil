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
public class Enemy implements Serializable {

    private double enemyEscapeChance;
    private double enemyXpReward;
    private double enemyGoldReward;

    public Enemy() {
    }

    public double getEnemyEscapeChance() {
        return enemyEscapeChance;
    }

    public void setEnemyEscapeChance(double enemyEscapeChance) {
        this.enemyEscapeChance = enemyEscapeChance;
    }

    public double getEnemyXpReward() {
        return enemyXpReward;
    }

    public void setEnemyXpReward(double enemyXpReward) {
        this.enemyXpReward = enemyXpReward;
    }

    public double getEnemyGoldReward() {
        return enemyGoldReward;
    }

    public void setEnemyGoldReward(double enemyGoldReward) {
        this.enemyGoldReward = enemyGoldReward;
    }

    @Override
    public String toString() {
        return "Enemy{" + "enemyEscapeChance=" + enemyEscapeChance + ", enemyXpReward=" + enemyXpReward + ", enemyGoldReward=" + enemyGoldReward + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.enemyEscapeChance) ^ (Double.doubleToLongBits(this.enemyEscapeChance) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.enemyXpReward) ^ (Double.doubleToLongBits(this.enemyXpReward) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.enemyGoldReward) ^ (Double.doubleToLongBits(this.enemyGoldReward) >>> 32));
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
        if (Double.doubleToLongBits(this.enemyEscapeChance) != Double.doubleToLongBits(other.enemyEscapeChance)) {
            return false;
        }
        if (Double.doubleToLongBits(this.enemyXpReward) != Double.doubleToLongBits(other.enemyXpReward)) {
            return false;
        }
        if (Double.doubleToLongBits(this.enemyGoldReward) != Double.doubleToLongBits(other.enemyGoldReward)) {
            return false;
        }
        return true;
    }

}
