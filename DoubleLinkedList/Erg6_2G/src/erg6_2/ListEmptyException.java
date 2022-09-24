
package erg6_2;
class ListEmptyException extends RuntimeException
{
    public ListEmptyException(String err)
    {
        super(err);
    }
}