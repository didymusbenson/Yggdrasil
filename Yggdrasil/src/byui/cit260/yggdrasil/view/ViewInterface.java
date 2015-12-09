/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.view;

import byui.cit260.yggdrasil.model.MainCharacter;

/**
 *
 * @author Brock Hodgson
 */
public interface ViewInterface {

    public void display();

    public String getInput();

    public boolean doAction(Object obj);

    public void displayHelpMenu();
    
    public boolean yesOrNo();
    
    public void displayStats(MainCharacter hero);
}
