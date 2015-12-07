/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.view;

import byui.cit260.yggdrasil.control.GameControl;
import yggdrasil.Yggdrasil;

/**
 * @author tsunami
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n N - New Game, L - Load, H - Help, Q - Quit \n");
    }

    @Override
    public boolean doAction(Object obj) {
        char input = (char) obj;
        switch (input) {
            case 'N': //new game
                System.out.println("New Game Called");
                break;
            case 'L': //load game
                System.out.println("Load Game Called");
                break;
            case 'H': //help screen
                this.displayHelp();
                break;
            case 'Q': //Quit game
                return true;
            default:
                System.out.println("Error - Let me give you those options again:");
        }
        return false;
    }

    private void displayHelp() {
        HelpMenuView help = new HelpMenuView("");
        help.display();
    }

    private void saveGame() {
        this.console.println("\n\nSave Game destination:  ");
        String filePath = this.getInput();
        try {
            GameControl.saveGame(Yggdrasil.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
}
