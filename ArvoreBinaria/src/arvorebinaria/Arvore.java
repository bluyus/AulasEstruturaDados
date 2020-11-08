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
public class Arvore {
    
    public static void AdicionarNo(No no, int valor)
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
    
    public static No BuscarNo(No no, int valor)
    {
       if (no == null || no.Valor == valor)
           return no;
       
       if (no.Valor > valor)
        return BuscarNo(no.Esquerda, valor);   
       else
        return BuscarNo(no.Direita, valor);
    } 
    
    public static void EmOrdem(No no){
       if(no != null){
        EmOrdem(no.Esquerda);
        System.out.println(no.Valor);
        EmOrdem(no.Direita);
       }
    }
    
     public static void PreOrdem(No no){
       if(no != null){
        System.out.println(no.Valor);
        PreOrdem(no.Esquerda);        
        PreOrdem(no.Direita);
       }
    }
     
     public static void PreOrdem(No no, String[] informacao){
       if(no != null){
        System.out.println(informacao[no.Valor]);
        PreOrdem(no.Esquerda, informacao);        
        PreOrdem(no.Direita, informacao);
       }
    }
     
     public static void PosOrdem(No no){
       if(no != null){        
        PosOrdem(no.Esquerda);        
        PosOrdem(no.Direita);
        System.out.println(no.Valor);
       }
    }
     
     private static int Tamanho(No no) 
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
     
    public static void EmNivel(No no)
    {
        int tamanho = Tamanho(no); 
        int i; 
        for (i=1; i<=tamanho; i++) 
            ExibirNivel(no, i); 
    }
    
    private static void ExibirNivel(No no ,int nivel) 
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
