package erg5;

public class MainClassBracketsCheck {   
    public static boolean bracketsCheck(String K)throws StackEmptyException, StackFullException{
        //SimpleLinkedList la =new SimpleLinkedList();  //κανντας το ετσι γλυτώνουμε την //LinkedStack class 
        LinkedStack CheckStack=new LinkedStack();   // και ΑΝΑγκαζομαστε να κανουμου τις μεθοδους της εδω στην μαιν 
        char charToCheck;
        for (int i=0;i<K.length();i++){
            charToCheck=K.charAt(i);
            
            if (charToCheck=='('){            
                //la.insertFirst('(');break;
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
    
    public static void main(String[] args) {
           
        String K="(1+3)*3*(2+2)";
        String M="1+3)*3*(2+2)";
        
        System.out.println("K=(1+3)*3*(2+2)");
        System.out.println(MainClassBracketsCheck.bracketsCheck(K));
        
        System.out.println("\nM=1+3)*3*(2+2)");
        System.out.println(MainClassBracketsCheck.bracketsCheck(M));
        
    }
}