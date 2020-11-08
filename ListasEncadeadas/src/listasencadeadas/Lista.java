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
public class Lista {
    
    No primeiro;
    
    No proximo;
    
    Lista()
    {
        proximo = null;
        primeiro = null;
    }
    
    public void Adicionar(Cliente cliente)
    {
        No no = new No();
        no.cliente = cliente;
        no.proximo = null;       

        if (proximo == null)
            primeiro = no;
        else
        {
          proximo.proximo = no;  
        }
        
        proximo = no;
    }
    
     public String exibeLista(){
        String str = "Lista Encadeada: ";
        
        No controle = primeiro;        
        boolean semProximo = (primeiro.proximo == null);
        
        if (semProximo)
            return null;
        
        while (!semProximo)
        {
           str+= "\n "+ controle.cliente.nome + "\n";
           controle = controle.proximo;
           semProximo = (controle.proximo == null);
        }        
       
        str+= "\n "+ controle.cliente.nome + "\n";
        
        return str + "\n";
    }
    
}
