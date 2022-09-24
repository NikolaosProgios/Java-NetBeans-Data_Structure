package examsa;

/*import examsa.LabInterface;
import examsa.NoSuchStudentException;
import examsa.SLListNode;
import examsa.SimpleLinkedList;
import examsa.Student;
*/
public class LabB implements LabInterface{
    
    private SimpleLinkedList sll;

    public LabB() {
        sll=new SimpleLinkedList();
    }
    
    public void enroll(Student S)    {
        sll.insertLast(S);
    }    
//*********************
    public Student find(int AM) throws NoSuchStudentException{
        boolean flag=false;
        Student student = null;
        for(SLListNode position=sll.getFirstNode();position != null;position=position.getNextNode()){
            student=(Student) position.getData();
            if(student.getAM()==AM){
                flag=true;
                return student;
            }
        }
        if(flag==false){
                throw new NoSuchStudentException("Den uparxei o foithths");
        }
        return student;        
    }
    
    /*Note note , no use this method find2
    public Student find2(int AM) throws  NoSuchStudentException {        
        Student stud5=new Student(199999, " ",2,7);
        for(int i = 0; i < labs.length; i++){
            if(labs[i].getAM() == AM) {
                return stud5=labs[i];
            }
        }
        if (stud5.getAM()==199999){
            throw new NoSuchStudentException("Foititis de yprxei");
        }
        return stud5;
    }
*/
    public void updateGrade(int AM,double Grade) throws NoSuchStudentException{
        boolean flag=false;
        Student student =null;
        for(SLListNode position=sll.getFirstNode();position != null;position=position.getNextNode()){
            student=(Student) position.getData();
            if(student.getAM()==AM){
                student.setVathmos(Grade);
                flag=true;
            }
        }
        if(flag==false){
            throw new NoSuchStudentException("Den uparxei o foithths");
        }
    }
    
    /*Note note , no use this method updateGrade2
    public void updateGrade2(int AM , double Grade )    throws NoSuchStudentException{
        Student stud5=new Student(199999, "  ", 0 , 0 );       
        for(int i = 0; i < labs.length; i++){
            if(labs[i].getAM() == AM) {
                labs[i].setVathmos(Grade);
                stud5=labs[i];
            }
        }        
        if (stud5.getAM()==199999 ){
            throw new NoSuchStudentException("Foititis de yprxei");
        }
        /*if (Grade>10 || Grade <0 ){
            throw new NoSuchStudentExeption("Lathos bathmos ");
        }*/
}
