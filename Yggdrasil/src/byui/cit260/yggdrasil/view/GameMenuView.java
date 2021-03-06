/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.view;

import byui.cit260.yggdrasil.control.GameControl;
import byui.cit260.yggdrasil.control.MapControl;
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


    //Uses this method instead of the standard "display" because I didn't want
    //to have to re-create the promptmessage every time I wanted to call it.
    public void displayMenu() {
        String menu = "--GAME MENU------------------------"
                + "\n(N)ew Game"
                + "\n(S)ave Game"
                + "\n(L)oad Game"
                + "\n(M)ap"
                + "\n(H)elp"
                + "\n(R)esume Game" 
                + "\n(Q)uit"
                + "\n----------------------------------"; 
        char selection = ' ';
        boolean done = false;
        do {
            System.out.println(menu);
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
            case 'S': //Save Game
                this.saveGame();
                break;
            case 'M':
                MapView map = new MapView("");
                map.displayMap(Yggdrasil.getCurrentGame().getMap());
                break;
            case 'L': // Load Game works differently in-game. You get to choose whether to do it or not.
                this.console.println("Your progress will be lost if you load another game now."
                        + "\nAbandon current game and load another?");
                if (yesOrNo()) {
                    this.startSavedGame();
                } else {
                    this.console.println("Nevermind then.");
                }
                break;
            case 'H': //help screen
                this.displayHelpMenu();
                break;
            case 'R': // resume game
                LocationView gameScreen = new LocationView("");
                gameScreen.locationDisplay();
                break;
            case 'Q': //quit game
                this.console.println("Any unsaved progress will be lost."
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

    private void saveGame() {
        this.console.println("\n\nSave Game destination:  ");
        String filePath = this.getInput();
        try {
            GameControl.saveGame(Yggdrasil.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void startSavedGame() {
        this.console.println("\n\nLoad Game filepath: ");
        String filePath = this.getInput();

        try {
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        // NEEDS TO HANDLE IF AN INCORRECT FILE IS CHOSEN
        GameMenuView gameMenu = new GameMenuView("");
        gameMenu.displayMenu();
    }
}
