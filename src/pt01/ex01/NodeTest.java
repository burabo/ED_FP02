/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt01.ex01;

/**
 *
 * @author Gabriel
 * @param <T>
 */
public class NodeTest<T> {

    private T element;
    private NodeTest<T> next;

    public NodeTest(T element) {
        this.element = element;
    }

    public NodeTest(T element, NodeTest<T> previous, NodeTest<T> next) {
        this.element = element;
        this.next = next;
    }

    public NodeTest<T> getNext() {
        return next;
    }

    public void setNext(NodeTest<T> next) {
        this.next = next;
    }
       
    public T getElement() {
        return this.element;
    }

    public void setElement(T element) {
        this.element = element;
    }
    
    
    
    
}
