/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscas;

/**
 *
 * @author Stefano
 */
public class Buscas {

    /**
     * @param args the command line arguments
     */
    
    public static int BuscaSequencial(int valor, int[] vetor)
    {
        for (int i = 0; i <= vetor.length-1; i++)
        {
            if (vetor[i] == valor)
            {
                System.out.println("Encontrou na posição " + i);
                return i;
            }
        }
        
        System.out.println("Não encontrou");
        return -1;
    }
    
    public static int BuscaBinaria(int valor, int vetor[])
    {
     int inferior = 0;
     int superior = vetor.length-1;
     int meio;
     
     while (inferior <= superior)
     {
          meio = (inferior + superior)/2;
          if (valor == vetor[meio])
          {
              System.out.println("Encontrou na posição " + meio);
               return meio;
          }
          if (valor < vetor[meio])
               superior = meio-1;
          else
               inferior = meio+1;
     }
     
     System.out.println("Não encontrou");
     return -1;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] vetor = new int[6];
        
        vetor[0] = 1;
        vetor[1] = 51;
        vetor[2] = 12;
        vetor[3] = 87;
        vetor[4] = 2;
        vetor[5] = 3;
        
        BuscaSequencial(3, vetor);
        BuscaSequencial(73, vetor);
        
        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 3;
        vetor[3] = 12;
        vetor[4] = 51;
        vetor[5] = 87;        
        
        BuscaBinaria(3, vetor);
        BuscaBinaria(73, vetor);
    }  
}
