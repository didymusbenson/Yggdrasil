/*
 * Program type: Class
 * Creation: 7/10/2015 at 9:57
 * Description: This class gives the program the ability to assign a location
 *              to the player so they can then see their location on a map.
 */
package byui.cit260.yggdrasil.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 * Locations shouldn't change. Enums possibly.
 * @author Brock
 */
public class Location implements Serializable {

    private Enemy[] enemies;
    private Scene scene; 
    
    private double locationHostility;
    private double locationEncounterChance;
    private double locationCoordinates;
    private double locationEncounterType;
    private boolean blocked;
    private Point coordinates;

    public Location() {
    }

    public double getLocationHostility() {
        return locationHostility;
    }

    public void setLocationHostility(double locationHostility) {
        this.locationHostility = locationHostility;
    }

    public double getLocationEncounterChance() {
        return locationEncounterChance;
    }

    public void setLocationEncounterChance(double locationEncounterChance) {
        this.locationEncounterChance = locationEncounterChance;
    }

    public double getLocationCoordinates() {
        return locationCoordinates;
    }

    public void setLocationCoordinates(double locationCoordinates) {
        this.locationCoordinates = locationCoordinates;
    }

    public double getLocationEncounterType() {
        return locationEncounterType;
    }

    public void setLocationEncounterType(double locationEncounterType) {
        this.locationEncounterType = locationEncounterType;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    public Enemy[] getEnemies() {
        return enemies;
    }

    public void setEnemies(Enemy[] enemies) {
        this.enemies = enemies;
    }

    

    @Override
    public String toString() {
        return "Location{" + "locationHostility=" + locationHostility + ", locationEncounterChance=" + locationEncounterChance + ", locationCoordinates=" + locationCoordinates + ", locationEncounterType=" + locationEncounterType + ", blocked=" + blocked + ", coordinates=" + coordinates + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.locationHostility) ^ (Double.doubleToLongBits(this.locationHostility) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.locationEncounterChance) ^ (Double.doubleToLongBits(this.locationEncounterChance) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.locationCoordinates) ^ (Double.doubleToLongBits(this.locationCoordinates) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.locationEncounterType) ^ (Double.doubleToLongBits(this.locationEncounterType) >>> 32));
        hash = 97 * hash + (this.blocked ? 1 : 0);
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.locationHostility) != Double.doubleToLongBits(other.locationHostility)) {
            return false;
        }
        if (Double.doubleToLongBits(this.locationEncounterChance) != Double.doubleToLongBits(other.locationEncounterChance)) {
            return false;
        }
        if (Double.doubleToLongBits(this.locationCoordinates) != Double.doubleToLongBits(other.locationCoordinates)) {
            return false;
        }
        if (this.blocked != other.blocked) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }

}
