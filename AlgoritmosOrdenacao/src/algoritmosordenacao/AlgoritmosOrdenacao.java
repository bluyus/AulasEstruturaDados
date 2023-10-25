/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmosordenacao;

/**
 *
 * @author Stefano
 */
public class AlgoritmosOrdenacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] array = {23, 4, 67, -8, 54, 21};        
        BubbleSort.ordenar(array);
        imprimirArray(array);
        
        int[] array2 = {23, 4, 67, -8, 54, 21};
        InsertSort.ordenar(array2);
        imprimirArray(array2);
        
        int[] array3 = {23, 4, 67, -8, 54, 21};
        SelectSort.ordenar(array3);
        imprimirArray(array3);
    }
    
    public static void imprimirArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}
