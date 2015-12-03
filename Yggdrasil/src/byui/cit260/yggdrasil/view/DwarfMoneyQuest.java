/*
 * Program type: View Class
 * Creation: 11/3/2015 at 9:40
 * Description: This is how the player interacts with the Dwarf Money Quest.
 */
package byui.cit260.yggdrasil.view;

import Exceptions.MainCharacterControlException;
import java.io.Serializable;
import byui.cit260.yggdrasil.control.MainCharacterControl;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brock
 */
public class DwarfMoneyQuest extends View {


    private Object keyboard;

    public DwarfMoneyQuest(String promptMessage) {
        super(promptMessage);
    }

    public DwarfMoneyQuest(String promptMessage) {
        super("I have just come back from mining and have"
            + "36 coins worth of gold dust. I know that a pound usually makes 3 coins,"
            + "but I am just too drunk to do the math. Could you tell me how many"
            + " pounds of gold dust I have.");
    }

    @Override
    public boolean doAction(Object obj) {
        String strPounds = (String) obj;
        //try { //The try statement decoupled the pounds variable, so I had to leave it out.
        int pounds = Integer.parseInt(strPounds); //convert user input to int
        //} catch (NumberFormatException nf) {
        //System.out.println("Error: You must input a valid number!");
        //}
        MainCharacterControl mainCharacterControl = new MainCharacterControl();
        int coins = 0; 
        try {
            coins = mainCharacterControl.dwarfMoneyQuest(pounds); //check player answer
        } catch (MainCharacterControlException ex) {
            ErrorView.display("MainCharacterControl", ex.getMessage());
        }

        if (coins < 1) { //Tell player if they are correct
            System.out.println("That doesn't sound right, I guess I just need "
                    + "to wait unil I can do the math myself again.");
            return false;
        } else {
            System.out.println("Yes that sounds right.");
            return true;

        }
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
