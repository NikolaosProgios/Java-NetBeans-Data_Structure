package carqueuemanagement.erg3b;





public interface Queue{ 
    public int size( );
    // Returns the size of the queue
    public boolean isEmpty( );
    // Returns true if the queue is empty
    public boolean isFull();
    // Returns true if the queue is full
    public Object front( ) ;
    // Returns the first element of the queue
    public void add(Object item) ;
    // Adds an element at the end of the queue
    public Object remove( ) ;
    // Removes the first element of the queue
}   