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
public class CombatMenuView implements Serializable {

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
                // CombatControl.attack(HeroAttack, HeroItemHeld, EnemyDefense);
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
