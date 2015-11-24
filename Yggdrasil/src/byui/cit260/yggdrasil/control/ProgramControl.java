/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.control;

import byui.cit260.yggdrasil.model.Player;
import java.io.Serializable;

/**
 *
 * @author tsunami
 */
public class ProgramControl implements Serializable {

    public static Player createPlayer(String playerName) {
        Player player = new Player();
        player.setPlayerName(playerName);

        return player;
    }

}
