/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmosordenacao;

/**
 *
 * @author Stefano
 */
public class BubbleSort {
   
    public static void ordenar(int[] arr) {
        int n = arr.length;
        boolean trocou;
        
        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Troca os elementos arr[j] e arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    trocou = true;
                }
            }
            
            // Se nenhum elemento foi trocado na passagem interna, o array já está ordenado
            if (!trocou) {
                break;
            }
        }
    } 
}
