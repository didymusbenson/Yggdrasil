/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.model;

import byui.cit260.yggdrasil.view.HelpMenuView;
import java.io.Serializable;

/**
 *
 * @author Didymus
 */
public class Game implements Serializable {

    private Item[] gameInventory;
    private MainCharacter hero;
    private Enemy[] enemies;
    private Actor[] actors;
    private Player player;
    private Map map;

    private int gameNumberOfDeaths;
   
    
    public Game() {
    }

    public int getGameNumberOfDeaths() {
        return gameNumberOfDeaths;
    }

    public void setGameNumberOfDeaths(int gameNumberOfDeaths) {
        this.gameNumberOfDeaths = gameNumberOfDeaths;
    }

    @Override
    public String toString() {
        return "Game{" + "gameNumberOfDeaths=" + gameNumberOfDeaths + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.gameNumberOfDeaths;
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
        final Game other = (Game) obj;
        if (this.gameNumberOfDeaths != other.gameNumberOfDeaths) {
            return false;
        }
        return true;
    }

    public Actor[] getActors() {
        return actors;
    }

    public void setActors(Actor[] actors) {
        this.actors = actors;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Enemy[] getEnemies() {
        return enemies;
    }

    public void setEnemies(Enemy[] enemies) {
        this.enemies = enemies;
    }

    public MainCharacter getHero() {
        return hero;
    }

    public void setHero(MainCharacter hero) {
        this.hero = hero;
    }

    public Item[] getGameInventory() {
        return gameInventory;
    }

    public void setGameInventory(Item[] gameInventory) {
        this.gameInventory = gameInventory;
    }

  
}
