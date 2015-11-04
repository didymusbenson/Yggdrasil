/*
 * Program type: View Class
 * Creation: 11/3/2015 at 9:40
 * Description: This is how the player interacts with the Dwarf Money Quest.
 */
package byui.cit260.yggdrasil.view;

import java.io.Serializable;
import java.util.Scanner;
import byui.cit260.yggdrasil.control.MainCharacterControl;

/**
 *
 * @author Brock
 */
public class DwarfMoneyQuest implements Serializable {

    private final String QUESTION = "I have just come back from mining and have"
            + "36 coins worth of gold dust. I know that a pound usually makes 3 coins,"
            + "but I am just too drunk to do the math. Could you tell me how many"
            + " pounds of gold dust I have.";

    public void displayStory() {
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
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {
            System.out.println("/nWhat do you do?");
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

    private boolean doAction(String input) {
        int pounds = Integer.parseInt(input); //convert user input to int
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
}

