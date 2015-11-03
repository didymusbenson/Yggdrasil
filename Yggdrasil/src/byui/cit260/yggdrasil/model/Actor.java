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

    private int actorMaxHp;
    private int actorTempHp;
    private int actorAttack;
    private int actorDefense;
    private Item actorWeapon;
    private Point coordinates;

    public Actor() {
    }

    public int getActorMaxHp() {
        return actorMaxHp;
    }

    public void setActorMaxHp(int actorMaxHp) {
        this.actorMaxHp = actorMaxHp;
    }

    public int getActorTempHp() {
        return actorTempHp;
    }

    public void setActorTempHp(int actorTempHp) {
        this.actorTempHp = actorTempHp;
    }

    public int getActorAttack() {
        return actorAttack;
    }

    public void setActorAttack(int actorAttack) {
        this.actorAttack = actorAttack;
    }

    public int getActorDefense() {
        return actorDefense;
    }

    public void setActorDefense(int actorDefense) {
        this.actorDefense = actorDefense;
    }

    public Item getActorWeapon() {
        return actorWeapon;
    }

    public void setActorWeapon(Item actorWeapon) {
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
        int hash = 3;
        hash = 97 * hash + this.actorMaxHp;
        hash = 97 * hash + this.actorTempHp;
        hash = 97 * hash + this.actorAttack;
        hash = 97 * hash + this.actorDefense;
        hash = 97 * hash + Objects.hashCode(this.actorWeapon);
        hash = 97 * hash + Objects.hashCode(this.coordinates);
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
        if (this.actorMaxHp != other.actorMaxHp) {
            return false;
        }
        if (this.actorTempHp != other.actorTempHp) {
            return false;
        }
        if (this.actorAttack != other.actorAttack) {
            return false;
        }
        if (this.actorDefense != other.actorDefense) {
            return false;
        }
        if (!Objects.equals(this.actorWeapon, other.actorWeapon)) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }

}
