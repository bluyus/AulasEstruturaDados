/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursão;

/**
 *
 * @author Stefano
 */
public class Recursão {

    /**
     * @param args the command line arguments
     */
    
    public static int Fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return Fibonacci(n-1) + Fibonacci(n-2);        
    }
    
    public static int Fatorial(int n) {
        if (n == 1) return 1;
        else return n + Fatorial(n-1);
    }
    
    public static int MDC(int p, int q) {
        if (q == 0) return p;
        else return MDC(q, p%q);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int valor = Fibonacci(8);
        System.out.println(valor);
        
        int valor2 = Fatorial(4);
        System.out.println(valor2);
        
        int valor3 = MDC(23732, 180);
        System.out.println(valor3);
    }
    
}
