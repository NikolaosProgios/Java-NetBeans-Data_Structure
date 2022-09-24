package erg5;

//βοηθιτικη  η LinkedStack, 
//χρεισημοποιούμε μια stack που περιεχει τυπου 
//SimpleLinked List Object 
public class LinkedStack implements Stack{    
    private SimpleLinkedList l =new SimpleLinkedList();        
    //int index=-1;    
    public int size(){
        return l.size();//l.size opoy l einai SimpleLinkedList poy eixei size() method
    }
    public boolean isEmpty(){
        return l.isEmpty();//l.size opoy l einai SimpleLinkedList poy eixei isEmpty() method
    }
    public boolean isFull(){
        return false;
    }

    public Object top( ) throws StackEmptyException{
        if (isEmpty()){ throw new StackEmptyException("SimpleLinkedList is empty");   }
        Object temp;
        temp=this.pop();
        this.push(temp);
        return temp;       
    }
   
    public void push(Object item) throws StackFullException{
        if (isFull()){ throw new StackFullException("stack overflow");  }
        l.insertFirst(item);
    }
    
    public Object pop( ) throws StackEmptyException{
        Object element;
        if (isEmpty()){ throw new StackEmptyException("stack is empty");  }
        return l.removeLast();
    }
}