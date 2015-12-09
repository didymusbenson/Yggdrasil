/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.view;

import Exceptions.GameControlException;
import Exceptions.ProgramControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tsunami
 */
public class StartProgramViewTest {
    
    public StartProgramViewTest() {
    }

    /**
     * Test of StartProgram method, of class StartProgramView.
     */
    @Test
    public void testStartProgram() throws ProgramControlException, GameControlException {
        System.out.println("StartProgram");
        StartProgramView instance = new StartProgramView("");
        instance.startProgram();
    }
    
}
