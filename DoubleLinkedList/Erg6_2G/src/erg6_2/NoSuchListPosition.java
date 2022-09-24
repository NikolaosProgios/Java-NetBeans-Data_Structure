
package erg6_2;

class NoSuchListPosition extends RuntimeException
{
    public NoSuchListPosition(String err)
    {
        super(err);
    }
}