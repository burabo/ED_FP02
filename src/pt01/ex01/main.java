/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt01.ex01;

/**
 *
 * @author Gabriel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedListTest lista = new LinkedListTest();
        
        lista.add("1");
        lista.add("2");
        lista.add("3");
               
        lista.remove(0);
        
        lista.ToString();
        
    }
    
}
