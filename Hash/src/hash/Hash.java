/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

/**
 *
 * @author Stefano
 */
public class Hash {
    
    public static Integer Hashing(int matricula) 
    {
        int valor = matricula - 9711200;
        
        if (valor > 0 && valor < 99)
            return valor;
        else
            return null;      
    }
    
    public static void HashingPerfeito() 
    {
      Aluno[] ArrayAlunos = new Aluno[100];

        Aluno al1 = new Aluno();
        al1.Nome = "João";
        al1.Matricula = 9711232;

        ArrayAlunos[Hashing(al1.Matricula)] = al1;    
    }
    
    public static void HashingColisaoListaEncadeada()
    {
        ColisaoListaEncadeada cle = new ColisaoListaEncadeada();
        
        cle.AdicionarElemento('M');
        cle.AdicionarElemento('Á');
        cle.AdicionarElemento('R');
        cle.AdicionarElemento('I');
        cle.AdicionarElemento('O');     
    }
    
    public static void HashingColisaoEnderecamentoAberto() throws Exception
    {
        ColisaoEnderecamentoAberto cea = new ColisaoEnderecamentoAberto();
        
        cea.AdicionarElemento('M');
        cea.AdicionarElemento('Á');
        cea.AdicionarElemento('R');
        cea.AdicionarElemento('I');
        cea.AdicionarElemento('O');     
    }
    
    public static void main(String[] args) {
        
        HashingPerfeito();
        HashingColisaoListaEncadeada();  
        
        try
        {
            HashingColisaoEnderecamentoAberto();
        }
        catch(Exception e)
        {
           System.out.println(e.getMessage());
        }            
    }
    
}
