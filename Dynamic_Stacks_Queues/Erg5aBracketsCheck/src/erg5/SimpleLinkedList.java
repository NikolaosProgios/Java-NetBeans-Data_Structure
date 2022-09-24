package erg5;

public class SimpleLinkedList implements List{
    private SLListNode firstNode, lastNode;
    private int size;

    public SimpleLinkedList(){
        firstNode = lastNode = null;
        size = 0;
    }
 
    public boolean isEmpty() {
        return(firstNode == null);
    }

    public int size() {
        int size = 0;
        for(SLListNode position = firstNode; position != null; position = position.getNextNode()){
            size++;
        }
        return size;
    }

    public void insertFirst(Object data) { 
        if(isEmpty()){
            firstNode = new SLListNode(data, null);
            lastNode=firstNode;
        }
        else {
            SLListNode temp = new SLListNode(data, firstNode);
            firstNode.setNextNode(temp);
            firstNode=temp;
       }  size++;
    }
        //for(position =first;position.getNextNode() != lastNode;position = position.getNextNode()); χωρις σωμα απλα κανει το position

    public void insertLast(Object data) {
       if(isEmpty()){
            firstNode = new SLListNode(data, null);
            lastNode=firstNode;
        }
        else      {
            SLListNode temp = new SLListNode(data, null);
            lastNode.setNextNode(temp);
            lastNode=temp;
       }size++;
    }

    public Object removeFirst() throws ListEmptyException {
        if (isEmpty( )){
            throw new ListEmptyException("Empty List!!!");
        }
        Object removeItem= lastNode.getNodeData();
        if (firstNode == lastNode){
            firstNode = lastNode = null;
        }
        else {
            firstNode=firstNode.getNextNode();
        }
        size--;
        return removeItem;
    }

    public Object removeLast() throws ListEmptyException {
        if (isEmpty( )){
            throw new ListEmptyException("Empty List!!!");
        }
        Object removeItem = lastNode.getNodeData();
        if (firstNode == lastNode){
            firstNode = lastNode = null;
        }
        else {
            SLListNode position =firstNode;
        /*
        for(position = first; position.getNextNode() != last; position = position.getNextNode());
        last = position;
        position.setNextNode(null);
        Αντι για το while 
        */
        while(position.getNextNode()!=lastNode){
            position=position.getNextNode();
        }
        lastNode=position;
        position.setNextNode(null);
        }
        size--;
        return removeItem;
    }

    public void printList() throws ListEmptyException{
        if (isEmpty()){
            throw new ListEmptyException("List is Empty: ");
        }
        for(SLListNode position = firstNode; position!=null; position=position.getNextNode()){
            System.out.print(position.getNodeData().toString());
        }
        /*
        SLListNode position = firstNode;
	while (position != null){
            System.out.println(position.getNodeData());
            position = position.getNextNode();
	}
        */
    }
    public SLListNode getFirst(){
        return firstNode;
    }    
}