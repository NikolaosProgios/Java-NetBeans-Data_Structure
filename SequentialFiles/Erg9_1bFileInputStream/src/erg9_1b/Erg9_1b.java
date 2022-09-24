package erg9_1b;
import java.io.*;

public class Erg9_1b {    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        FileInputStream infile1 = new FileInputStream ("pic1.bin");
        FileInputStream infile2 = new FileInputStream ("pic2.bin");
        FileOutputStream outfile = new FileOutputStream ("pic.bin");
        //Παρε οτι εχει το 1 και το 2 και βαλτα στο 3 , ταξινομοιμένα 
        int input1 , input2 ;
        input1=infile1.read();
        input2=infile2.read();
        
        //FileInputStream infile1 = new FileInputStream ("pic1.bin");
        //int input1=infile1.read();
        /*int count=0;
        while (input1!=-1){
            System.out.println(input1+", ");
            input1=infile1.read();
            count++;
            
        }
        infile1.close();
        System.out.println("\n Bytes read(in ):" + count);
        */
        while (input1!=-1 || input2 !=-1){
            if ( input1 == -1 ){
                outfile.write(input2);
                input2=infile2.read();                
            }
            else if ( input2 == -1 ){
                outfile.write(input1);
                input1=infile1.read();      
            }
            else if (input1 != -1 && input2 != -1 ){
                if ( input1<input2){
                outfile.write(input1);
                input1=infile1.read();                
                }
                else {
                outfile.write(input2);
                input2=infile2.read();                
                }
            }
        }
    }
}
