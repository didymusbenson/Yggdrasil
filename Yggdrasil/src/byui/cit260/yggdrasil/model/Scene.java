/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Brock
 */
public class Scene implements Serializable {

    private String sceneDescription;
    private String sceneHasBarrier;
    private String sceneMapSymbol;

    public String getSceneDescription() {
        return sceneDescription;
    }

    public void setSceneDescription(String sceneDescription) {
        this.sceneDescription = sceneDescription;
    }

    public String getSceneHasBarrier() {
        return sceneHasBarrier;
    }

    public void setSceneHasBarrier(String sceneHasBarrier) {
        this.sceneHasBarrier = sceneHasBarrier;
    }

    public String getSceneMapSymbol() {
        return sceneMapSymbol;
    }

    public void setSceneMapSymbol(String sceneMapSymbol) {
        this.sceneMapSymbol = sceneMapSymbol;
    }

    @Override
    public String toString() {
        return "Scene{" + "sceneDescription=" + sceneDescription + ", sceneHasBarrier=" + sceneHasBarrier + ", sceneMapSymbol=" + sceneMapSymbol + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.sceneDescription);
        hash = 37 * hash + Objects.hashCode(this.sceneHasBarrier);
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
        if (!Objects.equals(this.sceneHasBarrier, other.sceneHasBarrier)) {
            return false;
        }
        if (!Objects.equals(this.sceneMapSymbol, other.sceneMapSymbol)) {
            return false;
        }
        return true;
    }

}
