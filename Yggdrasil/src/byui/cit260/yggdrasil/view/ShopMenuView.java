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
            this.console.println(MENU);
            String input = this.getInput(); // gets user seleciton, see string getInput
            input = input.toUpperCase(); // makes user answer uppercased
            selection = input.charAt(0);// takes only first letter given
            this.doAction(selection); //uses switch case. see selection
        } while (selection != 'L');// while the user does not leave the shop
    }

    public String getInput() {
        String input = null; //Sets input to a null, until user input is given.
        Boolean valid = false; //sets loop to repet until valid answer is given.
        // deleted for assignemtn: Scanner keyboard = new Scanner(System.in); 
        //tells program where to get user input from

        while (!valid) {
            this.console.println("/nWhat do you do?"); //Asks user for input
            //input = keyboard.nextLine(); //reads in next line from user
            input = this.keyboard.readLine();
            input = input.trim(); //takes off everything but first letter
            if (input.length() < 1) { //tells user if their input is invalid
                this.console.println("Sorry I can't help me if you don't speak english.");
                continue;
            }
            break;
        }

        return input;// first letter of user input is returned
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
                this.console.println("Error - Let me give you those options again:");
        }

    }

    private void sellItem() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void buyItem() {

    }
}
