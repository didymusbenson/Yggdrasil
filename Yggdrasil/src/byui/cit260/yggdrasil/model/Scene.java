/*
 * Program type: Class
 * Creation: 7/10/2015 at 9:59
 * Description: This class gives the program the ability give different 
 *              elements of the game at different areas of the map.
 */
package byui.cit260.yggdrasil.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Scenes don't change, but towns and dungeons do. Must be array.
 *
 * @author Brock
 */
public class Scene implements Serializable {

    private String sceneDescription;
    private String sceneMapSymbol;
    private Scene scene;
    private double locationHostility;
    private double locationEncounterChance;
    private double locationEncounterType;

    public Scene() {
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
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

    public String getSceneDescription() {
        return sceneDescription;
    }

    public void setSceneDescription(String sceneDescription) {
        this.sceneDescription = sceneDescription;
    }

    public String getSceneMapSymbol() {
        return sceneMapSymbol;
    }

    public void setSceneMapSymbol(String sceneMapSymbol) {
        this.sceneMapSymbol = sceneMapSymbol;
    }

    @Override
    public String toString() {
        return "Scene{" + "sceneDescription=" + sceneDescription + ", sceneMapSymbol=" + sceneMapSymbol + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.sceneDescription);
        hash = 37 * hash + Objects.hashCode(this.sceneMapSymbol);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.sceneDescription, other.sceneDescription)) {
            return false;
        }
        if (!Objects.equals(this.sceneMapSymbol, other.sceneMapSymbol)) {
            return false;
        }
        return true;
    }

}
