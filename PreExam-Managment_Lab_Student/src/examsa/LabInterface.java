
package examsa;

public interface LabInterface{
    
    public void enroll(Student S);
    public Student find(int AM) throws  NoSuchStudentException ;  
    public void updateGrade(int AM , double Grade )    throws NoSuchStudentException;
}

