/*
 * Program type: Control Class
 * Creation: 9/21/2015 at 9:24
 * Description: This is the main that allows the game to be played. 
 *              His actual name is suppose to be Pothoc though.
 */
package byui.cit260.yggdrasil.control;

import byui.cit260.yggdrasil.model.Game;
import java.io.Serializable;
import byui.cit260.yggdrasil.model.Location;
import byui.cit260.yggdrasil.model.Map;
import byui.cit260.yggdrasil.model.Scene;
import java.awt.Point;
import yggdrasil.Yggdrasil;
/**
 *
 * @author Brock Hodgson
 */
public class MapControl implements Serializable {
    
    public enum sceneType{
        start,
        clearing,
        forest,
        beach,
        town,
        dungeon,
        plythu,
        end,
    }
    
    public static Map createMap() {
        Map map = new Map(8,8);
        //CREATE THE SCENES
        Scene[] scenes = createScenes();
        //ASSIGN THE SCENES TO LOCATIONS
        GameControl.assignScenesLocations(map, scenes);
        return map;
    }

    private static Scene[] createScenes() {
        //CREATE SCENES
        Game game = Yggdrasil.getCurrentGame();
        Scene[] scenes = new Scene[sceneType.values().length];
        
        //CREATE THE INDIVIDUAL SCENES
        
        return scenes;
    }
 
    public boolean actorLocationCheck(Point coordinates, Map map ){
        //get location at desired coordiates from the map
        Location location = map.getLocations()[coordinates.x][coordinates.y];

        return location.isBlocked();
        
    }
}