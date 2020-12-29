/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package seriefibonacciate100;

/**
 *
 * @author dagma
 */
public class SerieFibonacciAte100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int a=0, b=1, i=0;i<100;b+=a, a=b-a, i++)
            System.out.println(a+" ");
        System.exit(0);
        
    }
    
}
