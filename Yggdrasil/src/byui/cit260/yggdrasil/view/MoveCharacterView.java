/*
 * This class moves the actor from one location to another as directed by the 
 * user. This class is called by the GameMenuView class.
 */
package byui.cit260.yggdrasil.view;

import byui.cit260.yggdrasil.view.GameMenuView;
import yggdrasil.Yggdrasil;

/**
 *
 * @author Brock
 */
public class MoveCharacterView extends View {

    //Ask user for N,S,E,W movement
    public MoveCharacterView() {
        super("Which direction do you wish to travel? N - Notrh, S - South, "
                + "E - East, W - West");
    }

    private static class MoveChoice {

        public MoveChoice() {
        }
    }

    //Check to make sure the input is a valid direction
    @Override
    public boolean doAction(Object obj) {
        char input = (char) obj;
        switch (input) {
            case 'N':
                //will Subtract 1 Row from current location
                break;
            case 'S':
                // will Add 1 Row to current location
                break;
            case 'E':
                // will Subtract 1 Column from current location
                break;
            case 'W':
                // will Add 1 Column to current location
                return true;
            default:
                System.out.println("Error - Let me give you those options again:");
        }
        return false;
    }
    //give message confirming that the coordiantes have been changed.
}
