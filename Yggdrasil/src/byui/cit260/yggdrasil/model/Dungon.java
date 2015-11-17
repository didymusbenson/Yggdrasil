/*
 * Program type: Class
 * Creation: 7/10/2015 at 9:50
 * Description: This class gives the program information on what a dungon can
 *              can hold.
 */
package byui.cit260.yggdrasil.model;

import java.io.Serializable;

/**
 *
 * @author Brock
 */
public class Dungon extends Location implements Serializable{

    private int dungonGoldAvalible;
    private int dungonNumberOfFights;
    private int dungeonFightsFought;

    public Dungon() {
    }

    public int getDungonGoldAvalible() {
        return dungonGoldAvalible;
    }

    public void setDungonGoldAvalible(int dungonGoldAvalible) {
        this.dungonGoldAvalible = dungonGoldAvalible;
    }

    public int getDungonNumberOfFights() {
        return dungonNumberOfFights;
    }

    public void setDungonNumberOfFights(int dungonNumberOfFights) {
        this.dungonNumberOfFights = dungonNumberOfFights;
    }

    public int getDungeonFightsFought() {
        return dungeonFightsFought;
    }

    public void setDungeonFightsFought(int dungeonFightsFought) {
        this.dungeonFightsFought = dungeonFightsFought;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.dungonGoldAvalible;
        hash = 59 * hash + this.dungonNumberOfFights;
        hash = 59 * hash + this.dungeonFightsFought;
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
        final Dungon other = (Dungon) obj;
        if (this.dungonGoldAvalible != other.dungonGoldAvalible) {
            return false;
        }
        if (this.dungonNumberOfFights != other.dungonNumberOfFights) {
            return false;
        }
        if (this.dungeonFightsFought != other.dungeonFightsFought) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dungon{" + "dungonGoldAvalible=" + dungonGoldAvalible + ", dungonNumberOfFights=" + dungonNumberOfFights + ", dungeonFightsFought=" + dungeonFightsFought + '}';
    }



}
