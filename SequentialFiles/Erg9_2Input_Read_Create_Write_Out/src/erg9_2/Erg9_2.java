package erg9_2;
import java.io.*;

public class Erg9_2 {
    public static void main(String[] args) throws IOException {
        
        String fileIn="vote.txt";//bazoyme to  το αρχειο vote
        String fileYes="voteYes.txt";
        String fileNo="voteNo.txt";
        
        BufferedReader in = null;
        FileWriter outYes=null;
        FileWriter outNo=null;
        
        
        int count1=0;//μετρητης ψηφοφορων nai 
        int count2= 0 ; //μετρητης ψηφοφορων oxi
        
        try{
            in = new BufferedReader(new FileReader(fileIn));
            outYes= new FileWriter(fileYes); // αρχειο για εγραφη 
            outNo=new FileWriter(fileNo);// αρχειο για εγραφη 
            
            String l1,l2;
            while ( ((l1 = in.readLine())!= null) && ((l2 = in.readLine())!= null) ){
                if ( l2.equals("ΝΑΙ")){
                    count1++;
                    outYes.write(count1 + " " + l1);
                }
                else if ( l2.equals("ΟΧΙ")){
                    count2++;
                    outYes.write(count2 + " " + l1);
                }                
            }            
        }
         
        finally{                
            if (in!=null){         in.close();   }
            if (outYes!=null){        }
            if ( outNo!=null){        }
            
        }       
    }
}