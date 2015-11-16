/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.view;


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
                //    this.startNewGame();
                break;
            case 'L': //load game
                //    this.loadGame();
                break;
            case 'H': //help screen
                //    this.displayHelpMenu();
                break;
            case 'Q': //Quit game
                return true;
            default:
                System.out.println("Error - Let me give you those options again:");
        }
        return false;
    }

}


