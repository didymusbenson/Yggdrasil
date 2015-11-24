/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author tsunami
 */
public class Map implements Serializable {

    private Game game;

    private int mapRowCount;
    private int mapColumnCount;
    private Location[][] locations = new Location[mapRowCount][mapColumnCount];

    public Map() {
    }

    public Map(int numRow, int numCol) {
        if (numRow < 1 || numCol < 1) {
            System.out.println("ERROR: Row and Column must be greater than 0");
        }

        this.mapRowCount = numRow;
        this.mapColumnCount = numCol;

        for (int row = 0; row < mapRowCount; row++) {
            for (int col = 0; col < mapColumnCount; col++) {
                Location location = new Location();
                location.setColumn(col);
                location.setRow(row);
                location.setVisited(false);

                locations[row][col] = location;
            }
        }
    }

    public int getMapRowCount() {
        return mapRowCount;
    }

    public void setMapRowCount(int mapRowCount) {
        this.mapRowCount = mapRowCount;
    }

    public int getMapColumnCount() {
        return mapColumnCount;
    }

    public void setMapColumnCount(int mapColumnCount) {
        this.mapColumnCount = mapColumnCount;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Map{" + "mapRowCount=" + mapRowCount + ", mapColumnCount=" + mapColumnCount + ", locations=" + locations + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.mapRowCount;
        hash = 29 * hash + this.mapColumnCount;
        hash = 29 * hash + Arrays.deepHashCode(this.locations);
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
        final Map other = (Map) obj;
        if (this.mapRowCount != other.mapRowCount) {
            return false;
        }
        if (this.mapColumnCount != other.mapColumnCount) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }

}
