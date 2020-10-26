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
public class No {
    public int Valor;
    
    public No Esquerda;
    public No Direita;
    
    public No (int valor)
    {
        this.Valor = valor;
    }
    
    public void AdicionarNo(No no, int valor)
    {
        if (valor < no.Valor)
        {
            if (no.Esquerda == null)
                no.Esquerda = new No(valor);
            else
                AdicionarNo(no.Esquerda, valor);
        }
        else if (valor > no.Valor)
        {
            if (no.Direita == null)
                no.Direita = new No(valor);
            else
                AdicionarNo(no.Direita, valor);
        }
    }
    
    public No BuscarNo(No no, int valor)
    {
       if (no == null || no.Valor == valor)
           return no;
       
       if (no.Valor > valor)
        return BuscarNo(no.Esquerda, valor);   
       else
        return BuscarNo(no.Direita, valor);
    } 
    
    public void EmOrdem(No no){
       if(no != null){
        EmOrdem(no.Esquerda);
        System.out.println(no.Valor);
        EmOrdem(no.Direita);
       }
    }
    
     public void PreOrdem(No no){
       if(no != null){
        System.out.println(no.Valor);
        PreOrdem(no.Esquerda);        
        PreOrdem(no.Direita);
       }
    }
     
     public void PosOrdem(No no){
       if(no != null){        
        PosOrdem(no.Esquerda);        
        PosOrdem(no.Direita);
        System.out.println(no.Valor);
       }
    }
     
    private int Tamanho(No no) 
    { 
        if (no == null) 
           return 0; 
        else
        { 
            int tamanhoEsq = Tamanho(no.Esquerda); 
            int tamanhoDir = Tamanho(no.Direita); 
              
            if (tamanhoEsq > tamanhoDir) 
                return(tamanhoEsq + 1); 
            else 
                return(tamanhoDir + 1);  
        } 
    } 
     
    public void EmNivel(No no)
    {
        int tamanho = Tamanho(no); 
        int i; 
        for (i=1; i<=tamanho; i++) 
            ExibirNivel(no, i); 
    }
    
    private void ExibirNivel(No no ,int nivel) 
    { 
        if (no == null) 
            return; 
        if (nivel == 1) 
            System.out.println(no.Valor + " "); 
        else if (nivel > 1) 
        { 
            ExibirNivel(no.Esquerda, nivel-1); 
            ExibirNivel(no.Direita, nivel-1); 
        } 
    }  
}
