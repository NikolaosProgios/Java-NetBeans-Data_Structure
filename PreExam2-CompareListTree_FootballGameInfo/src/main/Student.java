package main;
import java.io.*;

public class Student implements Comparable{

	private int am;
	private String lastName;
	private String firstName;
	private int absences;
	private float grade;

	public Student() {
		this(0,"","",0); 	
	}

	public Student(int am) {
		this(am,"               ","               ",0); 	
	}		

	public Student(int am,String lName,String fName, float lgrade) {
		this.am = am;
		firstName = fName;
		lastName = lName;
		grade = lgrade;
                absences = 0;

	}

	public int getAm() {		return am;	}

	public String getLastName() {		return lastName;	}

	public String getFirstName() {		return firstName;	}
        
        public void setLastName(String ln) {		lastName = ln;	}
        
        public void setFirstName(String fn) {		firstName = fn;	}

	public int getAbsences() {		return absences;	}

	public float getGrade() {		return grade;	}

	public void setAbsences(int a) {		absences = a;	}

	public void setGrade(float g) {		grade = g;	}

	public String toString() {
		String S = "AM: "+ am + " Επίθετο: "+ lastName + " Όνομα: " + firstName +
                                " Βαθμός: "+ grade + " Απουσίες: "+ absences;
		return S;	
	}

	/* Ολες οι βασικές λειτουργίες (εισαγωγή, διαγραφή, 
	 * καταχώριση βαθμολογίας, καταχώριση απουσιών, κλπ 
	 * βασίζονται στις παρακάτω δύο μεθόδους writeStudent 
	 * στο αρχείο και readStudent από το αρχείο
	*/

	public void writeStudent(RandomAccessFile F) throws IOException {
		F.writeInt(am);	// 4 bytes στο αρχείο
		writeString15(F,lastName);	// 30 bytes στο αρχείο (15 x 2)
		writeString15(F,firstName);	// 30 bytes στο αρχείο (15 x 2)
		F.writeInt(absences);	// 4 bytes στο αρχείο
		F.writeFloat(grade);	// 4 bytes στο αρχείο
	}

	private void writeString15(RandomAccessFile F, String S) throws IOException {
		int LengthS=S.length();
		if (LengthS==15) 
			F.writeChars(S);
		else if (LengthS >15) {
			for(int i=0;i<15;i++){
				F.writeChar(S.charAt(i));
			}
		}
		else {
			for(int i=0;i<LengthS;i++){
				F.writeChar(S.charAt(i));
			}
			for(int i=LengthS;i<15;i++){
				F.writeChar(' ');    
			}
		}
	}
	
    public void readStudent(RandomAccessFile F) throws IOException {
	String S;
	am = F.readInt();
	S="";
	for(int i=0;i<15;i++) {
		S=S+F.readChar();
	}
	lastName = S;
	S="";
	for(int i=0;i<15;i++) {
		S=S+F.readChar();
	}
	firstName=S;
	absences = F.readInt();
	grade = F.readFloat();
    }
    
    public int compareTo(Object S)    {
        if(am < ((Student) S).getAm())
        {
            return -1;
        }
        else
        {
            if(am > ((Student) S).getAm())
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }
}	
