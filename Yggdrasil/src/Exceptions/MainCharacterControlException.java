/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Brock
 */
public class MainCharacterControlException extends Exception {

    public MainCharacterControlException() {
    }

    public MainCharacterControlException(String message) {
        super(message);
    }

    public MainCharacterControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public MainCharacterControlException(Throwable cause) {
        super(cause);
    }

    public MainCharacterControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
