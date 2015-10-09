/*
 * Program type: Class
 * Creation: 7/10/2015 at 9:58
 * Description: This class allows the player to give a custom name to their 
 *              character. (His actual name is suppose to be Pothoc though.)
 */
package byui.cit260.yggdrasil.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Brock
 */
public class Player implements Serializable {

    private String playerName;

    public Player() {
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public String toString() {
        return "Player{" + "playerName=" + playerName + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.playerName);
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        return true;
    }

}
