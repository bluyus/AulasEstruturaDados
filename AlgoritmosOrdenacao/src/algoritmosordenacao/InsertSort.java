/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmosordenacao;

/**
 *
 * @author Stefano
 */
public class InsertSort {
    public static void ordenar(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int chave = arr[i];
            int j = i - 1;
            
            // Mova os elementos do arr[0..i-1] que são maiores que a chave
            // uma posição à frente de sua posição atual
            while (j >= 0 && arr[j] > chave) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            arr[j + 1] = chave;
        }
    }
}
