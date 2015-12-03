/*
 * Program type: View Class
 * Creation: 11/3/2015 at 9:40
 * Description: This is how the player interacts with the Dwarf Money Quest.
 */
package byui.cit260.yggdrasil.view;

import Exceptions.MainCharacterControlException;
import java.io.Serializable;
import java.util.Scanner;
import byui.cit260.yggdrasil.control.MainCharacterControl;

/**
 *
 * @author Brock
 */
public class DwarfMoneyQuest extends View implements Serializable {

    private final String QUESTION = "I have just come back from mining and have"
            + "36 coins worth of gold dust. I know that a pound usually makes 3 coins,"
            + "but I am just too drunk to do the math. Could you tell me how many"
            + " pounds of gold dust I have.";
    private Object keyboard;

    public DwarfMoneyQuest(String promptMessage) {
        super(promptMessage);
    }

    public void displayStory()
            throws MainCharacterControlException {
        char selection = ' ';
        boolean success = false;
        do {
            System.out.println(QUESTION);
            String input = this.getInput(); // gets user seleciton
            success = this.doAction(input);
        } while (!success);// while the user does not answer

    }

    public String getInput() {
        String input = null;
        Boolean valid = false;
        // Deleted for assignment. Scanner keyboard = new Scanner(System.in);

        while (!valid) {
            System.out.println("/nWhat do you do?");
            // input = keyboard.nextLine(); Changed to: input = this.keyboard.readLine();
            input = this.keyboard.readLine();
            input = input.trim();
            if (input.length() < 1) {
                System.out.println("Sorry I can't help me if you don't speak english.");
                continue;
            }
            break;
        }

        return input;
    }

    private boolean doAction(String input)
            throws MainCharacterControlException {
        //try { //The try statement decoupled the pounds variable, so I had to leave it out.
        int pounds = Integer.parseInt(input); //convert user input to int
        //} catch (NumberFormatException nf) {
        //System.out.println("Error: You must input a valid number!");
        //}
        MainCharacterControl mainCharacterControl = new MainCharacterControl();
        int coins = mainCharacterControl.dwarfMoneyQuest(pounds); //check player answer

        if (coins < 1) { //Tell player if they are correct
            System.out.println("That doesn't sound right, I guess I just need "
                    + "to wait unil I can do the math myself again.");
            return false;
        } else {
            System.out.println("Yes that sounds right.");
            return true;

        }
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
