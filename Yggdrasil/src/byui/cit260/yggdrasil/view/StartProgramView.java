/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.view;

import java.io.Serializable;

/**
 *
 * @author tsunami
 */
public class StartProgramView implements Serializable {

    public void StartProgram() {
        //display banner screen
        this.displayBanner();
        //get player's name
        this.getPlayerName();
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
        + "\n	     N - New Game , L - Load , H - Help , Q - Quit     ");
    }

    private void getPlayerName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
