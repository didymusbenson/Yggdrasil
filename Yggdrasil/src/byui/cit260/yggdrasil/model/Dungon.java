/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.model;

import java.io.Serializable;

/**
 *
 * @author Brock
 */
public class Dungon implements Serializable {

    private double dungonGoldAvalible;
    private double dungonNumberOfFights;

    public Dungon() {
    }

    public double getDungonGoldAvalible() {
        return dungonGoldAvalible;
    }

    public void setDungonGoldAvalible(double dungonGoldAvalible) {
        this.dungonGoldAvalible = dungonGoldAvalible;
    }

    public double getDungonNumberOfFights() {
        return dungonNumberOfFights;
    }

    public void setDungonNumberOfFights(double dungonNumberOfFights) {
        this.dungonNumberOfFights = dungonNumberOfFights;
    }

    @Override
    public String toString() {
        return "Dungon{" + "dungonGoldAvalible=" + dungonGoldAvalible + ", dungonNumberOfFights=" + dungonNumberOfFights + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.dungonGoldAvalible) ^ (Double.doubleToLongBits(this.dungonGoldAvalible) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.dungonNumberOfFights) ^ (Double.doubleToLongBits(this.dungonNumberOfFights) >>> 32));
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
        if (Double.doubleToLongBits(this.dungonGoldAvalible) != Double.doubleToLongBits(other.dungonGoldAvalible)) {
            return false;
        }
        if (Double.doubleToLongBits(this.dungonNumberOfFights) != Double.doubleToLongBits(other.dungonNumberOfFights)) {
            return false;
        }
        return true;
    }

}
