/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.view;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author tsunami
 */
public class StartProgramView implements Serializable {

    public void startProgram() {
        //display banner screen
        this.displayBanner();
        //get player's name
        String playersName = this.getPlayerName();
        //create new player
        this.createNewPlayer();
        //welcome message
        this.displayWelcome();
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
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid){
            //get a name
            System.out.println("Enter player's name below: ");
            //trim the blank spaces from the player's name
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            //make sure the user isn't yanking our chain.
            if (playersName.length() < 2) {
                System.out.println("Error - Player's name cannot be blank!");
                continue;
            }
            break;
        }
        //send that name home!
        return playersName;
    }

    private void createNewPlayer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayWelcome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayMainMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
