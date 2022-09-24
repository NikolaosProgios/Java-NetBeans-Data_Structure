package lab4;
import java.util.Scanner; 

public class Lab4
{
    public static void main(String[] args)
    {
        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();
        int n;   String str; 

        do{
            System.out.println("1.INSERT ELEMENT AT THE BEGINNING OF THE LIST \n" +
                                "2.INSERT ELEMENT AT THE END OF THE LIST \n" +
                                "3.DELETE FROM THE BEGINNING OF THE LIST \n" + 
                                "4.DELETE FROM THE END OF THE LIST \n"+
                                "5.LIST LENGTH \n" +"6.IS THE LIST EMPTY \n" +
                                "7.PRINT LIST \n" + "8.EXIT \n" 
            );
            System.out.print("INPUT YOUR CHOICE: ");            
            Scanner input = new Scanner(System.in);
            n = input.nextInt();  

            switch(n)
            {
                case 1:
                    System.out.print("Dose ena String: ");     
                    str = input.next();   
                
                    simpleLinkedList.insertFirst(str);
                    break;
                case 2:
                    System.out.print("Dose ena String: ");     
                    str = input.next();

                    simpleLinkedList.insertLast(str);
                    break;
                case 3:
                    simpleLinkedList.removeFirst();
                    break;
                case 4:
                    simpleLinkedList.removeLast();
                    break;
                case 5:
                    System.out.println("LIST LENGTH: " + simpleLinkedList.size());
                    break;
                case 6:
                    System.out.println("IS LIST EMPTY? " + simpleLinkedList.isEmpty());
                    break;
                case 7:
                    simpleLinkedList.printList();
                    break;                
            }
        }
        while(n<8 && n>0);
    }
}