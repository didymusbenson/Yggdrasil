/*
 * This class moves the actor from one location to another as directed by the 
 * user. This class is called by the GameMenuView class.
 */
package byui.cit260.yggdrasil.view;

import Exceptions.MapControlException;
import byui.cit260.yggdrasil.control.MapControl;
import byui.cit260.yggdrasil.model.Actor;
import byui.cit260.yggdrasil.view.GameMenuView;
import byui.cit260.yggdrasil.control.MapControl.sceneType;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        // Get current actor and his location
        Actor actor = Yggdrasil.getCurrentGame().getHero();
        Point currentCoordinates = actor.getCoordinates();
        MapControl sender = new MapControl();

        switch (input) {
            case 'N':
                //will Subtract 1 Row from current location
                currentCoordinates.setLocation(currentCoordinates.getX(), currentCoordinates.getY() - 1);
                 {
                    try {
                        sender.moveActor(currentCoordinates, actor);
                    } catch (MapControlException ex) {
                        Logger.getLogger(MoveCharacterView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            case 'S':
                // will Add 1 Row to current location
                currentCoordinates.setLocation(currentCoordinates.getX(), currentCoordinates.getY() + 1);
                 {
                    try {
                        sender.moveActor(currentCoordinates, actor);
                    } catch (MapControlException ex) {
                        Logger.getLogger(MoveCharacterView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            case 'E':
                // will Subtract 1 Column from current location
                currentCoordinates.setLocation(currentCoordinates.getX() - 1, currentCoordinates.getY());
                 {
                    try {
                        sender.moveActor(currentCoordinates, actor);
                    } catch (MapControlException ex) {
                        Logger.getLogger(MoveCharacterView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
            case 'W':
                // will Add 1 Column to current location
                currentCoordinates.setLocation(currentCoordinates.getX() + 1, currentCoordinates.getY());
                 {
                    try {
                        sender.moveActor(currentCoordinates, actor);
                    } catch (MapControlException ex) {
                        Logger.getLogger(MoveCharacterView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                return true;
            default:
                System.out.println("Error - Let me give you those options again:");
        }
        return false;
    }
    //give message confirming that the coordiantes have been changed.
}
