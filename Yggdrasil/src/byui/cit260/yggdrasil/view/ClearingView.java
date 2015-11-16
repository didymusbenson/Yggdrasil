/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.view;

/**
 *
 * @author tsunami
 */
public class ClearingView extends View {

    public ClearingView() {
        super("\nYou are in a clearing that is indistinguishable from"
                + "\nall other clearings you have been to. There is nothing"
                + "\nspecial to look at here.");
    }

    @Override
    public boolean doAction(Object obj) {
        char input = (char) obj;
        switch (input) {
            case 'N': //Go North
                break;
            case 'S': //Go South
                break;
            case 'E': //Go East
                break;
            case 'W': //Go West
                break;
            case 'H': //help
                return false;
            default:
                System.out.println("Error - Please enter a direction");
        }
        return false;
    }
}
