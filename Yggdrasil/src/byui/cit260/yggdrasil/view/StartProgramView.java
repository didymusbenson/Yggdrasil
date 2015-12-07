/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.view;

import Exceptions.GameControlException;
import Exceptions.MapControlException;
import Exceptions.ProgramControlException;
import byui.cit260.yggdrasil.control.GameControl;
import java.io.Serializable;
import byui.cit260.yggdrasil.control.ProgramControl;
import byui.cit260.yggdrasil.model.Game;
import byui.cit260.yggdrasil.model.Player;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import yggdrasil.Yggdrasil;
        
/**
 *
 * @author tsunami
 */
public class StartProgramView extends View implements Serializable {

    public StartProgramView(String promptMessage) {
        super(promptMessage);
    }

    public void startProgram() throws ProgramControlException, GameControlException{
        //display banner screen
        this.displayBanner();
        //get player's name
        String playersName = this.getPlayerName();
        //create new player and game
        Player player = ProgramControl.createPlayer(playersName);
        try {
            GameControl.createNewGame(player);
        } catch (MapControlException ex) {
            this.console.println("MapControlException");
        }
        //welcome message
        this.displayWelcome(player);
        //Display Main Menu
        this.displayMainMenu();

    }

    private void displayBanner() {
        this.console.println("        __   ______  ____ ____  ____      _    ____ ___ _     "
                + "\n	\\ \\ / / ___|/ ___|  _ \\|  _ \\    / \\  / ___|_ _| |    "
                + "\n	 \\ V / |  _| |  _| | | | |_) |  / _ \\ \\___ \\| || |    "
                + "\n	  | || |_| | |_| | |_| |  _ <  / ___ \\ ___) | || |___ "
                + "\n	  |_| \\____|\\____|____/|_| \\_\\/_/   \\_\\____/___|_____|"
                + "\n	               Your quest begins now.     ");
    }

    private String getPlayerName() {
        //intialize junk
        boolean valid = false;
        String playerName = null;
        // Deleted for assignment: Scanner keyboard = new Scanner(System.in);

        while (!valid) {
            //get a name
            this.console.println("Enter player's name below: ");
            try {
                //trim the blank spaces from the player's name
                //playerName = keyboard.nextLine();
                playerName = this.keyboard.readLine();
            } catch (IOException ex) {
                ErrorView.display("StartProgramView", "Error getting player name!");
            }
            playerName = playerName.trim();
            //make sure the user isn't yanking our chain.
            if (playerName.length() < 2) {
                this.console.println("Error - Player's name cannot be blank!");
                continue;
            }
            break;
        }
        //send that name home!
        return playerName;
    }

    private void displayWelcome(Player player) {
        this.console.println("\n ============================================="
                + "\n Welcome to Yggdrasil, " + player.getPlayerName()
                + "\n It is a good day not to die."
                + "\n =============================================");

    }

    private void displayMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    @Override
    public boolean doAction(Object obj) {
        //TODO write code
        return true;
    }

}
