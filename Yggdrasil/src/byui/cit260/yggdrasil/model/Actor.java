/*
 * Program type: Class
 * Creation: 7/10/2015 at 9:45
 * Description: This class gives the program the ability to assign stats that
 *              are common to both players and non-players.
 */
package byui.cit260.yggdrasil.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Brock
 */
public class Actor implements Serializable {

    private double actorMaxHp;
    private double actorTempHp;
    private double actorAttack;
    private double actorDefense;
    private double actorWeapon;
    private Point coordinates;

    public Actor() {
    }

    public double getActorMaxHp() {
        return actorMaxHp;
    }

    public void setActorMaxHp(double actorMaxHp) {
        this.actorMaxHp = actorMaxHp;
    }

    public double getActorTempHp() {
        return actorTempHp;
    }

    public void setActorTempHp(double actorTempHp) {
        this.actorTempHp = actorTempHp;
    }

    public double getActorAttack() {
        return actorAttack;
    }

    public void setActorAttack(double actorAttack) {
        this.actorAttack = actorAttack;
    }

    public double getActorDefense() {
        return actorDefense;
    }

    public void setActorDefense(double actorDefense) {
        this.actorDefense = actorDefense;
    }

    public double getActorWeapon() {
        return actorWeapon;
    }

    public void setActorWeapon(double actorWeapon) {
        this.actorWeapon = actorWeapon;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Actor{" + "actorMaxHp=" + actorMaxHp + ", actorTempHp=" + actorTempHp + ", actorAttack=" + actorAttack + ", actorDefense=" + actorDefense + ", actorWeapon=" + actorWeapon + ", coordinates=" + coordinates + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.actorMaxHp) ^ (Double.doubleToLongBits(this.actorMaxHp) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.actorTempHp) ^ (Double.doubleToLongBits(this.actorTempHp) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.actorAttack) ^ (Double.doubleToLongBits(this.actorAttack) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.actorDefense) ^ (Double.doubleToLongBits(this.actorDefense) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.actorWeapon) ^ (Double.doubleToLongBits(this.actorWeapon) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.coordinates);
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
        final Actor other = (Actor) obj;
        if (Double.doubleToLongBits(this.actorMaxHp) != Double.doubleToLongBits(other.actorMaxHp)) {
            return false;
        }
        if (Double.doubleToLongBits(this.actorTempHp) != Double.doubleToLongBits(other.actorTempHp)) {
            return false;
        }
        if (Double.doubleToLongBits(this.actorAttack) != Double.doubleToLongBits(other.actorAttack)) {
            return false;
        }
        if (Double.doubleToLongBits(this.actorDefense) != Double.doubleToLongBits(other.actorDefense)) {
            return false;
        }
        if (Double.doubleToLongBits(this.actorWeapon) != Double.doubleToLongBits(other.actorWeapon)) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }

}
