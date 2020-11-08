/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinaria;

/**
 *
 * @author Stefano
 */
public class ArvoreBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                
        No raiz = new No(4);
        Arvore.AdicionarNo(raiz, 2);
        Arvore.AdicionarNo(raiz, 6);
        Arvore.AdicionarNo(raiz, 1);
        Arvore.AdicionarNo(raiz, 3);
        Arvore.AdicionarNo(raiz, 5);
        Arvore.AdicionarNo(raiz, 7);
        
        Arvore.EmOrdem(raiz);
        Arvore.PreOrdem(raiz);
        Arvore.EmNivel(raiz);
        Arvore.PosOrdem(raiz);
    }
    
}
