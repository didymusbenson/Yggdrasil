/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.view;

import byui.cit260.yggdrasil.model.Map;

/**
 *
 * @author tsunami
 */
public class MapView extends View {

    public MapView(String promptMessage) {
        super(promptMessage);
    }
    
    public void displayMap(Map map){
        for (int i = 0; i < map.getMapRowCount(); i++)
            for (int j = 0; j < map.getMapColumnCount(); j++){
                this.console.println("under construction");
            }
        
            
    }

    @Override //DOACTION SHOULD NOT BE USED IN MAP VIEW!
    public boolean doAction(Object obj) {
        return true;
    }
    
}
