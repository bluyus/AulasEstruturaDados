/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhas;

/**
 *
 * @author Stefano
 */
public class Pilha {
    
    private No base;
	
    public void empilhar(Cliente c) 
    {
        No novo = new No();
        novo.cliente = c;
        novo.proximo = null;

        if (base == null) {
            base = novo;
        } else {
            No topo = encontrarUltimo();
            topo.proximo = novo; 
        }
    }

    private No encontrarUltimo() {
        No auxiliar = base;

        while (auxiliar.proximo != null) {
            auxiliar = auxiliar.proximo;
        }
        return auxiliar;
    }
    
    public Cliente desempilhar() {
		
        Cliente cliente;

        if (base.proximo == null) { 
            cliente = base.cliente;
            base = null;
        } else { 
            No penultimo = encontrarPenultimo();
            cliente = penultimo.proximo.cliente;
            penultimo.proximo = null;
        }

        return cliente;
    }
    
    protected No encontrarPenultimo() {
        No auxiliar = base;
        while (auxiliar.proximo.proximo != null) {
                auxiliar = auxiliar.proximo;
        }
        return auxiliar;
    }
    
}
