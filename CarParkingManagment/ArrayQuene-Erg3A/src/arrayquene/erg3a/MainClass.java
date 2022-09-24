
package arrayquene.erg3a;


public class MainClass {
    public  static void main(String []args){
        int megethos=5;
        ArrayQuene Q=new ArrayQuene(megethos);
        Student q1=new Student(175002,"nikos","progios",19,'m',0,8);
        Student q2=new Student(175003,"takis","taki",22,'m',2,7);
        Student q3=new Student(175004,"soula","soul",24,'f',1,9);
        Student q4=new Student(175005,"katerina","maki",18,'m',0,10);
        Student q5=new Student(175006,"nikolas","nick",23,'m',1,9);
        //Gemisma ArrayQuene
        Q.add(q1);
        Q.add(q2);
        Q.add(q3);
        Q.add(q4);
        Q.add(q5);
    
        System.out.print("Μέγεθος ουράς: "+Q.size()+" απο "+megethos +"\n");
        System.out.print("Eίναι άδεια η ουρά ; "+ Q.isEmpty()+"\n");
        System.out.print("Eίναι γεμάτει  η ουρά ; "+ Q.isFull()+"\n");
        
        System.out.println("\nRemove: "+Q.remove());
        //Q.add(q5);
        System.out.print("Μέγεθος ουράς: "+Q.size()+" απο "+megethos +"\n");
        System.out.print("Eίναι άδεια η ουρά ; "+ Q.isEmpty()+"\n");
        System.out.print("Eίναι γεμάτει  η ουρά ; "+ Q.isFull()+"\n");
        System.out.print("Αφαιρεση όλων +1:\n"); 
        Q.remove();Q.remove();Q.remove();Q.remove();Q.remove();
        
    }
}
