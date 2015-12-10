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
                GameMenuView gameMenu = new GameMenuView("");
                gameMenu.displayMenu(); //The gameMenu needs to be completed.
                break;
            case 'L': //load game
                this.startSavedGame();
                break;
            case 'H': //help screen
                this.displayHelpMenu();
                break;
            case 'Q': //Quit game
                return true;
            default:
                System.out.println("Error - Let me give you those options again:");
        }
        return false;
    }
    
    private void startSavedGame(){
        this.console.println("\n\nLoad Game filepath: ");
        String filePath = this.getInput();
        
        try {
            GameControl.getSavedGame(filePath);
        } catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        // NEEDS TO HANDLE IF AN INCORRECT FILE IS CHOSEN
        GameMenuView gameMenu = new GameMenuView("");
        gameMenu.displayMenu();
    }
}
