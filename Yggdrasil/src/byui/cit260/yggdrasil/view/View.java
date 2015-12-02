/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.yggdrasil.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import yggdrasil.Yggdrasil;

/**
 *
 * @author Didymus
 */
public abstract class View implements ViewInterface {

    // Scanner keyboard = new Scanner(System.in);
    protected String promptMessage;

    protected final BufferedReader keyboard = Yggdrasil.getInFile();
    protected final PrintWriter console = Yggdrasil.getOutFile();
    
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    @Override
    public void display() {
        char selection = ' ';
        boolean done = false;
        do {
            System.out.println(promptMessage);
            String input = this.getInput();
            input = input.toUpperCase();
            selection = input.charAt(0);
            done = this.doAction(selection);
        } while (!done);
    }

    @Override
    public String getInput() {
        String input = null;
        Boolean valid = false;

        while (!valid) {
            this.console.println("What dost thou do?");
            try {
                input = this.keyboard.readLine();
            } catch (IOException ex) {
                ErrorView.display("View", "Error parsing text!");
            }
            
            input = input.trim();
            if (input.length() < 1) {
                this.console.println("Error - Type something next time!");
                continue;
            }
            break;
        }

        return input;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

}
