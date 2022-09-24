package erg6_2;

class DoubleNode extends SLListNode { 
    private Object item;
    private DoubleNode next, previous;
    
    // Instance fields  //extends SLListNode
    private DoubleNode previousNode;  
    // Instance methods   //extends SLListNode
    public DoubleNode getPreviousNode( )  {
            return previousNode ; 
    }
    //extends SLListNode
    public void setPreviousNode(DoubleNode n) {
      previousNode=n;
    }
       
    public DoubleNode()    {
        this(null, null, null);
    }
    public DoubleNode(Object data, DoubleNode n, DoubleNode p)    {
        item = data;
        next = n;
        previous = p;
    }

    public Object getItem()    {
        return item;
    }

    public DoubleNode getNext()    {
        return next;
    }

    public DoubleNode getPrevious()    {
        return previous;
    }

    public void setItem(Object newItem)    {
        item = newItem;
    }

    public void setNext(DoubleNode newNext)    {
        next = newNext;
    }

    public void setPrevious(DoubleNode newPrevious)    {
        previous = newPrevious;
    }

    public String toString()    {
        return item.toString();
    }
}
