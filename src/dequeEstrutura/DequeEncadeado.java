package dequeEstrutura;

import dequeEstrutura.componente.No;

public class DequeEncadeado {
    private No inicio;
    private No fim;

    public DequeEncadeado() {
        this.inicio = null;
        this.fim = null;
    }

    public void EnqueueL(Object item) {
        No novoNo = new No();
        novoNo.setItem(item);
        if (vazio()) { // Inicia o Deque
            inicio = novoNo;
            fim = novoNo;
            return;
        }
        // Caso já exista algum item, irá o colocar como próximo ao novo
        novoNo.setProximo(inicio);
        inicio = novoNo;

    }

    // Coloca o item no fim do Deque
    // Caso o Deque esteja vazio, o item será o primeiro e último
    public void EnqueueR(Object item) {
        No novoNo = new No();
        novoNo.setItem(item);
        if (vazio()) {
            fim = novoNo;
            inicio = novoNo;
            return;
        } 
        fim.setProximo(novoNo); //Coloca o novo item como próximo do atual
        fim = novoNo;
    }
    
    public Object DequeueR() throws Exception {
        if (vazio()) {
            throw new Exception("A fila esta vazia");
        }

        //VOU FAZER O DEQUEUE L o de baixo no caso
 
        if (inicio.getProximo() == null) { // Se o Deque tiver apenas um item
            Object removido = inicio.getItem(); 
            inicio = null; 
            fim = null;
            return removido; 
        }

        No atual = inicio; 
        while (atual.getProximo() != fim) { 
            atual = atual.getProximo(); 
        }

        Object removido = atual.getProximo().getItem(); 
        atual.setProximo(null); // Remove o último item
        fim = atual; // Atualiza o fim para o novo últio item 
        return removido;
    }

    public Object DequeueL() throws Exception {
        if (vazio()) {
            throw new Exception("A fila está vazia");
        }

        if (inicio.getProximo() == null) {
            Object ultimoItem = inicio.getItem();
            inicio = null;
            fim = null;
            return ultimoItem;
        }

        No removido = inicio;
        inicio = removido.getProximo();
        Object itemremovido = removido.getItem();
        
        return itemremovido;
    }

    public boolean vazio() {
        return (inicio == null);
    }

    public void imprime() {
        No auxiliar = inicio;

        while (auxiliar != null) {
            System.out.print(auxiliar.getItem() + " | ");
            auxiliar = auxiliar.getProximo();
        }
        System.out.println("\n");
    }
}
