/*
 * Program type: Class
 * Creation: 7/10/2015 at 9:56
 * Description: This class gives the program the specific information about
 *              enemies that the player can encounter.
 */
package byui.cit260.yggdrasil.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Brock
 */
public class Enemy extends Actor implements Serializable {

    private Location location;
    
    private int enemyEscapeChance;
    private int enemyXpReward;
    private int enemyGoldReward;
    private String enemyName;
    
    public Enemy() {
    }
    
    public Enemy(int escapeChance, int xpReward, int goldReward, String name, int maxHp, int attack, int defense){
        this.enemyEscapeChance = escapeChance;
        this.enemyGoldReward = goldReward;
        this.enemyName = name;
        this.setActorMaxHp(maxHp);
        this.setActorTempHp(this.getActorMaxHp());
        this.setActorAttack(attack);
        this.setActorDefense(defense);
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

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    @Override
    public String toString() {
        return "Enemy{" + "enemyEscapeChance=" + enemyEscapeChance + ", enemyXpReward=" + enemyXpReward + ", enemyGoldReward=" + enemyGoldReward + ", enemyName=" + enemyName + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.enemyEscapeChance;
        hash = 19 * hash + this.enemyXpReward;
        hash = 19 * hash + this.enemyGoldReward;
        hash = 19 * hash + Objects.hashCode(this.enemyName);
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
        if (!Objects.equals(this.enemyName, other.enemyName)) {
            return false;
        }
        return true;
    }


    
}
