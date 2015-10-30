/*
 * Program type: Contol Class
 * Creation: 9/21/2015 at 9:21
 * Description: This is the main that allows the game to be played. 
 *              His actual name is suppose to be Pothoc though.
 */
package byui.cit260.yggdrasil.control;

import byui.cit260.yggdrasil.model.Player;
import java.io.Serializable;
import yggdrasil.Yggdrasil;
/**
 *
 * @author Didymus Benson 
 */
public class GameControl implements Serializable {
    public static void createNewGame(Player player){
        Yggdrasil.setPlayer(player);
        System.out.println("createNewGame successful.");
    
    }
}
