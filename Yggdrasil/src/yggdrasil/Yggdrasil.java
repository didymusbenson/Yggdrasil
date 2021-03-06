/*
 * Program type: Class
 * Creation: 7/10/2015 at 9:10
 * Description: This is the main that allows the game to be played. 
 *              His actual name is suppose to be Pothoc though.
 */
// 1 - this tells the program what game is to be played.
package yggdrasil;

// 2 - This tells the program what it will need to play the game.
import Exceptions.ProgramControlException;
import byui.cit260.yggdrasil.model.Game;
import byui.cit260.yggdrasil.view.CombatMenuView;
import byui.cit260.yggdrasil.view.ErrorView;
import byui.cit260.yggdrasil.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brock Hodgson & Didymus Benson
 */
public class Yggdrasil {

    private static Game currentGame;
    private static StartProgramView startProgramView;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;



    /**
     * @param args the command line arguments
     * @throws Exceptions.ProgramControlException
     */
    public static void main(String[] args)
            throws ProgramControlException {

        try {
            // open stream files for I/O
            Yggdrasil.inFile = new BufferedReader(new InputStreamReader(System.in));
            Yggdrasil.outFile = new PrintWriter(System.out, true);

            // open log file
            String filePath = "log.txt";
            Yggdrasil.logFile = new PrintWriter(filePath);

            //Create start programView and start the program
            startProgramView = new StartProgramView("");
            startProgramView.startProgram();

            //TESTING
            /*CombatMenuView test = new CombatMenuView();
            test.display();*/
            
            
        } catch (Throwable e) {
            ErrorView.display("Yggdrasil", "Error closing files!");
            e.printStackTrace();
            // startProgram(); //Brock, what is this for again?
        } finally {
            try {
                if (Yggdrasil.inFile != null) {
                    Yggdrasil.inFile.close();
                }
                if (Yggdrasil.outFile != null) {
                    Yggdrasil.outFile.close();
                }
                if (Yggdrasil.logFile != null) {
                    Yggdrasil.logFile.close();
                }
            } catch (IOException ex) {
                ErrorView.display("Yggdrasil", "Error closing files!");
                return;
            }

        }
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Yggdrasil.currentGame = currentGame;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Yggdrasil.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Yggdrasil.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Yggdrasil.logFile = logFile;
    }
    
    /*   // method to restart the program if something goes wrong?
     private static void startProgram() {
        
     }
     */


}
