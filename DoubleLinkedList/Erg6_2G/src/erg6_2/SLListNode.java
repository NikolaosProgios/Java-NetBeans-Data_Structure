package erg6_2;

class SLListNode{
    // Instance fields
    private Object data;
    private SLListNode nextNode;
    // Instance methods
    public SLListNode()
    {
        this(null, null);//data = null;//nextNode = null; 
    }

    public SLListNode(Object it, SLListNode n)
    {
        data = it;
        nextNode = n;
    }

    public void setItem(Object newItem)
    {
        data = newItem;
    }

    public void setNext(SLListNode newNext)
    {
        nextNode = newNext;
    }

    public Object getItem()
    {
        return data;
    }

    public SLListNode getNext()
    {
        return nextNode;
    }

    public Object getNodeData()
    {
        return data;
    }

    public SLListNode getNextNode()
    {
        return nextNode;
    }

    public void setNodeData(Object d)
    {
        data = d;
    }

    public void setNextNode(SLListNode n)
    {
        nextNode = n;
    }

    public String toString()
    {
        return "Item: " + data.toString() + " Next: " + nextNode.toString();
    }
}