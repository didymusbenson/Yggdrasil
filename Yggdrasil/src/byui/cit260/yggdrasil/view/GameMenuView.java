/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.view;

import byui.cit260.yggdrasil.control.GameControl;
import yggdrasil.Yggdrasil;

/**
 *
 * @author tsunami
 */
public class GameMenuView extends View{

    
    public GameMenuView(String promptMessage) {
        super(promptMessage);
    }

  
    public void displayMenu() {
        System.out.println("GAMEMENUVIEW.DISPLAYMENU successfully called!");
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveGame() {
        this.console.println("\n\nSave Game destination:  ");
        String filePath = this.getInput();
        try {
            GameControl.saveGame(Yggdrasil.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
}
