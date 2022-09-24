package exams2015ba;
public class Exams2015BA_2 {

    public static int counter(SimpleLinkedList sll){
        int pl=0;           
        for(SLListNode position=sll.getFirstNode();position != null;position=position.getNextNode()){
            info_komatos c=  (info_komatos) position.getData();
            if (c.getEdres()>10 && c.getEdres()<20 ){
                pl++;
            }
        }return pl;        
    }
    public static void  deletekommata(SimpleLinkedList sll){
        int p=0;//thesi           
        for(SLListNode position=sll.getFirstNode();position != null;position=position.getNextNode()){
            p++;//thesi+1
            info_komatos c=  (info_komatos) position.getData();
            if (c.getEdres()==0 ){
                sll.remove(p);
            }
        }
    }
    
    public static void main(String[] args) {
       
        SimpleLinkedList sll=new SimpleLinkedList(); 

        info_komatos c1=new info_komatos("kostas",500,3);
        info_komatos c2=new info_komatos("nick",1000,11);
        info_komatos c3=new info_komatos("maria",15,0);
        info_komatos c4=new info_komatos("geor",200,14);

        sll.insertLast(c1);
        sll.insertLast(c2);
        sll.insertLast(c3);
        sll.insertLast(c4);
        System.out.println("count κομματα απο 10εως20 εδρες:  " + counter(sll));   
        deletekommata(sll);
    }    
}

