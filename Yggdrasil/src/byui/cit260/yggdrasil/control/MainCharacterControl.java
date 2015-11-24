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
        if (amount == 12) {
            return 1;
        }
        return -1;
    }

    /**
     * *
     * This function takes an amount of weeks and converts it into the amount of
     * money a child in the game earns over that many weeks. Because this is not
     * the same gold as the gold the player has, it's okay for it to be
     * calculated as a float.
     *
     * @param weeks the amount of weeks input by user.
     * @return goldSaved
     */
    public float calcMoneySaved(int weeks) {
        // Check for invalid input. If weeks <= 0, it's not a valid response       	
        if (weeks <= 0) {
            return -1;
        }
        // Child earns 5 gold per week.
        float goldEarned = weeks * 5;
        // Child is taxed 3 gold per 10 earned
        float tax = goldEarned / 10 * 3;
        // Gold saved is what he earns minus the tax
        float goldSaved = goldEarned - tax;
        // Return goldSaved, check elsewhere to validate how many weeks.
        return goldSaved;
    }
}
