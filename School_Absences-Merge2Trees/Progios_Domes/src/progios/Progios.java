package progios;
import java.io.*;

public class Progios {
    public static void list2File(DoubleLinkedList ls) throws FileNotFoundException, IOException {
            BufferedWriter outputFile= new BufferedWriter(new FileWriter("list2File.txt"));
            Student student = null;
            for(DoubleNode position=ls.getFirstNode();position != null;position=position.getNext()){
                student=(Student) position.getItem() ;
                if(student.getGrade()>=5){
                    outputFile.write(student.getName() + " " + student.getAbsences()+"\n");
                }
            }outputFile.close();
    }
           
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //main Ask1
        int n=5;
        Student[] students = new Student[n];
        //Lista student
        DoubleLinkedList list = new DoubleLinkedList();
        students[0] = new Student(175001, "Nick",1,8);
        students[1] =  new Student(175002, "Marina",2,7);
        students[2] = new Student(175003, "Sissy",1,4);
        students[3] = new Student(175004, "Xristos",0,2);
        students[4] = new Student(175005, "Katerina",1,6);
        
        for(int i = 0; i < n; i++)        {
            list.insertLast(students[i]);
        }
        list2File(list);
        
        //main Ask2
        
        int table[] = {40, 15, 25, 50, 20, 10, 70, 55, 45, 5};

        BSTree A = new BSTree();

         for(int i = 0; i < table.length; i++)        {
             A.insertElement(table[i]);
         }
         System.out.print("A: ");
         A.preOrderTraversal();
         BSTree B = new BSTree();
         B.mergeTrees(A);
         System.out.print("B: ");
         B.preOrderTraversal();

        
    }
}
