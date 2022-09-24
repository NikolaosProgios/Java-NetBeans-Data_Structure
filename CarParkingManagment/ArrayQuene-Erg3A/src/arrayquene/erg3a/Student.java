package arrayquene.erg3a;

/**
 *
 * @author nikos
 */
public 
class Student{
    //pedia
    private int am;
    private String name;
    private String epiitheto ;
    private double age;
    private char filo;
    private int apousies;
    private double bathmos;
    
    //getters
    public double getAge() {        return age;    }
    public int getAm() {        return am;    }
    public int getApousies() {        return apousies;    }
    public double getBathmos() {        return bathmos;    }
    public String getEpiitheto() {        return epiitheto;    }
    public char getFilo() {        return filo;    }
    public String getName() {        return name;    }
    
    //Antikimeo
    public Student(int am, String name, String epiitheto, double age, char filo, int apousies, double bathmos) {
        this.am = am;
        this.name = name;
        this.epiitheto = epiitheto;
        this.age = age;
        this.filo = filo;
        this.apousies = apousies;
        this.bathmos = bathmos;
    }
    
    //toString
    public String toString() {
        return "Student{" + "am=" + am + ", name=" + name + ", epitheto=" + epiitheto + ", age=" + age + ", filo=" + filo + ", apousies=" + apousies + ", bathmos=" + bathmos + "}\n";
    }
}