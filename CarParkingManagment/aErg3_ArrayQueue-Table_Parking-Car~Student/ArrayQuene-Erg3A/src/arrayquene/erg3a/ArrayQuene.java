package arrayquene.erg3a;


public class ArrayQuene  implements Queue{
    private Object Q[];
    int first=0;int last=0;
    
    public ArrayQuene(){   
        this(5);    
    }
    public ArrayQuene(int cap){   
        Q=new Object[cap];    
    }
    
    public int  size(){   
        return last-first;    
    }
    public boolean  isEmpty(){   
        return first==last;    
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

        if (isEmpty()){
            throw new QueueEmptyException("Queue is empty");
        }
        Object k=Q[first];
        Q[first]=null;
        first++;
        return k;
    }
    public void printerr(){ 

        for (int j=0;j<last-first;j++){ 

            System.out.println(Q.toString()); 
        }
    }
    
    
}
