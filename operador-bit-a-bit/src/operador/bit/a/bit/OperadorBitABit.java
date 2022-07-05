/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operador.bit.a.bit;

/**
 *
 * @author Marcos
 */
public class OperadorBitABit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1 = 89;
        int n2 = 60;
        
        System.out.println(n1 & n2); //And
        System.out.println(n1 | n2); //Or
        System.out.println(n1 ^ n2); //Or Exclusive
    }
    
}
