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
 * @author Brock
 */
public class ShopMenuView implements Serializable {

    private final String MENU = "/n /nWelcome traveler to our local shop."
            + "/nWhat be you'r business here? /nB - Buy /nS - Sell /nL - Leave";

    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU);
            String input = this.getInput(); // gets user seleciton
            input = input.toUpperCase(); // makes user answer uppercased
            selection = input.charAt(0);// takes only first letter given
            this.doAction(selection);
        } while (selection != 'L');// while the user does not leave the shop
    }
    public String getInput() {
        String input = null;
        Boolean valid = false;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {
            System.out.println("What dost thou do?");
            input = keyboard.nextLine();
            input = input.trim();
            if (input.length() < 1) {
                System.out.println("Error - Type something next time!");
                continue;
            }
            break;
        }

        return input;
    }

    public void doAction(char selection) {

        switch (selection) {
            case 'N': //new game
                this.startNewGame();
                break;
            case 'L': //load game
                this.loadGame();
                break;
            case 'H': //help screen
                this.displayHelpMenu();
                break;
            case 'Q': //Quit game
                return;
            default:
                System.out.println("Error - Let me give you those options again:");
        }

    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void loadGame() {
        System.out.println("LOAD GAME");
    }

    private void startNewGame() {
        GameControl.createNewGame(Yggdrasil.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
}
