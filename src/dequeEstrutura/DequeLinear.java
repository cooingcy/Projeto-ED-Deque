package dequeEstrutura;

public class DequeLinear {
    private Object[] objetos;
    private int totalDeObjetos;
    private int inicio;
    private int fim;
    private int contItens;

    public DequeLinear() {
        objetos = new Object[5]; 
        totalDeObjetos = 0;
        contItens = 0;
        inicio = 0;
        fim = 0;
    }

    public void enfileiraD(Object objeto) {
        if (contItens == objetos.length) {
            System.out.println("Deque cheio! Realinhando elementos...");
            redimensionar();
        }
        objetos[fim] = objeto;
        fim = (fim + 1) % objetos.length;
        totalDeObjetos++;
        contItens++;
    }

    public void enfileiraE(Object objeto) {
        if (contItens == objetos.length) {
            System.out.println("Deque cheio! Realinhando elementos...");
            redimensionar();
        }
        inicio = (inicio - 1 + objetos.length);
        objetos[inicio] = objeto;
        totalDeObjetos++;
        contItens++;
    }

    public Object desenfileiraD() {
        if (vazio()) {
            System.out.println("Deque vazio!");
            return null;
        }
        Object valor = objetos[inicio];
        objetos[inicio] = null;
        inicio = (inicio + 1) % objetos.length;
        totalDeObjetos--;
        return valor;
    }

    public Object desenfileiraE() {
        if (vazio()) {
            System.out.println("Deque vazio!");
            return null;
        }
        fim = (fim - 1 + objetos.length) % objetos.length;
        Object valor = objetos[fim];
        objetos[fim] = null;
        totalDeObjetos--;
        return valor;
    }

    private void redimensionar() {
        for (int i = 0; i < totalDeObjetos; i++) {
            objetos[i] = objetos[inicio + i];
        }
        inicio = 0;
        fim = totalDeObjetos;
        contItens = totalDeObjetos;
    }

    public void imprime() {
        for (int i = 0; i < totalDeObjetos; i++) {
            System.out.print(objetos[(inicio + i) % objetos.length] + " | ");
        }
        System.out.println();
    }

    public Object primeiro() {
        if (vazio()) {
            return null;
        }
        return objetos[inicio];
    }

    public Object ultimo() {
        if (vazio()) {
            return null;
        }
        return objetos[(fim - 1 + objetos.length) % objetos.length];
    }

    public int tamanho() {
        return totalDeObjetos;
    }

    public boolean vazio() {
        return totalDeObjetos == 0;
    }
}