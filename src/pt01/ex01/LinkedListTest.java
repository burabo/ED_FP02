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
public class LinkedListTest<T> {

    private static int cont;
    private NodeTest<T> head;

    //Construtor
    public LinkedListTest() {
    }

    public void add(T o) {

        NodeTest<T> temp = new NodeTest<T>(o);
        NodeTest<T> current = head;

        if (head == null) {
            head = temp;
        } else {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(temp);
        }
        cont++;

    }

    public void remove(int position) {
        
        NodeTest<T> current = head, previous = null;
        
        for (int i = 0; i < position; i++) {   
            previous=current;
            current = current.getNext();
        }                
        current.setNext(current.getNext().getNext());        
        cont--;

    }

    public String ToString() {
        NodeTest<T> current = head;
        while (current != null) {
            System.out.println(current.getElement().toString());
            current = current.getNext();
        }
        return null;
    }
}