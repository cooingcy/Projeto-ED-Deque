import dequeEstrutura.DequeEncadeado;
import dequeEstrutura.DequeLinear;
import filaEstrutura.FilaCircular;
import filaEstrutura.FilaCircularEncadeada;

public class App {
    public static void main(String[] args) throws Exception {
        //Teste com o Deque Composto
        DequeEncadeado dequeComposto = new DequeEncadeado();
        System.out.println("----------------------------------------------");
        System.out.println("Deque Composto");
        System.out.println("Add no Inicio :");
        dequeComposto.EnqueueL("A");
        dequeComposto.EnqueueL("B");
        dequeComposto.EnqueueL("C");
        System.out.println("----------------------------------------------");
        System.out.println("Add no Final:");
        dequeComposto.EnqueueR("D");
        dequeComposto.imprime();

        System.out.println("----------------------------------------------");
        System.out.println("Tirando dados com o Deque Composto");
        dequeComposto.DequeueL();
        dequeComposto.DequeueR();
        dequeComposto.imprime();
        System.out.println("----------------------------------------------");

        System.out.println("\n");
        System.out.println("\n");
        

        DequeLinear dequeLinear = new DequeLinear();
        System.out.println("----------------------------------------------");
        System.out.println("Deque Linear");
        dequeLinear.enfileiraD("1");  
        dequeLinear.enfileiraD("2"); 
        dequeLinear.enfileiraD("3"); 
        dequeLinear.enfileiraE("5");

        System.out.println("----------------------------------------------");
        dequeLinear.imprime();
        System.out.println("----------------------------------------------");
        System.out.println("Tirar Deque (FIFO)");
        dequeLinear.desenfileiraD();
        dequeLinear.imprime();
        System.out.println("----------------------------------------------");
        System.out.println("Tirar Deque");
        dequeLinear.desenfileiraD();
        dequeLinear.imprime();
        System.out.println("----------------------------------------------");
        dequeLinear.enfileiraD("6"); 
        dequeLinear.enfileiraD("7"); 
        dequeLinear.enfileiraD("8"); 
        dequeLinear.imprime();

        System.out.println("\n");
        FilaCircular filazinha = new FilaCircular();
        System.out.println("----------------------------------------------");
        System.out.println("Fila Circular");
        System.out.println("----------------------------------------------");
        System.out.println("Está cheio?" +filazinha.cheio());
        System.out.println("----------------------------------------------");
        System.out.println("Está vazio?" +filazinha.Vazio());

        System.out.println("----------------------------------------------");
        System.out.println("Add dados");
        System.out.println("----------------------------------------------");
        filazinha.enfileirar("A");
        filazinha.imprimir();
        System.out.println("----------------------------------------------");
        filazinha.enfileirar("B");
        filazinha.imprimir();
        System.out.println("----------------------------------------------");
        filazinha.enfileirar("C");
        filazinha.imprimir();

        System.out.println("----------------------------------------------");
        System.out.println("Está cheio? " +filazinha.cheio());
        System.out.println("----------------------------------------------");
        System.out.println("Está vazio? " +filazinha.Vazio());

        System.out.println("----------------------------------------------");
        System.out.println("Removido foi: " +filazinha.desenfileirar());
        System.out.println("Removido foi: " +filazinha.desenfileirar());
        System.out.println("----------------------------------------------");
        filazinha.imprimir();

        System.out.println("\n");
        FilaCircularEncadeada filaCircularEncadeada = new FilaCircularEncadeada();
        System.out.println("----------------------------------------------");
        System.out.println("Fila Circular Encadeada");
        System.out.println("----------------------------------------------");
        System.out.println("Add dados");
        System.out.println("----------------------------------------------");
        filaCircularEncadeada.enfileirar("A");
        filaCircularEncadeada.imprime();
        System.out.println("----------------------------------------------");
        filaCircularEncadeada.enfileirar("B");
        filaCircularEncadeada.imprime();
        System.out.println("----------------------------------------------");
        filaCircularEncadeada.enfileirar("C");
        filaCircularEncadeada.imprime();

        System.out.println("----------------------------------------------");
        System.out.println("Removido foi: " +filaCircularEncadeada.desenfileirar());
        System.out.println("Removido foi: " +filaCircularEncadeada.desenfileirar());
        System.out.println("----------------------------------------------");
        filaCircularEncadeada.imprime();



    }
}