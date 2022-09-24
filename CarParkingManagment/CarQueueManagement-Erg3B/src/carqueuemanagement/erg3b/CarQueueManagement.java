package carqueuemanagement.erg3b;
import java.util.Scanner; 

class Car {//Antikimeno car~Student
    //pedio
    private String pinakida;

    //getter
    public String getpinakida() {        
        return pinakida;    }

    //Antikimeo
    public Car (String pinakida) {
        this.pinakida = pinakida;
    }
    
    //toString   
    public String toString() {
        return "Car{" + "Arithmos pinakidas=" + pinakida + "}\n";
    }
}

public class CarQueueManagement implements Queue{
    private Object Q[];
    int first=0;int last=0;

    public CarQueueManagement(){   
        this(5);    
    }
    public CarQueueManagement(int cap){   
        Q=new Object[cap];    
    }
    
    public int  size(){   
        return last-first;    
    }
    public boolean  isEmpty(){   
        return first==last;    
    }
    
    public void printerr(){
        for (int j=0;j<last-first;j++){
            System.out.println(Q.toString());
        }
    }
    public boolean isFull(){   
        return size()==Q.length;    
    }
    private void fragma(){
        for (int i=first;i<last;i++){
            Q[i-first]=Q[i];
        }
        last=last-first;
        first=0;
    }
    //Exception
    
    public Object front( ) throws QueueEmptyException{
        if (isEmpty()){
            throw new QueueEmptyException("Queue is empty");
        }
        return Q[first];
    }
    
    public void add(Object item) throws QueueFullException{
        if (isFull()){
            throw new QueueFullException("Queue overflow");
        }
        if (last==Q.length){
            fragma();//ta sproxnei mprosta
        }
        Q[last]=item;
        last++;
    }
    
    public Object remove( ) throws QueueEmptyException{
        Object k;
        if (isEmpty()){
            throw new QueueEmptyException("Queue is empty");
        }
        k=Q[first];
        Q[first]=null;
        first++;
        return k;
    }
    
    
}