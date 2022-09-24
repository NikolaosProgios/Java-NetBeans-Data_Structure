package exams2015ba;
public class SLListNode {
    private Object data;
    private SLListNode nextNode;

    public SLListNode(Object data, SLListNode nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }
    
    public SLListNode(){
        this(null,null);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public SLListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(SLListNode nextNode) {
        this.nextNode = nextNode;
    }

    void setNextNode() {
        this.nextNode=null;
    }
    
    
    
    
}
