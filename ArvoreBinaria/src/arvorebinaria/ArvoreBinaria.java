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
        
        No arvore = new No(4);
        arvore.AdicionarNo(arvore, 2);
        arvore.AdicionarNo(arvore, 6);
        arvore.AdicionarNo(arvore, 1);
        arvore.AdicionarNo(arvore, 3);
        arvore.AdicionarNo(arvore, 5);
        arvore.AdicionarNo(arvore, 7);
        
        //arvore.EmOrdem(arvore);
        //arvore.PreOrdem(arvore);
        //arvore.EmNivel(arvore);
        arvore.PosOrdem(arvore);
    }
    
}
