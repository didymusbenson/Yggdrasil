/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.view;

import Exceptions.ProgramControlException;
import java.io.Serializable;
import java.util.Scanner;
import byui.cit260.yggdrasil.control.ProgramControl;
import byui.cit260.yggdrasil.model.Player;

/**
 *
 * @author tsunami
 */
public class StartProgramView implements Serializable {

    public void startProgram() 
            throws ProgramControlException {
        //display banner screen
        this.displayBanner();
        //get player's name
        String playersName = this.getPlayerName();
        //create new player
        Player player = ProgramControl.createPlayer(playersName);
        //welcome message
        this.displayWelcome(player);
        //Display Main Menu
        this.displayMainMenu();

    }

    private void displayBanner() {
        System.out.println("        __   ______  ____ ____  ____      _    ____ ___ _     "
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
            System.out.println("Enter player's name below: ");
            //trim the blank spaces from the player's name
            //playerName = keyboard.nextLine();
            input = this.keyboard.readLine();
            playerName = playerName.trim();
            //make sure the user isn't yanking our chain.
            if (playerName.length() < 2) {
                System.out.println("Error - Player's name cannot be blank!");
                continue;
            }
            break;
        }
        //send that name home!
        return playerName;
    }

    private void displayWelcome(Player player) {
        System.out.println("\n ============================================="
                + "\n Welcome to Yggdrasil, " + player.getPlayerName()
                + "\n It is a good day not to die."
                + "\n =============================================");

    }

    private void displayMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

}
