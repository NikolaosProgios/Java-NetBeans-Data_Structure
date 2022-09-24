package carqueuemanagement.erg3b;
import java.util.Scanner;

public class MainClass {
    public  static void main(String []args){
        
        int megethos=3;
        CarQueueManagement Q=new CarQueueManagement(megethos);
        
        int i; String str;
   
        do {
            System.out.println("1.Άφιξη αυτοκινητου \n" +
                                "2.Αναχώριση αυτοκινητου \n" +
                                "3.Kατάσταση ουράς \n" + 
                                "4.Έξοδος \n");
            
            Scanner input = new Scanner(System.in); 
            System.out.print("Dose epilogi: ");     
            i = input.nextInt();   
            switch (i){
                case 1:{
                    System.out.println("Gemato parking ; " +Q.isFull());
                    if (Q.isFull()==true){break;}// break or add agian last car to throw Exception Q.add(c);
                    System.out.print("Dose pinakida: ");     
                    str = input.next();     
                    Car  c=new Car (str);
                    Q.add(c);        System.out.println("Ok car me pinakida: " + str+"\n");
                }
                case 2:{
                    System.out.println("Anaxorise to aytokinito me pinakida: "+Q.remove());
                }
                case 3:{
                    for (int j=0;j<Q.size();j++){
                        System.out.println(Q.toString());
                    }
                    System.out.println("\nEinai adia : " +  Q.isEmpty() + "\nExei  gemisei: " + Q.isFull() );
                    System.out.println("Proto stin oura : " +  Q.front() );
                }
            }
        }while (i>0 && i<4);        
    }
}
