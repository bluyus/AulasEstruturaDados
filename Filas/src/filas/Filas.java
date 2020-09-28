/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filas;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Stefano
 */
public class Filas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Queue<Cliente> filaJava = new LinkedList();
        
        Cliente c1 = new Cliente();
        c1.nome = "Stefano";
        
        Cliente c2 = new Cliente();
        c2.nome = "Maria";
        
        filaJava.add(c1);
        
        System.out.println(filaJava.element().nome);
        
        filaJava.add(c2);
        
        System.out.println(filaJava.element().nome);
        
        filaJava.remove();
        
        System.out.println(filaJava.element().nome);
        
        //////////////////////////////////////////
        
        Fila filaImplementacao = new Fila();
        
        filaImplementacao.enqueue(c1);
        
        System.out.println(filaImplementacao.getProximo().nome);
        
        filaImplementacao.enqueue(c2);
        
        System.out.println(filaImplementacao.getProximo().nome);
        
        filaImplementacao.dequeue();
        
        System.out.println(filaImplementacao.getProximo().nome);
        
        filaImplementacao.dequeue();
        
        filaImplementacao.dequeue();
    }
    
}
