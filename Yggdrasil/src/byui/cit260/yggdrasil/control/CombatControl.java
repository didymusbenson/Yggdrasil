/*
 * Program type: Control Class
 * Creation: 10/21/2015 at 9:20
 * Description: This is the control class that deals with combat situations.
 */
package byui.cit260.yggdrasil.control;
import byui.cit260.yggdrasil.model.Actor;
import java.io.Serializable;
import java.util.Random;
/**
 *
 * @author Didymus Benson 
 */
public class CombatControl implements Serializable{
    public Boolean compareRolls(int roll1, int roll2){
        int highRoll;
        if (roll1 > roll2)
            return true;
        else if (roll2 < roll1)
            return false;
        else {
            return tieBreaker();
        }
    }
    
    public int rollRandRange(int low, int high){
        int roll;
        Random r = new Random();
        int n = high - low + 1;  // N = difference of high range and low range
        int i = r.nextInt() % n; // I = the random number
        roll = low + i;          // roll = low number + random number
        return roll;
    }
    public Boolean tieBreaker(){
        Random r = new Random();
        int i = r.nextInt(2);
        return i == 1; // If i is 1, it returns true, if not returns false.
    }
}
    
