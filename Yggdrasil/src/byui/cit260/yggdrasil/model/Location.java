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
 * 
 * @author Brock
 */
public class Location implements Serializable {

    private Enemy[] enemies;
    private Scene scene;
    
    private double locationHostility;
    private double locationEncounterChance;
    private double locationEncounterType;
    private boolean blocked;
    private boolean visited;
    private Point coordinates;
    
    private int row;
    private int column;

    public Location() {
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
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
        return "Location{" + "locationHostility=" + locationHostility + ", locationEncounterChance=" + locationEncounterChance + ", locationEncounterType=" + locationEncounterType + ", blocked=" + blocked + ", coordinates=" + coordinates + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.locationHostility) ^ (Double.doubleToLongBits(this.locationHostility) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.locationEncounterChance) ^ (Double.doubleToLongBits(this.locationEncounterChance) >>> 32));
        
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

        if (this.blocked != other.blocked) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }

}
