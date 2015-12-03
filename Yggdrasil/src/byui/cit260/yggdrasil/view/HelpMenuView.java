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
public class HelpMenuView extends View implements Serializable {

    // HELPMENU may be useless, it's used as the promptMessage constructor now.
    private final String HELPMENU = "\n ============================================="
            + "\n 1 - What's the point of this game?"
            + "\n 2 - How do you do the things you do?"
            + "\n 3 - How do you fight?"
            + "\n 4 - How do you get around?"
            + "\n 5 - Exit"
            + "\n =============================================";
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
            + "\n Get around by using 'N' 'S' 'E' and 'W'."
            + "\n Each move command will move you in that"
            + "\n direction on the game map. When you reach a "
            + "\n town you can get around using town commands."
            + "\n =============================================";
    private Object keyboard;

    public HelpMenuView(String promptMessage) {
        super(promptMessage);
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
