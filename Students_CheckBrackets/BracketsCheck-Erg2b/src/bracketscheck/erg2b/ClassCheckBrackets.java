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
public class ClassCheckBrackets implements Stack{
    //Object
    private Object S[];
    private int index=-1;
    String K="";
    
    public ClassCheckBrackets(){
        this(10);
    }
    public ClassCheckBrackets(int cap){
        S=new Object[cap];
    }

    public int size(){
        return index+1;
    }
    public boolean isEmpty(){
        return index==-1;
    }
    public boolean isFull( ){
        return index==S.length-1; 
    }

    public Object top( ) throws StackEmptyException{
        if (isEmpty()){
            throw new StackEmptyException("stack is empty");
        }
        return S[index];
    }
    public void push(Object item) throws StackFullException{
        if (isFull()){
            throw new StackFullException("stack oneflow");
        }
        index++;
        S[index]=item;
    }
    public Object pop( ) throws StackEmptyException{
        Object element;
        if (isEmpty()){
            throw new StackEmptyException("stack is empty");
        }
        element=S[index];
        S[index]=null;
        index--;
        return element;
    }
    
    // if ....
    public static boolean bracketsCheck(String K)throws StackEmptyException, StackFullException{
        ClassCheckBrackets CheckStack=new ClassCheckBrackets(10);
        char charToCheck;
        for (int i=0;i<K.length();i++){
            charToCheck=K.charAt(i);
            
            if (charToCheck=='('){            
                CheckStack.push('(');break;
            }else if (charToCheck=='{'){
                CheckStack.push('{');break;
            }else if (charToCheck=='['){
                CheckStack.push('[');break;
            }else if (charToCheck==')'){
                if (CheckStack.isEmpty() || !(CheckStack.pop().equals('('))){
                    System.out.println("Error at position: " + (i));
                    return false ;                 
                }
                break;
            }else if (charToCheck=='}'){
                if (CheckStack.isEmpty() || !(CheckStack.pop().equals('{'))){
                    System.out.println("Error at position: " + (i));
                    return false ;                 
                }
                break;
            }else if (charToCheck==']'){
                if (CheckStack.isEmpty() || !(CheckStack.pop().equals('['))){
                    System.out.println("Error at position: " + (i));
                    return false ;                 
                }
                break;
            }
            else
                System.out.print("");//System.out.println( "character "+charToCheck+" notused" );                
            }           
        if (CheckStack.isEmpty()){
            System.out.println("No error");
            return true;
        }
        else {
            System.out.println("Result: No error ");
            return true;
        }
    }
    /*switch  case 
    public static boolean bracketsCheck2(String K)throws StackEmptyException, StackFullException{
        Balance S=new Balance(10);
        char charToCheck;
        for (int i=0;i<K.length();i++){
            charToCheck=K.charAt(i);
            switch(charToCheck){
                case'(':{
                    S.push('(');break;
                }
                case'{':{
                    S.push('{');break;
                }
                case'[':{
                    S.push('[');break;
                }
                case')':{
                    if (S.isEmpty() || !(S.pop().equals('('))){
                        System.out.println("Error) at position: " + (i));
                        return false ;                 
                    }
                    break;
                }
                case'}':{
                    if (S.isEmpty() || !(S.pop().equals('{'))){
                        System.out.println("Error} at position: " + (i));
                        return false ;                 
                    }
                    break;
                }
                case']':{
                    if (S.isEmpty() || !(S.pop().equals('['))){
                        System.out.println("Error] at position: " + (i));
                        return false ;                 
                    }
                    break;
                }
                default:
                    System.out.println("character"+charToCheck+"notused");
            }//end switch            
        }
        if (S.isEmpty()){
            System.out.println("No error");
            return true;
        }
        else {
            System.out.println("error at posiostion"+ K.length());
            return false;
        }
    }
    */
    
}
