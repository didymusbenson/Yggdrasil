/*
 * Program type: Class
 * Creation: 7/10/2015 at 9:57
 * Description: This class gives the program the ability to assign a location
 *              to the player so they can then see their location on a map.
 */
package byui.cit260.yggdrasil.model;

import java.io.Serializable;

/**
 *
 * @author Brock
 */
public class Location implements Serializable {

    private double locationHostility;
    private double locationEncounterChance;
    private double locationCoordinates;
    private double locationEncounterType;

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

    @Override
    public String toString() {
        return "Location{" + "locationHostility=" + locationHostility + ", locationEncounterChance=" + locationEncounterChance + ", locationCoordinates=" + locationCoordinates + ", locationEncounterType=" + locationEncounterType + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.locationHostility) ^ (Double.doubleToLongBits(this.locationHostility) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.locationEncounterChance) ^ (Double.doubleToLongBits(this.locationEncounterChance) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.locationCoordinates) ^ (Double.doubleToLongBits(this.locationCoordinates) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.locationEncounterType) ^ (Double.doubleToLongBits(this.locationEncounterType) >>> 32));
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
        if (Double.doubleToLongBits(this.locationEncounterType) != Double.doubleToLongBits(other.locationEncounterType)) {
            return false;
        }
        return true;
    }

}
