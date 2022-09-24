package progios;

public class DoubleNode{

    private Object item;
    private DoubleNode next;
    private DoubleNode previous;

	public DoubleNode(){
		this(null, null, null);
	}

	public DoubleNode(DoubleNode prevN, Object d, DoubleNode nextN){
		previous = prevN;
		item = d;
		next = nextN;
	}

    public Object getItem() {
       return(item); 
    }

    public DoubleNode getNext(){
       return(next); 
    }

    public DoubleNode getPrevious( ) {
       return(previous); 
    }

    public void setItem(Object newItem) {
       item = newItem; 
    }

    public void setNext(DoubleNode newNext) {
       next = newNext; 
    }

    public void setPrevious(DoubleNode newPrevious) {
       previous = newPrevious; 
    }
    
    public String toString(){
		String s = "("+item+")";
		return s;
	}
}
