package dequeEstrutura.componente;

public class No {
    private Object item;
    private No proximo;
    
    public Object getItem() {
        return item;
    }
    public No getProximo() {
        return proximo;
    }
    public void setItem(Object item) {
        this.item = item;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    
}
