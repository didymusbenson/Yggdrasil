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
public class MainMenuView implements Serializable {

    private final String MENU = "\n N - New Game, L - Load, H - Help, Q - Quit \n";

    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU);
            String input = this.getInput(); // get selection
            input = input.toUpperCase();
            selection = input.charAt(0); // grab first letter, no matter what's typed
            this.doAction(selection);
        } while (selection != 'Q'); // While player doesn't QUIT
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
        System.out.println("DISPLAY HELP MENU");
    }

    private void loadGame() {
        System.out.println("LOAD GAME");
    }

    private void startNewGame() {
        System.out.println("NEW GAME");
    }

}
