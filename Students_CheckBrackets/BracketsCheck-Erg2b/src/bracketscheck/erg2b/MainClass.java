package bracketscheck.erg2b;

import java.io.*; 





//Main class
public class MainClass {
public static void main(String []args){
        
        String K="(1+3)*3*(2+2)";
        String M="1+3)*3*(2+2)";
        
        System.out.println("K=(1+3)*3*(2+2)");
        System.out.println(ClassCheckBrackets.bracketsCheck(K));
        
        System.out.println("\nM=1+3)*3*(2+2)");
        System.out.println(ClassCheckBrackets.bracketsCheck(M));
    }
}
