package erg5b;
import java.util.Scanner; 
      
class Car{//Antikimeno Car 
    private int arithmosAftokinitou;

    Car(int arithmosAftokinitou)  {
        this.arithmosAftokinitou = arithmosAftokinitou;
    }
    
    public int getArithmosAftokinitou()    {
        return arithmosAftokinitou;
    }
}

public class Erg5b{
    public static void main(String[] args)    {
        ArrayLinkedQueue cars = new ArrayLinkedQueue();//SimpleLinkedList=~ArrayLinkedQueue
	int i; 
	Scanner input = new Scanner(System.in);
        boolean flag = true;

        do{
            System.out.println("1.Άφιξη αυτοκινήτου.\n"
                    + "2.Αναχώρηση αυτοκινήτου.\n"
                    + "3.Κατάσταση ουράς\n"
                    + "4.Έξοδος .");
            
            System.out.print("Dose tin epilogi sou:: ");
            i = input.nextInt();           

            switch(i){
                case 1:
                    System.out.print("Dose arithmo αυτοκινήτου: ");
                    int ar = UserInput.getInteger();

                    cars.enqueue(new Car(ar));
                    break;
                case 2:
                    System.out.println("To amaksi me aritho " +
                                        ((Car) cars.dequeue()).getArithmosAftokinitou() + 
                                        " anaxorie epitixos.");
                    break;
                case 3:
                    System.out.println("---\nAmaksia stin oura:");

                    int j = cars.size();

                    for(int ii = 0; ii < j; ii++){
                        Car tmp = (Car) cars.dequeue();
                        System.out.println("Arithmos: " + tmp.getArithmosAftokinitou());
                        cars.enqueue(tmp);
                    }
                    System.out.println("---");
                    break;
            }
        }
        while(i>0 && i<4);
    }
}
