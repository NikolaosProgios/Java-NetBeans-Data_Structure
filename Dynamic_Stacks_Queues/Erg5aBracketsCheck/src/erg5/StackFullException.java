
package erg5;


class StackFullException
  extends RuntimeException
{
  public StackFullException(String err)
  {
    super(err);
  }
}
