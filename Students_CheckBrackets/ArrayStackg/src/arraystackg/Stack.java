/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystackg;

interface Stack{
    public int size();
    public boolean isEmpty();
    public boolean isFull();
    public Object top() throws StackEmptyException;
    public void push(Object item) throws StackFullException;
    public Object pop() throws StackEmptyException;
}