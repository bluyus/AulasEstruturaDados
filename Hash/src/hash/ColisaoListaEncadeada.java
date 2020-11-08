/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;


import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Stefano
 */
public class ColisaoListaEncadeada {
    
    public Object[] ArrayAscII;
    
    ColisaoListaEncadeada()
    {
        this.ArrayAscII = new Object[5];
    }
    
    public static Integer Hashing(char letra) 
    {
        return (int)letra % 5;     
    }
    
    public void AdicionarElemento(char letra)
    { 
        int endereco = Hashing(letra); 
        Object posicao = ArrayAscII[endereco];
           
        if (posicao == null)
        {
           List lista = new LinkedList(); 
           ArrayAscII[endereco] = lista;
           posicao = lista;
        } 
        
        ((List)posicao).add(letra);     
    }   
}
