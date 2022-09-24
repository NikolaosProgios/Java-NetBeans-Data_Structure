/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erg1;

/**
 *
 * @author nikos
 */
public 
class Lab{
	/*private String tmima;
    private Student[] students;
	public Lab(){
        students=new Student[25];
    }// dimiougria pinaka me 25 thessis
    public Lab(int size){
        students=new Student[size];
    }// dimiougria pinaka me size thessis
    
    public Lab(String tmima,int size){
        this.tmima=tmima;
        students=new Student[size];
    }// dimiougria pinaka me size thessis kai tmima
	*/
	
    Student[] labs = new Student[3];
    //Εισαγωγή φοιτητή στο τμήμα
    public void insert(Student student)    {
        for(int i = 0; i < labs.length; i++)
        {
            if(labs[i] == null)
            {
                labs[i] = student;
                break;
            }
        }
    }
    //Διαγραφή φοιτητή από το τμήμα
    public void delete(int AM)    {
        for(int i = 0; i < labs.length; i++)        {
            if(labs[i].getAM() == AM)            {
                labs[i] = null;
                break;
            }
        }
    }
    //Αναζήτηση φοιτητή με βάση το αριθμό μητρώου
    public int search(int AM)    {
        for(int i = 0; i < labs.length; i++)        {
            if(labs[i].getAM() == AM)            {
                return i;
            }
        }
        return -1;
    }
	/*
		public Student find(int AM) throws  NoSuchStudentExeption {
        
        Student stud5=new Student(199999, " ",2,7);
        for(int i = 0; i < labs.length; i++){
            if(labs[i].getAM() == AM) {
                return stud5=labs[i];
            }
        }
        if (stud5.getAM()==199999){
            throw new NoSuchStudentExeption("Foititis de yprxei");
        }
        return stud5;
    }
	*/
     //Εκτύπωση παρουσιολόγιου για το τμήμα
    public void printall()    {
        String string = "";

        for(int i = 0; i < labs.length; i++)        {
			if (labs[i]!=null){
				string += "\nAM: " + labs[i].getAM() + "\nEpitheto: " + labs[i].getLastname() + "\nOnoma: " + labs[i].getName() + "\nApousies: " + labs[i].getApousies() + "\nVathmos: " + labs[i].getVathmos() + " \n";
			}
		}
        System.out.println(string);    }

    public int findSuccess()    {
        int count = 0;

        for(int i = 0; i < labs.length; i++)        {
            if(labs[i].getVathmos() >= 5.0)            {
                count++;
            }
        }
        return count;    }

    public int findFail()    {
        //findSuccess()-size()
        int count = 0;
        for(int i = 0; i < labs.length; i++)        {
            if(labs[i].getVathmos() < 5)            {
                count++;
            }
        }

        return count;
    }

    public double findMO()    {
        double MO = 0;
        for(int i = 0; i < labs.length; i++)   {
            MO += labs[i].getVathmos();
        }
        return MO / labs.length;
    }
}
