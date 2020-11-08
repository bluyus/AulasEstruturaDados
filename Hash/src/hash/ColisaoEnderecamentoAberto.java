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
public class ColisaoEnderecamentoAberto {
    
    public char[] ArrayAscII;
    
    ColisaoEnderecamentoAberto()
    {
        this.ArrayAscII = new char[5];
    }
    
    public static Integer Hashing(char letra, int k) 
    {
        return ((int)letra % 5) + k;     
    }
    
    private Integer BuscarProximoEnderecoVazio(int indice)
    {
       for (Integer k = indice+1; k <= ArrayAscII.length-1; k++)
       {
         if (ArrayAscII[k] == '\u0000')  
         {
             return k;
         }
       }
       
       return null;
    }
    
    public void AdicionarElemento(char letra) throws Exception
    {
        Integer endereco = null;
        
        for (int k = 0; k < ArrayAscII.length-1; k++)
        {
             endereco = Hashing(letra, k);            
            
            if (ArrayAscII[endereco] == '\u0000')
               break;
            else
            {
                Integer proximoEndereco = BuscarProximoEnderecoVazio(endereco);
                
                if (proximoEndereco == null)
                {
                    // Repete a busca partindo do início da tabela e senão encontrar nada
                    // a tabela está cheia
                    proximoEndereco = BuscarProximoEnderecoVazio(-1);
                    if (proximoEndereco == null)
                        throw new Exception("Tabela cheia"); 
                }                    
                
                endereco = proximoEndereco;
                break;
            }
        }
        
        ArrayAscII[endereco] = letra;
    }   
}
