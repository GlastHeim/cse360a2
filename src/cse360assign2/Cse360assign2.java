/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse360assign2;

/**
 *
 * @author vlad
 */
public class Cse360assign2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AddingMachine test = new AddingMachine();
        System.out.println(test);
        test.add(2);
        test.add(3);
        test.subtract(10);
        String printme = test.getTotal()+" log: "+test.toString();
        System.out.println(printme);
    }
    
}
