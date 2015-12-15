/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.view;

import byui.cit260.yggdrasil.model.Location;
import byui.cit260.yggdrasil.model.Map;
import java.awt.Point;
import yggdrasil.Yggdrasil;

/**
 *
 * @author tsunami
 */
public class LocationView extends View {

    public LocationView(String promptMessage) {
        super(promptMessage);
    }

    public void locationDisplay() {
        char selection = ' ';
        boolean done = false;
        Map map = Yggdrasil.getCurrentGame().getMap();
        Point coords = Yggdrasil.getCurrentGame().getHero().getCoordinates();
        Location location = map.getLocations()[coords.x][coords.y];
        String story = location.getScene().getSceneDescription();
        do {
            this.console.println("("+coords.x+"," +coords.y+")" 
            + "\n" + story);
            String input = this.getInput();
            input = input.toUpperCase();
            selection = input.charAt(0);
            done = this.doAction(selection);
        } while (!done);
    }

    @Override
    public boolean doAction(Object obj) {
        char input = (char) obj;
                switch (input) {

            case 'Q': //quit game
                this.console.println("QUIT AND GO TO GAME MENU"
                        + "\nAre you sure you want to quit?");
                if (yesOrNo()) {
                    return true;
                }
                else
                    break;
            default:
                System.out.println("Error - Let me give you those options again:");
        }
        return false;
    }

}
