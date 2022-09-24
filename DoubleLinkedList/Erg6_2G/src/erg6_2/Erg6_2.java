package erg6_2;
import java.util.Scanner; 
//Ολόοιδια η main me tin 6.1
//καθως και ολες οι μεθόδοι που καλουνται στην main 
public class Erg6_2 {
    public static void main(String[] args)    {
        DoubleLinkedList list = new DoubleLinkedList();
        int n; String str;
        do{
            System.out.println("******* DOUBLE LINKED LIST MANAGEMENT *******\n"
                            + "1- INSERT ELEMENT AT THE BEGINNING OF THE LIST\n"
                            + "2- INSERT ELEMENT AT THE END OF THE LIST\n"
                            + "3- INSERT ELEMENT AT POSITION n OF THE LIST\n"
                            + "4- DELETE ELEMENT FROM THE BEGINNING OF THE LIST\n"
                            + "5- DELETE ELEMENT FROM THE END OF THE LIST\n"
                            + "6- DELETE ELEMENT FROM POSITION N OF THE LIST\n"
                            + "7- LIST LENGTH\n"
                            + "8- IS THE LIST EMPTY\n"
                            + "9- PRINT LIST\n"
                            + "0- EXIT");
            System.out.print("INPUT YOUR CHOICE (π.χ. 5):");
            Scanner input = new Scanner(System.in);
            n = input.nextInt();

            switch(n){
                case 1:
                    System.out.print("GIVE STRING: ");
                    str = input.next();   

                    list.insertFirst(str);
                    break;
                case 2:
                    System.out.print("GIVE STRING: ");
                    str = input.next();

                    list.insertLast(str);
                    break;
                case 3:
                    System.out.print("GIVE STRING: ");
                    String infp = UserInput.getString();

                    System.out.print("GIVE POSITION: ");
                    int inp = UserInput.getInteger();

                    list.insert(inp, infp);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    System.out.print("GIVE POSITION: ");
                    int rnp = UserInput.getInteger();

                    list.remove(rnp);
                    break;
                case 7:
                    System.out.println("LIST LENGTH: " + list.size());
                    break;
                case 8:
                    System.out.println("IS EMPTY: " + list.isEmpty());
                    break;
                case 9:
                    list.printList();
                    break;
            }
        }
        while(n>0 && n <10);
    }
}