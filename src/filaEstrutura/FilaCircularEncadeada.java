package filaEstrutura;

import filaEstrutura.componente.No;

public class FilaCircularEncadeada {
    private No inicio;
    private No fim;

    public FilaCircularEncadeada(){
        this.inicio = null;
        this.fim = null;
    }

    public void enfileirar(Object item){
        No newNo = new No();
        newNo.setItem(item);
        if(vazio()){
            this.inicio = newNo;
            this.fim = newNo;
            newNo.setProximo(inicio);
        }
        newNo.setProximo(this.inicio);
        this.fim.setProximo(newNo);
        this.fim = newNo;
    }

    public Object desenfileirar() {
        if (vazio()) {
            System.out.println("A fila está vazia.");
            return null;
        }
        No removido = this.inicio;
        this.inicio = removido.getProximo();
        this.fim.setProximo(inicio);
        return removido.getItem();
    }
    

    public boolean vazio(){
        return inicio == null && fim == null;
    }
    
    public void imprime() {
        No auxiliar = inicio;

        do {
            System.out.print(auxiliar.getItem() + " | ");
            auxiliar = auxiliar.getProximo();
        } while (auxiliar != this.inicio);
        System.out.println("\n");
    }
}