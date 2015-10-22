/*
 * Program type: Control Class
 * Creation: 9/21/2015 at 9:23
 * Description: This is the main that allows the game to be played. 
 *              His actual name is suppose to be Pothoc though.
 */
package byui.cit260.yggdrasil.control;

import java.io.Serializable;

/**
 *
 * @author Brock Hodgson
 */
public class MainCharacterControl implements Serializable {

    public int dwarfMoneyQuest(int amount) {
        if (amount > 0) {
            return amount * 3;
        }
        return -1;
    }
}
