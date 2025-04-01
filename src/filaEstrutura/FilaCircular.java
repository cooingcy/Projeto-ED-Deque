package filaEstrutura;

public class FilaCircular {
    
 private Object[] Vetor;
    private int inicio = 0;
    private int fim = 0;
    private int tamanho = 0;
    

    public FilaCircular(){
         this.Vetor = new Object[3];
         this.inicio = 0;
         this.fim = 0;
         this.tamanho = 0;
    }

    public boolean Vazio(){
        return this.tamanho == 0;
    }

    public boolean  cheio(){
       return this.tamanho == Vetor.length;
    }

    public void enfileirar(Object valor){
      if(cheio()){
          System.out.println("Fila Cheia");
    }
     Vetor[fim] = valor;
     fim = (fim + 1) % Vetor.length;
     tamanho++;
   }

    public Object desenfileirar(){
        if(cheio()){
            System.out.println("Fila Cheia");
        }
        Object valor = Vetor[inicio];
        inicio =  (inicio + 1) % Vetor.length;
        tamanho--;
        return valor;      
    }

    public void imprimir(){
    if(Vazio()){
        System.out.println("Fila Vazia");
    }
    System.out.println("Fila: ");
       for(int i = 0; i < tamanho; i++){
         int valor = (inicio + i) % Vetor.length;
           System.out.print(Vetor[valor] + ", ");
       }
      }
    }
