/*
 * Program type: Control Class
 * Creation: 9/21/2015 at 9:24
 * Description: This is the main that allows the game to be played. 
 *              His actual name is suppose to be Pothoc though.
 */
package byui.cit260.yggdrasil.control;

import java.io.Serializable;
import byui.cit260.yggdrasil.model.Location;
import byui.cit260.yggdrasil.model.Map;
import java.awt.Point;
/**
 *
 * @author Brock Hodgson
 */
public class MapControl implements Serializable {
 
    public boolean actorLocationCheck(Point coordinates, Map map ){
        //get location at desired coordiates from the map
        Location location = map.getLocations()[coordinates.x][coordinates.y];

        return location.isBlocked();
        
    }
}