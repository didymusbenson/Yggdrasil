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

    public MoveCharacterView() {
        super("Which direction do you wish to travel? N - Notrh, S - South, "
                + "E - East, W - West");
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Ask user for N,S,E,W movement
    private static class MoveChoice {

        public MoveChoice() {
        }
    }

}
        
    //Check to make sure the input is a valid direction
    //Check to make sure that you have a valid actor
    
    //If everything is valid call the actor class from the model layer
    //get the Point coordinates from the actor class
    //add or subtract from row or column depending on what direction is given
    //assign new coordinates to the Point coordinates 
    //give message confirming that the coordiantes have been changed.
