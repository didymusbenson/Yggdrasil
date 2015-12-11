/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.view;

import byui.cit260.yggdrasil.model.Location;
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
        Location[][] locations = map.getLocations();
        
        System.out.println("^^^^^^^^^^^^^^MAP^^^^^^^^^^^^^^^^^^");
        System.out.println("    1  2  3  4  5  6  7  8 ");
        for (int r = 0; r < map.getMapRowCount(); r++){
            if (r == 0)
                System.out.println("   ------------------------");
            else
                System.out.print("\n   ------------------------");
            if (r == 0)
                System.out.print((r+1) + " ");
            else
                System.out.print("\n" + (r + 1) + " ");
            for (int c = 0; c < map.getMapColumnCount(); c++){
                System.out.print("|");
                if (locations[r][c].isVisited())
                    System.out.print(" "+locations[r][c].getScene().getSceneMapSymbol()+" ");
                else
                    System.out.print("??");
                if (c == map.getMapColumnCount() - 1)
                    System.out.print("|");
            }
            
        }
        System.out.println("\n  ------------------------");
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    @Override //DOACTION SHOULD NOT BE USED IN MAP VIEW!
    public boolean doAction(Object obj) {
        return true;
    }
    
}
