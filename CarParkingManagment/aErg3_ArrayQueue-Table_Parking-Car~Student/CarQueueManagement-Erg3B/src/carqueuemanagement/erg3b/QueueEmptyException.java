
package carqueuemanagement.erg3b;


public class QueueEmptyException extends RuntimeException{
    public QueueEmptyException(String err){
        super(err);
    }
}