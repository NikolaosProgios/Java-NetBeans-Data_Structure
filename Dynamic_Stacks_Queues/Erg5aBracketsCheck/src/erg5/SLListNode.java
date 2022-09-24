package erg5;

/**
 *
 * @author nikos
 */
public class SLListNode{ // Instance fields
    private Object data;
    private SLListNode nextNode;
    // Instance methods
    
    public SLListNode(Object data,SLListNode nextNode){
        this.data=data;
        this.nextNode=nextNode;
    }
    public SLListNode(){
        this(null,null);//data = null;//nextNode = null;        
    }

    public Object getNodeData(){
        return data;
    }
    
    public void setNodeData(Object d){
        data = d;
    }
    
    public void setNextNode(SLListNode n){
        this.nextNode = n;
    }
    public SLListNode getNextNode(){
        return nextNode;
    }

    public String toString(){
            return data.toString();
        }
}

