/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.view;

import byui.cit260.yggdrasil.control.CombatControl;
import byui.cit260.yggdrasil.model.Enemy;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author tsunami
 */
public class CombatMenuView implements Serializable {
    private final String BANNER = "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
    private final String NORMAL = "You are attacked by a "; // add monster name
    private final String SNEAK = "You snuck up on a "; // add monster name
    private final String AMBUSH = "A monster gets the jump on you!";
    private final String VICTORY = "You have defeated the "; //add monster name
    private final String OPTIONS = "(R)un - (A)ttack - (I)tem - (D)defend";
    
    public void displayMenu() {
        Enemy enemy = CombatControl.getEnemy();
        System.out.println(BANNER);
        System.out.println(NORMAL + enemy.getEnemyName());
        char selection = ' ';
        
        do {
            System.out.println(OPTIONS);
            String input = this.getInput(); // get selection
            input = input.toUpperCase();
            selection = input.charAt(0); // grab first letter, no matter what's typed
            this.doAction(selection);
            // ADD Player and Monster temp HPs here.
        } while (enemy.getActorTempHp() > 0); // or until player dies.
        
        System.out.println(VICTORY + enemy.getEnemyName() + "!");
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
                System.out.println("Error - You didn't type anything!");
                continue;
            }
            break;
        }

        return input;
    }
    public void doAction(char selection) {

        switch (selection) {
            case 'R':
                System.out.println("RUN CHOSEN");
                //CombatControl.runAway(hero, enemy);
                break;
            case 'A':
                System.out.println("ATTACK CHOSEN");
                // Must call a function that rolls successful attack 
                // and then roll damage of the attack
                // CombatControl.playerAttack(MainCharacter, Enemy);
                // ** attack() then calls rollSuccess() and applyDamage() ** 
                break;
            case 'I':
                System.out.println("ITEM CHOSEN");
                // Must open an inventory display of items for the user
                // to choose from, then USE the item.
                // itemMenuView.viewItems();
                // itemMenuView then works you through the consumption of an
                // item and 'returns' us to combat.
                break;
            case 'D':
                System.out.println("DEFEND CHOSEN");
                // Must call a function that will reduce the chance of being hit.
                // by the enemy this turn.
                // CombatControl.defend(HeroDefense); will raise hero defense for 
                // one turn. THIS SPECIFIC MECHANIC MAY CAUSE TROUBLE.
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            default:
                System.out.println("Error - Let me give you those options again:");
        }

    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }
}
