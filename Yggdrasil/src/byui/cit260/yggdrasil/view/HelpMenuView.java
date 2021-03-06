/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.view;

import java.io.Serializable;

/**
 *
 * @author Didymus Benson & Brock Hodgson
 */
public class HelpMenuView extends View {

    private final String THEPOINT = "\n ============================================="
            + "\n The point of the game is to defeat the"
            + "\n evil dragon Plythu. You will travil to"
            + "\n different towns and fight monsters along"
            + "\n the way to build up the strength to"
            + "\n challenge the mighty dragon and free the"
            + "\n people of this land."
            + "\n =============================================";
    private final String COMMANDS = "\n ============================================="
            + "\n Most commands will be given to you as you"
            + "\n play. Sometimes you may need to be creative"
            + "\n but if you just stick to the capital letters"
            + "\n I give you, you'll do just fine. "
            + "\n =============================================";
    private final String FIGHT = "\n ============================================="
            + "\n This game uses the R.A.I.D. fighting system."
            + "\n the command 'R' tells the game you want to "
            + "\n chicken out and run away. 'A' means attack"
            + "\n 'I' will let you use an item, and 'D' means"
            + "\n defend. You will encounter many randomly"
            + "\n generated fights throughout the game. Don't"
            + "\n feel bad if you have to run away."
            + "\n =============================================";
    private final String MOVE = "\n ============================================="
            + "\n At any point in the game you can type \"T\"." 
            + "\n T stands for \"Travel\" and will open up the"
            + "\n Travel menu. You will then choose N, S, E, or"
            + "\n W to decide in which direction to travel."
            + "\n =============================================";
    private Object keyboard;

    public HelpMenuView(String promptMessage) {
        super("\n ============================================="
                + "\n 1 - What's the point of this game?"
                + "\n 2 - How do you do the things you do?"
                + "\n 3 - How do you fight?"
                + "\n 4 - How do you get around?"
                + "\n 5 - Exit"
                + "\n =============================================");
    }

    
// DOUBLE CHECK THIS.
    @Override
    public boolean doAction(Object obj) {
        char selection = (char) obj;
        switch (selection) {
            case '1':
                this.console.println(THEPOINT);
                break;
            case '2':
                this.console.println(COMMANDS);
                break;
            case '3':
                this.console.println(FIGHT);
                break;
            case '4':
                this.console.println(MOVE);
                break;
            case '5':
                return true;
            default:
                this.console.println("Error - Let me give you those options again:");
        }
        return false;
    }
}
