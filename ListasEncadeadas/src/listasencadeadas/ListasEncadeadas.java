/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasencadeadas;

/**
 *
 * @author Stefano
 */
public class ListasEncadeadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        
        Cliente c1 = new Cliente();
        c1.nome = "Stefano";
        
        Cliente c2 = new Cliente();
        c2.nome = "Maria";
        
        Cliente c3 = new Cliente();
        c3.nome = "Joao";
        
        lista.Adicionar(c1);
        lista.Adicionar(c2);
        lista.Adicionar(c3);
        
        System.out.println(lista.exibeLista());
    }
    
}
