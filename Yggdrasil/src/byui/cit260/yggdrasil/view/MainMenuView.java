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
public class MainMenuView implements Serializable{
    private final String MENU = "\n N - New Game, L - Load, H - Help, Q - Quit";

    public void displayMenu(){
        System.out.println("DERP MainMenuView.displayMenu called! DERP");
    }
}
