/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracketscheck.erg2b;

/**
 *
 * @author nikos
 */
public class StackFullException extends RuntimeException{
    public StackFullException (String err){
        super(err);
    }
}
