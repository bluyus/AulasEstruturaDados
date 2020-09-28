/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filas;

/**
 *
 * @author Stefano
 */
public class Fila {
    private No comeco;
    private No fim;
    
    public void enqueue(Cliente cliente){

        No novo = new No();
        novo.cliente = cliente;

        if(this.fim == null){
            this.comeco = novo;
            this.fim = this.comeco;
        }
        else {
            this.fim.proximo = novo;
            this.fim = novo;
        }
    }
    
    public void dequeue (){
        if (comeco == fim){
            fim = null;
        }
        
       if (this.comeco.proximo != null)         
        comeco = this.comeco.proximo;
    }  
    
    public Cliente getProximo() {
        return comeco.cliente;
    }
}
