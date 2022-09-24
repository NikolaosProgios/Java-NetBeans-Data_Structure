package examsa;
public class SimpleLinkedList implements List{    
    private SLListNode firstNode, lastNode;
    private int size;
    
    public SLListNode getFirstNode() {        return firstNode;    }

    public SLListNode getLastNode() {        return lastNode;    }
    public SimpleLinkedList() {
        firstNode=lastNode=null;
        size=0;
    }


    public boolean isEmpty( ){
        return(firstNode==null);
    }

    public int size( ){
        return size;
    }

    public void insertFirst(Object data){
        if( isEmpty()){
            firstNode=new SLListNode (data,null);
            lastNode=firstNode;
        }else{
            SLListNode temp=new SLListNode(data,firstNode);
            firstNode=temp;
        }
        size++;
    }
   
    public void insertLast(Object data){
        if(isEmpty()){
            lastNode=new SLListNode(data,null);
            firstNode=lastNode;
        }else{
            SLListNode temp=new SLListNode(data,null);
            lastNode.setNextNode(temp);
            lastNode=temp;
        }
        size++;
    }
    
    public Object removeFirst( ) throws ListEmptyException{
        if(isEmpty()){
            throw new ListEmptyException("Empty List!!!");
        }
        
        Object removedItem=firstNode.getData();
        
        if(firstNode==lastNode){
            firstNode=lastNode=null;
        }else{
            firstNode.setNextNode();
        }
        size--;
        return removedItem;
    }
    
    public Object removeLast( ) throws ListEmptyException{
        if(isEmpty()){
            throw new ListEmptyException("Empty List!!!");
        }
        Object removedItem=lastNode.getData();
        
        if(firstNode==lastNode){
            firstNode=lastNode=null;
        }else{
            SLListNode current=firstNode;
            while(current.getNextNode() != lastNode){
                current=current.getNextNode();
            }
            lastNode=current;
            lastNode.setNextNode();
        }
        size--;
        return removedItem;
    }
    
    public void printList()
    {
        if(isEmpty())
        {
            System.out.println("Empty List");
        }
        else
        {
            SLListNode current = firstNode;

            while(current != null)
            {
                System.out.print(current.getData().toString() + " ");
                current = current.getNextNode();
            }

            System.out.println("\n");
        }
    
    }    

    /*boolean findMax()throws ListEmptyException {
        if(isEmpty()){
            throw new ListEmptyException("Empty List!!!");
        }
        SLListNode current =firstNode;
        
         while(current.getNextNode() != null){
                
         */      
    
}
