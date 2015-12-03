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
            case 'N':
                System.out.println("GO NORTH CHOSEN!");
                return true;
            case 'S':
                System.out.println("GO SOUTH CHOSEN!");
                return true;
            case 'E':
                System.out.println("GO EAST CHOSEN!");
                return true;
            case 'W':
                System.out.println("GO WEST CHOSEN!");
                return true;
            case 'H':
                this.displayHelpMenu();
                return false;
            default:
                System.out.println("Error - Please enter a direction");
        }
        return false;
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView("");
        helpMenu.display();
    }
}
