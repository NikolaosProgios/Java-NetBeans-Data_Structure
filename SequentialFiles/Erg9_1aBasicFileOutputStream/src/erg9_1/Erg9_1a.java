package erg9_1;
import java.io.*;

public class Erg9_1a {

    public static void main(String[] args) throws IOException{
        
        int data[]= {45,0,1,2,3,4,5,6,45,78,96,3,6,3,5,2,5,125,1,
                    54,4,6,21,61,54,56,1,156,124,45,1,2,5,5,78};
        try{
            FileOutputStream file = new FileOutputStream("pic.txt");
            for (int i = 0 ; i< data.length ; i++){
                file.write(data[i]);
            }
            file.close();            
        }
        
        finally{
            System.out.println("error -- -");
        
        }
       
    }
}
