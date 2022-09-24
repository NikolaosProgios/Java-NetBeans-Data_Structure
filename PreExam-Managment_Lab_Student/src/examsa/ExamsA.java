package examsa;


public class ExamsA {
    public static void main(String[] args) {
        LabB T6 = new LabB();

        Student stud1 = new Student(175000, "Maria",2,7);
        Student stud2 = new Student(175001, "katerina",1,6);
        Student stud3 = new Student(175002, "nick",0,8);

        T6.enroll(stud1);
        T6.enroll(stud2);
        T6.enroll(stud3);         
        
        System.out.println(T6.find(175000));
        System.out.println("Ορισμος βαθμου φοιτητη με αμ: 175000 και βθμμο 8 : OK");
            T6.updateGrade(175000,8);
        
        /*Σκοπευμενα δικα μας  Exeption
        System.out.println("\nΟρισμος βαθμου φοιτητη με αμ: 175009 που δεν 
                    υπρχει  και βaθμο 8 \n");  T6.updateGrade(175006,9);
        */  
      
        System.out.println("\n"+T6.find(175001)); 

        //Σκοπευμενα δικα μας  Exeption
        //System.out.println(T6.find(175009));      
        
    }   
}
