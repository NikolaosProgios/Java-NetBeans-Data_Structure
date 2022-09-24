package erg1;

public class MainClass {
    public static void main(String[] args)
    {
        //Tmima 1
        Lab T1 = new Lab();
        //mathites
        Student stud1 = new Student(1, "Asdasd", "Aasdasd", 20, 'M', 0, 4.0);
        Student stud2 = new Student(2, "Dsadas", "Dsadsd", 18, 'F', 2, 2.0);
        Student stud3 = new Student(3, "Hasfa", "Hsdfsd", 19, 'M', 5, 6.0);
        //Εισαγωγή φοιτητή στο τμήμαΤ1
        T1.insert(stud1);
        T1.insert(stud2);
        T1.insert(stud3);

        //Tmima 2
        Lab T2 = new Lab();

        T2.insert(new Student(1, "Tasdasd", "Tasdas", 18, 'M', 4, 9.0));
        T2.insert(new Student(2, "Cxadas", "Casdas", 25, 'F', 2, 6.0));
        T2.insert(new Student(3, "Ljsdfa", "Lkasda", 23, 'F', 1, 3.0));

        Lab T3 = new Lab();
        //Εισαγωγή φοιτητή στο τμήμαΤ3
        T3.insert(new Student(1, "Kappa", "Keepo", 20, 'M', 2, 9.0));
        T3.insert(new Student(2, "Test", "Test", 18, 'F', 5, 4.0));
        T3.insert(new Student(3, "Giaku", "Krikkos", 19, 'M', 0, 5.0));
        
        //Αναζήτηση φοιτητή με βάση το αριθμό μητρώου 
        System.out.println("Anazitisi fititi me AM 2 einai stin thesi: " + T3.search(2));

        T3.printall();

        System.out.println("Epitixies: " + T3.findSuccess());
        System.out.println("Apotuxies: " + T3.findFail());
        System.out.println("MO " + T3.findMO() + "\n");

        LaboratoryCourse domes = new LaboratoryCourse();

        domes.insert(T1);
        domes.insert(T2);
        domes.insert(T3);

        domes.printAllStudent();
        domes.printAllSucessFail();
        domes.printAllMo();
        domes.printAllPercentages();
    }
} 
