/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmosordenacao;

/**
 *
 * @author Stefano
 */
public class SelectSort {
    
    public static void ordenar(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            // Encontre o índice do menor elemento no subarray não ordenado
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            
            // Troque o elemento atual com o elemento mínimo encontrado
            int temp = arr[i];
            arr[i] = arr[indiceMinimo];
            arr[indiceMinimo] = temp;
        }
    }
    
}
