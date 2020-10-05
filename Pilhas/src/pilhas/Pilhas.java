/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhas;

/**
 *
 * @author Stefano
 */
public class Pilhas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pilha p = new Pilha();
        
        Cliente c = new Cliente();
        c.nome = "João";
        
        p.empilhar(c);
        
        Cliente c2 = new Cliente();
        c2.nome = "Maria";
        
        p.empilhar(c2);
        
        
        Cliente c3 = new Cliente();
        c3.nome = "Pedro";
        
        p.empilhar(c3);
        
        Cliente c4 = p.desempilhar();
        System.out.print(c4);
        
    }
    
}
