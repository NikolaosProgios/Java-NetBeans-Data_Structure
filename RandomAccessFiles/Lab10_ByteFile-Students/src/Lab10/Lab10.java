package Lab10;
import java.io.*;

public class Lab10 {

    public static void main(String[] args) {
        try {
            RandomAccessFile FT1out = new RandomAccessFile("DOMES_Lab1","rw");
            /* Προτοποθέτηση αρχείου με 20 κενές εγγραφές φοιτητών
	    Κάθε φοιτητής καταλαμβάνει 72 bytes στο αρχείο 
	    (4 bytes ο ΑΜ + 30 bytes το επίθετο + 30 bytes το όνομα + 
            4 bytes οι απουσίες + 4 bytes ο βαθμός)
	     */        
            for (int i=0;i<20;i++) {
                Student S= new Student(12001+i);
		S.writeStudent(FT1out);
            }
            /*Εναλλακτικά θα μπορούσα να δημιουργήσω το προτοποθετημένο αρχείο 
            * ως ένα αρχείο από bytes με τιμή 0 το καθένα.
            * Ο αριθμός των bytes ισούται με τον αριθμό των εγγραφών 
            * επί το μήκος της κάθε εγγραφής:
            * 
            FileOutputStream FT1out = new FileOutputStream("DOMES_Lab1");        
            for (int i=0;i<20*72;i++) {
		FT1out.write(0);
            }
            */
            FT1out.close();
            
            // Νέο Ανοιγμα του αρχείου για επεξεργασία  ανεξάρτητα από το πώς δημιουργήθηκε
            RandomAccessFile FT1 = new RandomAccessFile("DOMES_Lab1","rw");
            
            // εγγραφή του φοιτητή με αριθμό μητρώου 12012
            Student S1 = new Student(12012,"Papadopoulos", "Dimitris");
            FT1.seek((S1.getAm()-12001)*72);//brhskoyme την θεση που θα μπει, αναλογος το αμ
            S1.writeStudent(FT1);
            
            // εγγραφή του φοιτητή με αριθμό μητρώου 12001
            Student S2 = new Student(12001,"Papadakis", "Thodoris");
            FT1.seek((S2.getAm()-12001)*72); // Αρχή του αρχείου (byte 0)
            S2.writeStudent(FT1);
            Student S = new Student();        
            
            // Εμφάνιση του φοιτητή με αριθμό μητρώου 12012 στην οθόνη
            FT1.seek((12012-12001)*72); 
            S.readStudent(FT1);// διαβασε τα 72 byte apo και μετα 
            System.out.println(S.toString());
            
            // Εμφάνιση του φοιτητή με αριθμό μητρώου 1201 στην οθόνη
            FT1.seek((12001-12001)*72); // Ο πρώτος φοιτητής του αρχείου 
            S.readStudent(FT1);
            System.out.println(S.toString());
            
            // Καταχώριση απουσίας στο φοιτητή με αριθμό μητρώου 12012
            FT1.seek((12012-12001)*72);//βρισκω που ειναι ο φοιτητης
            S.readStudent(FT1);        //τον διαβαζω 
            S.setAbsences(S.getAbsences()+1);
            FT1.seek(FT1.getFilePointer()-72); // πήγαινε ξανά στην αρχή της εγγραφής του 12012
            S.writeStudent(FT1);
            
            // Καταχώρηση της βαθμολογίας φοιτητή με αριθμό μητρώου 12012
            FT1.seek((12012-12001)*72);//βρισκω που ειναι ο φοιτητης
            S.readStudent(FT1);        //τον διαβαζω 
            S.setGrade(8);
            FT1.seek(FT1.getFilePointer()-72); // πήγαινε ξανά στην αρχή της εγγραφής
            S.writeStudent(FT1);//βαλε το αλαγμενο S πανω στο παλιο S
            
            // Εμφάνιση του φοιτητή με αριθμό μητρώου 12012 στην οθόνη
            FT1.seek((12012-12001)*72); 
            S.readStudent(FT1);
            System.out.println(S.toString());
            
            // Διαγραφή ενός φοιτητή από το αρχείο, με αριθμό μητρώου 12012
            FT1.seek((12012-12001)*72);//βρισκω που ειναι ο φοιτητης
            S=new Student(12012);//Δημιουργω εναν καινουργιο φοιτητητη με ιδιο ΑΜ, κενον
            /*
            S.readStudent(FT1);        //τον διαβαζω 
            S.setFirstName(""); 
            S.setLastName("");                               
            S.setGrade(0);
            S.setAbsences(0);            
            FT1.seek(FT1.getFilePointer()-72); // πήγαινε ξανά στην αρχή της εγγραφής
            */
            S.writeStudent(FT1);//και το τοποθετω πανω σε αυτον που θελω να σβησω 
            
            // Εμφάνιση του φοιτητή με αριθμό μητρώου 12012 στην οθόνη
            FT1.seek((12012-12001)*72); 
            S.readStudent(FT1);
            System.out.println(S.toString());           
            
            FT1.close();

            // Νέο Ανοιγμα του αρχείου για επεξεργασία  ανεξάρτητα από το πώς δημιουργήθηκε
            RandomAccessFile FT2 = new RandomAccessFile("DOMES_Lab1","rw");
            
            //Να τυπώνει μία λίστα με τις βαθμολογίες των φοιτητών
            
            for (int i=0;i<20;i++) {   
                FT2.seek((S.getAm()-12001)*72);//βρισκω που ειναι ο φοιτητης
                S.readStudent(FT2);
                if (S.getLastName()!=""){
                    System.out.println(S.getGrade());
                }                               
            }
            
            System.out.println("\n");
            //Να τυπώνει μόνον τους φοιτητές που πέρασαν το μάθημα
            for (int i=0;i<20;i++) {   
                FT2.seek((S.getAm()-12001)*72);//βρισκω που ειναι ο φοιτητης
                S.readStudent(FT2);
                if (S.getGrade()>=4){
                    System.out.println(S.getAm());
                }                               
            }
        }
	catch (IOException e) {
            System.out.println("ERROR: " + e);
	}
    
    }
}