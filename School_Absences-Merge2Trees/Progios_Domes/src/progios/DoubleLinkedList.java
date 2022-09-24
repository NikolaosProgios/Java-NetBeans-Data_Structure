package progios;
import java.io.*;

public class DoubleLinkedList implements List{

	private DoubleNode firstNode;
	private DoubleNode lastNode;


	public DoubleLinkedList(){
		firstNode = null;
		lastNode = null;
	}

	public DoubleNode getFirstNode(){
		return firstNode;
	}

	public DoubleNode getLastNode(){
		return lastNode;
	}

	public boolean isEmpty(){
		return (firstNode==null);
	}


	public boolean isFull(){
		return false;
	}

	public int size(){
		int count = 0;
		DoubleNode tempNode = firstNode;

		while (tempNode!=null){
			tempNode = tempNode.getNext();
			count++;
		}
		return count;
	}

	public void insertFirst(Object data){
		if (isEmpty()){
			firstNode = new DoubleNode(null,data,null);
			lastNode = firstNode;
		}
		else{
			DoubleNode tempNode = new DoubleNode(null,data,firstNode);
			firstNode.setPrevious(tempNode);
			firstNode = tempNode;
		}
	}

	public void insertLast(Object data){
		if (isEmpty()){
			lastNode = new DoubleNode(null,data,null);
			firstNode = lastNode;
		}
		else{
			DoubleNode tempNode = new DoubleNode(lastNode,data,null);
			lastNode.setNext(tempNode);
			lastNode = tempNode;
		}
	}

	public Object removeFirst() throws ListEmptyException{
		if (isEmpty()){
		   throw new ListEmptyException("THE LIST IS EMPTY!! NO REMOVAL IS ALLOWED!!");
	    }
        
        Object returnData = firstNode.getItem();
		if (firstNode == lastNode){
			firstNode = null;
			lastNode = null;			
		}
		else{						
			DoubleNode tempNode = firstNode.getNext();
			firstNode.setNext(null);
			tempNode.setPrevious(null);
			firstNode = tempNode;			
		}
		return returnData;
	}

	public Object removeLast() throws ListEmptyException{
		if (isEmpty()){
		   throw new ListEmptyException("THE LIST IS EMPTY!! NO REMOVAL IS ALLOWED!!");
	    }        
        Object returnData = lastNode.getItem();
		if (firstNode == lastNode){
			firstNode = null;
			lastNode = null;
		}
		else{
			DoubleNode tempNode = lastNode.getPrevious();
			lastNode.setPrevious(null);
			tempNode.setNext(null);
			lastNode = tempNode;
		}
		return returnData;
	}

        public void insert(int position, Object data) throws NoSuchListPosition{
		if ((position > size()) || (position < 0)){
		   throw new NoSuchListPosition("NO SUCH POSITION");
	    }
	    if (position == 0){
		   insertFirst(data);
		}
		else if (position == size()){
           insertLast(data);			
		}
		else{
		   DoubleNode pr = firstNode;		   
		   for (int i=1; i<position; i++){
			  pr = pr.getNext();   
		   }
		   DoubleNode ep = pr.getNext();		   		   
		   DoubleNode newNode = new DoubleNode(pr,data,ep);		   
		   pr.setNext(newNode);		   
		   ep.setPrevious(newNode);		   
		}
	}

        public Object remove(int position) throws ListEmptyException, NoSuchListPosition{
		if (isEmpty()){ 
		   throw new ListEmptyException("THE LIST IS EMPTY!! NO REMOVAL IS ALLOWED!!");        
	    }
		if ((position >= size()) || (position < 0)){
		   throw new NoSuchListPosition("NO SUCH POSITION");
	    }
	    if (position == 0){
		   return (removeFirst());
		}
		if (position == size()-1){
           return (removeLast());
		}

 	    DoubleNode delNode = firstNode;		   
		for (int i=0; i<position; i++){
		   delNode = delNode.getNext();   
		}	
		Object returnData = delNode.getItem();
		delNode.getPrevious().setNext(delNode.getNext());
		delNode.getNext().setPrevious(delNode.getPrevious());				
		return returnData;
	}	


	public String toString(){
		DoubleNode tempNode=firstNode;

		String result = "[";

		while (tempNode!=null){
			result += tempNode + " ";
			tempNode = tempNode.getNext();
		}
		return (result+"]");
	}      
        
}