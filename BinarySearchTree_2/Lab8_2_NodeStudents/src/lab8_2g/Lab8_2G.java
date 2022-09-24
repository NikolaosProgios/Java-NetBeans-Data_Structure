
package lab8_2g;


public class Lab8_2G {
    
    public static void main(String[] args)
    {
        BSTree tree = new BSTree();

        Student[] students = new Student[5];

        students[0] = new Student(1, "Kappa");
        students[1] = new Student(5, "Keepo");
        students[2] = new Student(3, "Asdasd");
        students[3] = new Student(2, "Dsasad");
        students[4] = new Student(4, "GFsssd");

        for(int i = 0; i < students.length; i++)        {
            tree.insertElement(students[i]);
        }
        //Pinakas antikimenon 
        Object[] newStudent = tree.sort();//in order SORT  // απο τον μικροτερο στο μεγαλυτερο 

        for(int i = 0; i < newStudent.length; i++)        {
            System.out.println(((Student) newStudent[i]).getAM() + " " 
                    + ((Student) newStudent[i]).getName());
        }
    }
}