/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erg5b;

interface Queue
{
    public int size();

    public boolean isEmpty();

    public boolean isFull();

    public Object front() throws QueueEmptyException;

    public void enqueue(Object item) throws QueueFullException;

    public Object dequeue() throws QueueEmptyException;
}