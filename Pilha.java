public class Pilha {
    // Atributos privados
    private static int TAM_DEFAULT = 100;
    private int topoPilha;
    private int e[ ];

    // Métodos públicos
    public Pilha(int tamanho) { // construtor 1
    this.e = new int [tamanho];
    this.topoPilha = -1;
   }

    public Pilha() {// construtor 2
    this(TAM_DEFAULT);
    }

    //Verifica se a pilha
    //está vazia
    public boolean isEmpty() {
        if (this.topoPilha == -1)
            return true;
        else
            return false; 
    }

    // Verifica se a pilha está
    // cheia
    public boolean isFull() {
        if (this.topoPilha == this.e.length-1)
            return true;
        else
            return false; 
    }

    // insere um elemento e 
    // no topo da pilha
    public void push(int e) throws Exception{
        if (! this.isFull( ))
            this.e[++this.topoPilha] = e;
        else
            throw new Exception("Overflow - Estouro de Pilha");
    }

    //remove um elemento
    //do topo da pilha
    public int pop() throws Exception {
        if (! this.isEmpty( )){
            return this.e[this.topoPilha--];
        }
        else{
            throw new Exception( "Underflow -Esvaziamento de Pilha");
        }
    }

    public int topo() throws Exception {
        if ( ! this.isEmpty( ))
            return this.e[this.topoPilha];
        else{
            throw new Exception("Underlow -Esvaziamento de Pilha");
        }
    }

    // obtém o total de elementos
    //armazenados na Pilha
    public int sizeElements() {
        return topoPilha+1;
    }
}

