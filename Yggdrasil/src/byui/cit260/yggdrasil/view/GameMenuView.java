/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.view;

import byui.cit260.yggdrasil.control.GameControl;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import yggdrasil.Yggdrasil;

/**
 *
 * @author tsunami
 */
public class GameMenuView extends View {

    public GameMenuView(String promptMessage) {
        super(promptMessage);
    }

    public void displayMenu() {
        System.out.println("GAMEMENUVIEW.DISPLAYMENU successfully called!");
    }

    @Override
    public boolean doAction(Object obj) {
        char input = (char) obj;
        switch (input) {
            case 'N': //new game
                GameMenuView gameMenu = new GameMenuView("");
                gameMenu.display();//Should just start the game at the beginning. Game is already created. 
                break;
            case 'L': // Load Game works differently in-game. You get to choose whether to do it or not.
                this.console.println("Your progress will be lost if you load another game now."
                + "\nAbandon current game and load another? (Y/N)");
                String choiceInput = null;
        try {
            choiceInput = this.keyboard.readLine();
        } catch (IOException ex) {
            ErrorView.display("GameMenuView", "Error getting Y/N input.");
        }
                choiceInput = choiceInput.toUpperCase();
                char choice = choiceInput.charAt(0);
                if (choice == 'Y')
                    this.startSavedGame();
                else 
                    this.console.println("Nevermind. Back to the story.");
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

    private void saveGame() {
        this.console.println("\n\nSave Game destination:  ");
        String filePath = this.getInput();
        try {
            GameControl.saveGame(Yggdrasil.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
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
        gameMenu.display();
    }
}
