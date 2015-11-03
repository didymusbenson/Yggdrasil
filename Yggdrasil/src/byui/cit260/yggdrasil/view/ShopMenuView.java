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
            System.out.println("/nWhat be you'r business here?"
                    + "/nWhat be you'r business here? /nB - Buy /nS - Sell /nL - Leave");
            input = keyboard.nextLine();
            input = input.trim();
            if (input.length() < 1) {
                System.out.println("Sorry I can't help me if you don't speak english.");
                continue;
            }
            break;
        }

        return input;
    }

    public void doAction(char selection) {

        switch (selection) {
            case 'B': //Buying items
                this.sellItem();
                break;
            case 'S': //Selling items
                this.buyItem();
                break;
            case 'L': //Quit menue
                return;
            default:
                System.out.println("Error - Let me give you those options again:");
        }

    }

    private void sellItem() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void buyItem() {
        System.out.println("LOAD GAME");
    }

    GameMenuView gameMenu = new GameMenuView();

    gameMenu.displayMenu ();
}
}
