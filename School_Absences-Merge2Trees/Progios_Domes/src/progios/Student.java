package progios;


public class Student {

// PRIVATE INSTANCE FIELDS 
private int am;
private String Name;
private int absences;
private float grade;

public Student(int am,String Name,int absences,float grade) {
    this.am = am;
    this.Name = Name;
    this.absences = absences;
    this.grade = grade;
}

public int getAm() {
    return am;
}

public String getName() {
    return Name;
}

public int getAbsences() {
    return absences;
}

public float getGrade() {
    return grade;
}

public void setAbsences(int a) {
    absences = a;
}

public void setGrade(float g) {
    grade = g;
}

public String toString() {
    String S = "AM: "+ am + " Ονοματεπώνυμο: "+ Name + " Βαθμός: "+ grade + " Απουσίες: "+ absences;
return S;	
}

}
