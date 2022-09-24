package main;
import java.io.*;

public class Main {

    public static int compareListTree(DoubleLinkedList list,BSTree tree ) {
        int flag = -1;       
        
        //Max grade lista
        DoubleLinkedList list2 = new DoubleLinkedList();
        list2=list;
        
        Student SL= new Student();        
        
        float maxlista=0;        
        for(int k = 0; k <lengthstudent/2; k++){ 
            SL= (Student) list2.removeLast();
            if (SL.getGrade()>maxlista){
                maxlista=SL.getGrade();
            }
        }        
        //Max grade Tree
        //BoHthitika gia emas , apothikeyo olous tous student 
        //se ena pinaka object apo to tree mas " taksinomimena "
        Object[] ST = tree.sort();
        float maxtree=0;        
        for(int k = 0; k <lengthstudent/2; k++)        { 
            for(int i = 0; i < ST.length; i++)        {
                if (((Student) ST[i]).getGrade()> maxtree){
                    maxtree=((Student) ST[i]).getGrade();
                }   
            }
        }
        
        if (maxlista>maxtree){
            flag=1;
        }else if(maxlista<maxtree) {
            flag=2;
        }else if(maxlista==maxtree) {
            flag=0;
        }
        return flag;
    }
    
    static int lengthstudent=10;
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Student[] students = new Student[lengthstudent];
        
        //Lista student
        DoubleLinkedList list = new DoubleLinkedList();
        students[0] = new Student(1, "Nick", "Nick",8);
        students[1] = new Student(2, "Katerina", "Katerina",9);
        students[2] = new Student(3, "kostas", "kostas",7);
        students[3] = new Student(4, "Maria", "Maria",6);
        students[4] = new Student(5, "Marios", "Marios",7);
        for(int i = 0; i < 5; i++)        {
            list.insertLast(students[i]);
        }        
        
        //Tree student
        BSTree tree = new BSTree();
        students[5] = new Student(6, "marina", "marina",5);
        students[6] = new Student(7, "Sissy", "Sissy",10);
        students[7] = new Student(8, "Xristos", "Xristos",7);
        students[8] = new Student(9, "Mary", "Mary",6);
        students[9] = new Student(10, "Elisavet", "Elisavet",7);
        
        for(int i = 5; i <10; i++)        {
            tree.insertElement(students[i]);
        } 
        
        //Emfanisi poy briskete o student me max bathmo 
        System.out.println("CompareListTree: "+ compareListTree( list, tree ) );
        //Εισαγωγγη αρχειου τχτ
        File file = new File("agones.txt");   
        BufferedReader txt = new BufferedReader(new FileReader(file)); 

        String st; int  gypedoyxos=0; int filoxenumenos=0;  int  x=0;
        //Διαβαζε την καθε γραμμη οσοτου να μην βρει τιποτα 
        while ((st = txt.readLine() ) != null) {//πρωτη γραμμα γυπεδουχος
            st=txt.readLine();//2η fιλοξενουμενος
            st=txt.readLine();//3η σκορ
            if ("1".equals(st)){
                gypedoyxos++;
            }else if ("2".equals(st)){
                filoxenumenos++;
            }else if ("x".equals(st)){
                x++;
            }            
        } 
        //νεο αρχειο για εξαγωγη αποτελεσματον
        RandomAccessFile FT1out = new RandomAccessFile("DOMES_Exams","rw");
        FT1out.writeBytes(gypedoyxos+"\n");//FT1out.writeByte(gypedoyxos);
        FT1out.writeBytes(filoxenumenos+"\n");////FT1out.writeByte(filoxenumenos);
        FT1out.writeBytes(x+"");////FT1out.writeByte(x);
        
        /*
        System.out.println("gypedoyxos wins "+gypedoyxos);
        System.out.println("filoxenumenos  wins "+filoxenumenos);
        System.out.println("x wins "+x);
        */
    }    
}
